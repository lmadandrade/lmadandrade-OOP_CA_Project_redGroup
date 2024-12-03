/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_ca_project_redgroup;

import java.util.ArrayList;

/**
 *
 * @author lucasandrade
 */
public class Section2FrameSummary extends javax.swing.JFrame {

    /**
     * Creates new form Section2FrameSummary
     */
    public Section2FrameSummary() {
    initComponents();
}
    public Section2FrameSummary(
    double avgSteps, double avgWater, double avgCalories, 
    String mostFrequentActivity, double avgDuration, 
    double avgSleepHours, String mostFrequentSleepQuality
) {
    initComponents();

    // Use String.format to limit decimal places to 2
    stepsAvg.setText("Average Steps: " + (avgSteps > 0 ? String.format("%.2f", avgSteps) : "No Data"));
    waterAvg.setText("Average Water Intake: " + (avgWater > 0 ? String.format("%.2f", avgWater) + " L" : "No Data"));
    caloriesAvg.setText("Average Calories: " + (avgCalories > 0 ? String.format("%.2f", avgCalories) : "No Data"));
    favActivityType.setText("Most Frequent Activity: " + (mostFrequentActivity != null && !mostFrequentActivity.isEmpty() ? mostFrequentActivity : "No Data"));
    durationAvg.setText("Average Duration: " + (avgDuration > 0 ? String.format("%.2f", avgDuration) : "No Data"));
    sleepAvg.setText("Average Sleep Hours: " + (avgSleepHours > 0 ? String.format("%.2f", avgSleepHours) : "No Data"));
    sleepQualityAvg.setText("Most Frequent Sleep Quality: " + (mostFrequentSleepQuality != null && !mostFrequentSleepQuality.isEmpty() ? mostFrequentSleepQuality : "No Data"));
    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        healthSummaryLabel = new javax.swing.JLabel();
        stepsAvg = new javax.swing.JLabel();
        waterAvg = new javax.swing.JLabel();
        caloriesAvg = new javax.swing.JLabel();
        favActivityType = new javax.swing.JLabel();
        durationAvg = new javax.swing.JLabel();
        sleepAvg = new javax.swing.JLabel();
        sleepQualityAvg = new javax.swing.JLabel();
        backButtonSection2 = new javax.swing.JButton();
        summaryTimeframeSelector = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        healthSummaryLabel.setText("Health Summary");

        stepsAvg.setText("jLabel1");

        waterAvg.setText("jLabel2");

        caloriesAvg.setText("jLabel3");

        favActivityType.setText("jLabel4");

        durationAvg.setText("jLabel5");

        sleepAvg.setText("jLabel6");

        sleepQualityAvg.setText("jLabel1");

        backButtonSection2.setText("Back");
        backButtonSection2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonSection2ActionPerformed(evt);
            }
        });

        summaryTimeframeSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Today", "Past 7 Days", "Past 30 Days", "All Time" }));
        summaryTimeframeSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryTimeframeSelectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sleepQualityAvg)
                    .addComponent(sleepAvg)
                    .addComponent(durationAvg)
                    .addComponent(favActivityType)
                    .addComponent(caloriesAvg)
                    .addComponent(waterAvg)
                    .addComponent(stepsAvg)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(healthSummaryLabel)
                        .addGap(95, 95, 95)
                        .addComponent(summaryTimeframeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButtonSection2)
                .addGap(206, 206, 206))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthSummaryLabel)
                    .addComponent(summaryTimeframeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(stepsAvg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waterAvg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caloriesAvg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(favActivityType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(durationAvg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sleepAvg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sleepQualityAvg)
                .addGap(12, 12, 12)
                .addComponent(backButtonSection2)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonSection2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonSection2ActionPerformed
        Section2Frame section2Frame = new Section2Frame(); // Create a new instance of the main frame
    section2Frame.setVisible(true); // Display the main frame
    this.dispose(); // Close the current summary frame
    }//GEN-LAST:event_backButtonSection2ActionPerformed

    private void summaryTimeframeSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryTimeframeSelectorActionPerformed
            // Fetch the selected timeframe from the dropdown
        String selectedTimeframe = summaryTimeframeSelector.getSelectedItem().toString();

        // Fetch the filtered data from the database
        HealthDataDB db = new HealthDataDB();
        db.getConnection();
        ArrayList<HealthRecord> records = db.getHealthDataByTimeframe(selectedTimeframe);
        db.closeConnection();

        // Recalculate and update summary metrics
        double avgSteps = calculateAverageSteps(records);
        double avgWater = calculateAverageWater(records);
        double avgCalories = calculateAverageCalories(records);
        String mostFrequentActivity = calculateMostFrequentActivity(records);
        double avgDuration = calculateAverageDuration(records);
        double avgSleepHours = calculateAverageSleepHours(records);
        String mostFrequentSleepQuality = calculateMostFrequentSleepQuality(records);

        // Update UI components
        stepsAvg.setText("Average Steps: " + (avgSteps > 0 ? String.format("%.2f", avgSteps) : "No Data"));
        waterAvg.setText("Average Water Intake: " + (avgWater > 0 ? String.format("%.2f", avgWater) + " L" : "No Data"));
        caloriesAvg.setText("Average Calories: " + (avgCalories > 0 ? String.format("%.2f", avgCalories) : "No Data"));
        favActivityType.setText("Most Frequent Activity: " + (mostFrequentActivity != null && !mostFrequentActivity.isEmpty() ? mostFrequentActivity : "No Data"));
        durationAvg.setText("Average Duration: " + (avgDuration > 0 ? String.format("%.2f", avgDuration) : "No Data"));
        sleepAvg.setText("Average Sleep Hours: " + (avgSleepHours > 0 ? String.format("%.2f", avgSleepHours) : "No Data"));
        sleepQualityAvg.setText("Most Frequent Sleep Quality: " + (mostFrequentSleepQuality != null && !mostFrequentSleepQuality.isEmpty() ? mostFrequentSleepQuality : "No Data"));
    }//GEN-LAST:event_summaryTimeframeSelectorActionPerformed

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
            java.util.logging.Logger.getLogger(Section2FrameSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Section2FrameSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Section2FrameSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Section2FrameSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Section2FrameSummary().setVisible(true);
            }
        });
    }
    
            // Helper methods for calculations

        private double calculateAverageSteps(ArrayList<HealthRecord> records) {
            return records.stream().mapToInt(HealthRecord::getSteps).average().orElse(0);
        }

        private double calculateAverageWater(ArrayList<HealthRecord> records) {
            return records.stream().mapToDouble(HealthRecord::getWaterIntake).average().orElse(0);
        }

        private double calculateAverageCalories(ArrayList<HealthRecord> records) {
            return records.stream().mapToDouble(HealthRecord::getCalories).average().orElse(0);
        }

        private String calculateMostFrequentActivity(ArrayList<HealthRecord> records) {
            return records.stream()
                .map(HealthRecord::getActivityType)
                .filter(type -> type != null && !type.isEmpty())
                .collect(java.util.stream.Collectors.groupingBy(type -> type, java.util.stream.Collectors.counting()))
                .entrySet()
                .stream()
                .max(java.util.Map.Entry.comparingByValue())
                .map(java.util.Map.Entry::getKey)
                .orElse("No Data");
        }

        private double calculateAverageDuration(ArrayList<HealthRecord> records) {
            return records.stream().mapToDouble(HealthRecord::getDuration).average().orElse(0);
        }

        private double calculateAverageSleepHours(ArrayList<HealthRecord> records) {
            return records.stream().mapToDouble(HealthRecord::getSleepHours).average().orElse(0);
        }

        private String calculateMostFrequentSleepQuality(ArrayList<HealthRecord> records) {
            return records.stream()
                .map(HealthRecord::getSleepQuality)
                .filter(quality -> quality != null && !quality.isEmpty())
                .collect(java.util.stream.Collectors.groupingBy(quality -> quality, java.util.stream.Collectors.counting()))
                .entrySet()
                .stream()
                .max(java.util.Map.Entry.comparingByValue())
                .map(java.util.Map.Entry::getKey)
                .orElse("No Data");
        }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtonSection2;
    private javax.swing.JLabel caloriesAvg;
    private javax.swing.JLabel durationAvg;
    private javax.swing.JLabel favActivityType;
    private javax.swing.JLabel healthSummaryLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sleepAvg;
    private javax.swing.JLabel sleepQualityAvg;
    private javax.swing.JLabel stepsAvg;
    private javax.swing.JComboBox<String> summaryTimeframeSelector;
    private javax.swing.JLabel waterAvg;
    // End of variables declaration//GEN-END:variables
}
