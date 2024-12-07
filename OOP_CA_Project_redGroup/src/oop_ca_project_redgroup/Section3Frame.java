/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
   package oop_ca_project_redgroup;

    import javax.swing.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.util.ArrayList;

    public class Section3Frame extends javax.swing.JFrame {
    private ArrayList<Object> records = null; // Unified list for polymorphism
    private HealthDataDB db;

    /**
     * Creates new form Section3Frame
     */
    public Section3Frame() {
        initComponents();
        db = new HealthDataDB(); // Initialize database
        db.getConnection(); // Connect to the database

        records = new ArrayList<>(); // Initialize records list

        // Fetch data from the database
        ArrayList<HealthRecord> healthRecords = db.getAllHealthData();
        records.addAll(healthRecords); // Add all records from the database

        // Populate TextArea with database records
        for (Object record : records) {
            TextArea1Section3.append(record.toString() + "\n");
        }
    }

    private void saveReportToFile(String filename, String report) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.write(report);
            JOptionPane.showMessageDialog(this, "Report saved successfully to " + filename);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving report: " + e.getMessage());
        }
    }
    
    private String generateUniqueFilename(String baseName, String extension) {
    int version = 2; // Start with version 2
    String filename = baseName + extension;
    
    // Check if the file exists, and if it does, append a version number
    while (new java.io.File(filename).exists()) {
        filename = baseName + "_v" + version + extension;
        version++;
    }
    
    return filename;
}
    
 private String generateStatisticalSummary() {
        db.getConnection(); // Ensure DB is connected
        String summary = String.format(
            "=== STATISTICAL SUMMARY ===\n" +
            "Average Steps: %.2f\n" +
            "Average Water Intake: %.2f L\n" +
            "Average Calories: %.2f\n" +
            "Most Frequent Activity: %s\n" +
            "Average Duration: %.2f hours\n" +
            "Average Sleep Hours: %.2f\n" +
            "Most Frequent Sleep Quality: %s\n",
            db.getAverageSteps(),
            db.getAverageWaterIntake(),
            db.getAverageCalories(),
            db.getMostFrequentActivityType(),
            db.getAverageDuration(),
            db.getAverageSleepHours(),
            db.getMostFrequentSleepQuality()
        );
        db.closeConnection();
        return summary;
    }
 
        private String findBestPerformances() {
        db.getConnection(); // Ensure DB is connected
        ArrayList<HealthRecord> healthRecords = db.getAllHealthData();
        db.closeConnection();

        HealthRecord maxStepsRecord = null, maxCaloriesRecord = null, maxSleepRecord = null;
        int maxSteps = 0;
        double maxCalories = 0, maxSleep = 0;

        for (HealthRecord record : healthRecords) {
            if (record.getSteps() > maxSteps) {
                maxSteps = record.getSteps();
                maxStepsRecord = record;
            }
            if (record.getCalories() > maxCalories) {
                maxCalories = record.getCalories();
                maxCaloriesRecord = record;
            }
            if (record.getSleepHours() > maxSleep) {
                maxSleep = record.getSleepHours();
                maxSleepRecord = record;
            }
        }

        return String.format(
            "=== BEST PERFORMANCES ===\n" +
            "Most Steps: %d (%s)\n" +
            "Most Calories Burned: %.2f\n" +
            "Longest Sleep: %.2f hours\n",
            maxSteps, maxStepsRecord != null ? maxStepsRecord.getActivityType() : "N/A",
            maxCalories, maxSleep
        );
    }


  private void saveReportAsCSV(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Type,Details");
            for (Object record : records) {
                writer.println(record.toString().replace("\n", " "));
            }

            writer.println("\n=== Summary ===");
            writer.println("Summary," + generateStatisticalSummary().replace("\n", " "));
            writer.println("Best Performances," + findBestPerformances().replace("\n", " "));

            JOptionPane.showMessageDialog(this, "CSV Report saved successfully to " + filename);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving CSV report: " + e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        report_Section3Label = new javax.swing.JLabel();
        viewProgressButton_Section3 = new javax.swing.JButton();
        generateReportButton_Section3 = new javax.swing.JButton();
        homeButtonSection3 = new javax.swing.JButton();
        ScrollPane1_Section3 = new javax.swing.JScrollPane();
        TextArea1Section3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        report_Section3Label.setText("Report");

        viewProgressButton_Section3.setText("View Progress");
        viewProgressButton_Section3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProgressButton_Section3ActionPerformed(evt);
            }
        });

        generateReportButton_Section3.setText("Generate Report");
        generateReportButton_Section3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportButton_Section3ActionPerformed(evt);
            }
        });

        homeButtonSection3.setText("Home");
        homeButtonSection3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonSection3ActionPerformed(evt);
            }
        });

        TextArea1Section3.setColumns(20);
        TextArea1Section3.setRows(5);
        ScrollPane1_Section3.setViewportView(TextArea1Section3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(report_Section3Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeButtonSection3)
                            .addComponent(generateReportButton_Section3)
                            .addComponent(viewProgressButton_Section3))
                        .addGap(18, 18, 18)
                        .addComponent(ScrollPane1_Section3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(report_Section3Label)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(viewProgressButton_Section3)
                        .addGap(53, 53, 53)
                        .addComponent(generateReportButton_Section3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(homeButtonSection3)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(ScrollPane1_Section3)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonSection3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonSection3ActionPerformed
        db.closeConnection(); // Close the database connection
        new RedGroup_LandingPageGUI().setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_homeButtonSection3ActionPerformed

    private void viewProgressButton_Section3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProgressButton_Section3ActionPerformed
      StringBuilder output = new StringBuilder();

        // Dynamically call getDetails() for each record
        for (Object record : records) {
            output.append(record.toString()).append("\n");
        }

        // Display data in the output area
        TextArea1Section3.setText(output.toString());
    }//GEN-LAST:event_viewProgressButton_Section3ActionPerformed

    private void generateReportButton_Section3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportButton_Section3ActionPerformed
 
      StringBuilder report = new StringBuilder("===== REPORT =====\n");

    // Fetch and add records from the database
    db.getConnection();
    ArrayList<HealthRecord> healthRecords = db.getAllHealthData();
    db.closeConnection();

    for (HealthRecord record : healthRecords) {
        report.append(record.toString()).append("\n");
    }

    // Append statistical summary and best performances
    report.append(generateStatisticalSummary()).append("\n");
    report.append(findBestPerformances()).append("\n");

    // File format selection logic
    int choice = JOptionPane.showOptionDialog(
        this,
        "Select report format:",
        "Export Report",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object[] { "TXT", "CSV" },
        "TXT"
    );

    if (choice == 0) { // TXT
        saveReportToFile("report.txt", report.toString());
    } else if (choice == 1) { // CSV
        saveReportAsCSV("report.csv");
    }

    }//GEN-LAST:event_generateReportButton_Section3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Section3Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Section3Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Section3Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Section3Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Section3Frame().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane1_Section3;
    private javax.swing.JTextArea TextArea1Section3;
    private javax.swing.JButton generateReportButton_Section3;
    private javax.swing.JButton homeButtonSection3;
    private javax.swing.JLabel report_Section3Label;
    private javax.swing.JButton viewProgressButton_Section3;
    // End of variables declaration//GEN-END:variables
}
