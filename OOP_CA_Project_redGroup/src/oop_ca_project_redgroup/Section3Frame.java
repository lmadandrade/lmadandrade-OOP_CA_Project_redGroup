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


    /**
     * Creates new form Section3Frame
     */
    public Section3Frame() {
        initComponents();
    records = new ArrayList<>();
    records.add(new UserS3("John Doe", 30, 70.0, 1.75, "Moderate", "Lose Weight"));
    records.add(new HealthDetailsS3(10000, 2000, 2000, "Running", 60, 8, "Good"));
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
    int totalSteps = 0, totalCaloriesIn = 0, totalCaloriesOut = 0, totalSleep = 0, healthRecordCount = 0;

    for (Object record : records) {
        if (record instanceof HealthDetailsS3) {
            HealthDetailsS3 healthRecord = (HealthDetailsS3) record;
            totalSteps += healthRecord.getSteps();
            totalCaloriesIn += healthRecord.getCaloriesIn();
            totalCaloriesOut += healthRecord.getCaloriesOut();
            totalSleep += healthRecord.getSleepHours();
            healthRecordCount++;
        }
    }

    if (healthRecordCount == 0) return "No health data available.\n";

    return "=== STATISTICAL SUMMARY ===\n" +
           "Average Steps: " + (totalSteps / healthRecordCount) + "\n" +
           "Total Calories In: " + totalCaloriesIn + "\n" +
           "Total Calories Out: " + totalCaloriesOut + "\n" +
           "Average Sleep Hours: " + (totalSleep / healthRecordCount) + "\n";
}

 private String findBestPerformances() {
    HealthDetailsS3 maxStepsRecord = null;
    HealthDetailsS3 maxCaloriesBurnedRecord = null;
    HealthDetailsS3 maxSleepRecord = null;

    int maxSteps = 0, maxCaloriesBurned = 0, maxSleep = 0;

    for (Object record : records) {
        if (record instanceof HealthDetailsS3) {
            HealthDetailsS3 healthRecord = (HealthDetailsS3) record;

            if (healthRecord.getSteps() > maxSteps) {
                maxSteps = healthRecord.getSteps();
                maxStepsRecord = healthRecord;
            }

            if (healthRecord.getCaloriesOut() > maxCaloriesBurned) {
                maxCaloriesBurned = healthRecord.getCaloriesOut();
                maxCaloriesBurnedRecord = healthRecord;
            }

            if (healthRecord.getSleepHours() > maxSleep) {
                maxSleep = healthRecord.getSleepHours();
                maxSleepRecord = healthRecord;
            }
        }
    }

    return "=== BEST PERFORMANCES ===\n" +
           (maxStepsRecord != null ? "Most Steps: " + maxSteps + " (" + maxStepsRecord.getExerciseType() + ")\n" : "No steps data.\n") +
           (maxCaloriesBurnedRecord != null ? "Most Calories Burned: " + maxCaloriesBurned + " (" + maxCaloriesBurnedRecord.getExerciseType() + ")\n" : "No calorie data.\n") +
           (maxSleepRecord != null ? "Longest Sleep: " + maxSleep + " hours\n" : "No sleep data.\n");
}

 private void saveReportAsCSV(String filename) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
        writer.println("Type,Details");
        for (Object record : records) {
            if (record instanceof UserS3) {
                writer.println("User," + ((UserS3) record).getDetails().replace("\n", " "));
            } else if (record instanceof HealthDetailsS3) {
                writer.println("Health," + ((HealthDetailsS3) record).getDetails().replace("\n", " "));
            }
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
        new RedGroup_LandingPageGUI().setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_homeButtonSection3ActionPerformed

    private void viewProgressButton_Section3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProgressButton_Section3ActionPerformed
   StringBuilder output = new StringBuilder();

    // Dynamically call getDetails() for each record
    for (Object record : records) {
        if (record instanceof UserS3) {
            output.append(((UserS3) record).getDetails()).append("\n");
        } else if (record instanceof HealthDetailsS3) {
            output.append(((HealthDetailsS3) record).getDetails()).append("\n");
        }
    }

    // Display data in the output area
    TextArea1Section3.setText(output.toString());


    }//GEN-LAST:event_viewProgressButton_Section3ActionPerformed

    private void generateReportButton_Section3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportButton_Section3ActionPerformed
 
    StringBuilder report = new StringBuilder("===== REPORT =====\n");

    // Dynamically call getDetails() for each record
    for (Object record : records) {
        if (record instanceof UserS3) {
            report.append(((UserS3) record).getDetails()).append("\n");
        } else if (record instanceof HealthDetailsS3) {
            report.append(((HealthDetailsS3) record).getDetails()).append("\n");
        }
    }

    // Append statistical summary and best performances
    String stats = generateStatisticalSummary();
    report.append(stats).append("\n");

    String bestPerformances = findBestPerformances();
    report.append(bestPerformances).append("\n");

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
