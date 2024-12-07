/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_ca_project_redgroup;

/**
 *
 * @author lucasandrade
 */
public class HealthRecommendations extends javax.swing.JFrame {

    /**
     * Creates new form HealthRecommendations
     */
    public HealthRecommendations() {
        initComponents();
        
        generateRecommendations();
    }


    private void generateRecommendations() {
        HealthDataDB db = new HealthDataDB();
    try {
        db.getConnection();

        // get the user profile
        UserProfile profile = db.getUserProfile();
        if (profile == null) {
            // If no user profile is found, display messages and exit the method
            nutritionValueLabel.setText("No data available.");
            exerciseValueLabel.setText("No data available.");
            hydrationValueLabel.setText("No data available.");
            sleepValueLabel.setText("No data available.");
            activityValueLabel.setText("No data available.");
            healthValueLabel.setText("No data available.");
            return;
        }

        // get health data
        double avgSteps = db.getAverageSteps();
        double avgWaterIntake = db.getAverageWaterIntake();
        double avgSleepHours = db.getAverageSleepHours();

        // water Recommendation
        String hydrationRecommendation;
        if (avgWaterIntake >= 2) {
            hydrationRecommendation = "Your water intake is satisfactory. Keep it up!";
        } else {
            hydrationRecommendation = String.format("You should drink %.1f more liters of water daily.", 2 - avgWaterIntake);
        }

        // sleep recommendation
        String sleepRecommendation;
        if (avgSleepHours >= 8) {
            sleepRecommendation = "Your sleep schedule is excellent. Keep it consistent!";
        } else {
            sleepRecommendation = String.format("Try to get %.1f more hours of sleep per night.", 8 - avgSleepHours);
        }

        // Activity level Recommendation
        String activityEnhancement;
        if ("Sedentary".equalsIgnoreCase(profile.getActivityLevel())) {
            activityEnhancement = "Start with light activities such as walking 30 minutes daily.";
        } else if ("Weight Loss".equalsIgnoreCase(profile.getGoal())) {
            activityEnhancement = "Focus on cardio exercises like running or cycling to support weight loss.";
        } else if ("Muscle Gain".equalsIgnoreCase(profile.getGoal())) {
            activityEnhancement = "Incorporate strength training exercises to build muscle.";
        } else {
            activityEnhancement = "Maintain a balanced mix of cardio and strength training.";
        }

        // nutrition Recommendation
        String nutritionRecommendation = "Maintain a balanced diet.";
        if ("Weight Loss".equalsIgnoreCase(profile.getGoal())) {
            nutritionRecommendation = "Focus on a calorie deficit with high protein and low carbs.";
        } else if ("Muscle Gain".equalsIgnoreCase(profile.getGoal())) {
            nutritionRecommendation = "Increase protein intake and ensure a calorie surplus.";
        } else if ("Improved Health".equalsIgnoreCase(profile.getGoal())) {
            nutritionRecommendation = "Ensure you're eating a variety of fruits, vegetables, and whole grains.";

        }

        // Health Goal Alignment
        String healthGoalAlignment;
        if ("Weight Loss".equalsIgnoreCase(profile.getGoal())) {
            healthGoalAlignment = "Track your calorie intake and maintain a calorie deficit.";
        } else if ("Muscle Gain".equalsIgnoreCase(profile.getGoal())) {
            healthGoalAlignment = "Focus on strength training and consuming protein-rich meals.";
        } else {
            healthGoalAlignment = "Maintain a balanced lifestyle to support your overall health.";

        }

        // Update the labels
        nutritionValueLabel.setText(nutritionRecommendation);
        exerciseValueLabel.setText(activityEnhancement); 
        hydrationValueLabel.setText(hydrationRecommendation);
        sleepValueLabel.setText(sleepRecommendation);
        activityValueLabel.setText(activityEnhancement);
        healthValueLabel.setText(healthGoalAlignment);

    } catch (Exception e) {
        // unexpected exceptions
        nutritionValueLabel.setText("Error retrieving data.");
        exerciseValueLabel.setText("Error retrieving data.");
        hydrationValueLabel.setText("Error retrieving data.");
        sleepValueLabel.setText("Error retrieving data.");
        activityValueLabel.setText("Error retrieving data.");
        healthValueLabel.setText("Error retrieving data.");
        e.printStackTrace();
        
            } finally {
                db.closeConnection();
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

        jPanel1 = new javax.swing.JPanel();
        nutritionLabel = new javax.swing.JLabel();
        exerciseLabel = new javax.swing.JLabel();
        hydrationLabel = new javax.swing.JLabel();
        sleepLabel = new javax.swing.JLabel();
        activityLabel = new javax.swing.JLabel();
        healthGoalLabel = new javax.swing.JLabel();
        nutritionValueLabel = new javax.swing.JLabel();
        exerciseValueLabel = new javax.swing.JLabel();
        hydrationValueLabel = new javax.swing.JLabel();
        sleepValueLabel = new javax.swing.JLabel();
        activityValueLabel = new javax.swing.JLabel();
        healthValueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nutritionLabel.setText("Nutrition Recommendations:");

        exerciseLabel.setText("Exercise Recommendations:");

        hydrationLabel.setText("Hydration Tips:");

        sleepLabel.setText("Sleep Recommendations:");

        activityLabel.setText("Activity Level Enhancements:");

        healthGoalLabel.setText("Health Goal Alignment:");

        jLabel1.setText("Your Health Recommendations:");

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nutritionLabel)
                            .addComponent(exerciseLabel)
                            .addComponent(hydrationLabel)
                            .addComponent(sleepLabel)
                            .addComponent(activityLabel)
                            .addComponent(healthGoalLabel))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nutritionValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exerciseValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hydrationValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sleepValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(activityValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(healthValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homeButton)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nutritionLabel)
                    .addComponent(nutritionValueLabel))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exerciseLabel)
                    .addComponent(exerciseValueLabel))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hydrationLabel)
                    .addComponent(hydrationValueLabel))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sleepLabel)
                    .addComponent(sleepValueLabel))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activityLabel)
                    .addComponent(activityValueLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthGoalLabel)
                    .addComponent(healthValueLabel))
                .addGap(18, 18, 18)
                .addComponent(homeButton)
                .addGap(17, 17, 17))
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

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        new RedGroup_LandingPageGUI().setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HealthRecommendations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthRecommendations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthRecommendations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthRecommendations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthRecommendations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityLabel;
    private javax.swing.JLabel activityValueLabel;
    private javax.swing.JLabel exerciseLabel;
    private javax.swing.JLabel exerciseValueLabel;
    private javax.swing.JLabel healthGoalLabel;
    private javax.swing.JLabel healthValueLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel hydrationLabel;
    private javax.swing.JLabel hydrationValueLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nutritionLabel;
    private javax.swing.JLabel nutritionValueLabel;
    private javax.swing.JLabel sleepLabel;
    private javax.swing.JLabel sleepValueLabel;
    // End of variables declaration//GEN-END:variables
}
