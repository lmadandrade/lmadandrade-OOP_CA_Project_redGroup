

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_ca_project_redgroup;

/**
 *
 * @author lucasandrade
 */
public class Section2Frame extends javax.swing.JFrame {

    // Instance of HealthDataDB
    private HealthDataDB db;
    
    /**
     * Creates new form Section2Frame
     */
    public Section2Frame() {
        initComponents(); 
        db = new HealthDataDB(); // init the DB
        db.getConnection(); // Connect to the DB

        // placeholders to the fields
        addPlaceholder(steps_Section2Text, "Enter steps (e.g., 10000)");
        addPlaceholder(water_Section2Text, "Enter water intake (e.g., 2.5)");
        addPlaceholder(calories_Section2Text, "Enter calories (e.g., 2000)");
        addPlaceholder(duration_Section2Text, "Enter duration (e.g., 1.5)");
        addPlaceholder(sleep_Section2Text, "Enter sleep hours (e.g., 7.5)");

        // Set values for the dropdown list
        activityType_Section2ComboBox.setModel(
            new javax.swing.DefaultComboBoxModel<>(new String[]{"Select an activity", "Walking", "Running", "Cycling", "Swimming"}));
        sleepQuality_Section2ComboBox.setModel(
            new javax.swing.DefaultComboBoxModel<>(new String[]{"Select sleep quality", "Poor", "Fair", "Good", "Excellent"}));

        // windowListener for cleanup when app terminates
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                db.closeConnection(); // Ensure the database connection is closed
                System.exit(0); // Exit the application
            }
        });
    }

    // method to add placeholders
    private void addPlaceholder(javax.swing.JTextField field, String placeholder) {
        field.setText(placeholder);
        field.setForeground(java.awt.Color.GRAY);

        field.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (field.getText().equals(placeholder)) {
                    field.setText("");
                    field.setForeground(java.awt.Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (field.getText().isEmpty()) {
                    field.setForeground(java.awt.Color.GRAY);
                    field.setText(placeholder);
                }
            }
        });
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
        healthOverviewSection2_Label = new javax.swing.JLabel();
        steps_Section2Label = new javax.swing.JLabel();
        water_Section2Label = new javax.swing.JLabel();
        calories_Section2Label = new javax.swing.JLabel();
        sleep_Section2Label = new javax.swing.JLabel();
        activity_Section2Label = new javax.swing.JLabel();
        duration_Section2Label = new javax.swing.JLabel();
        sleepQuality_Section2Label = new javax.swing.JLabel();
        steps_Section2Text = new javax.swing.JTextField();
        water_Section2Text = new javax.swing.JTextField();
        calories_Section2Text = new javax.swing.JTextField();
        duration_Section2Text = new javax.swing.JTextField();
        sleep_Section2Text = new javax.swing.JTextField();
        activityType_Section2ComboBox = new javax.swing.JComboBox<>();
        sleepQuality_Section2ComboBox = new javax.swing.JComboBox<>();
        addButton_Section2 = new javax.swing.JButton();
        summaryButton_Section2 = new javax.swing.JButton();
        homeButtonSection2 = new javax.swing.JButton();
        addLabel_Section2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        healthOverviewSection2_Label.setText("Health Overview");

        steps_Section2Label.setText("Steps:");

        water_Section2Label.setText("Water intake:");

        calories_Section2Label.setText("Calories Intake:");

        sleep_Section2Label.setText("Sleep Hours:");

        activity_Section2Label.setText("Activity type:");

        duration_Section2Label.setText("Duration:");

        sleepQuality_Section2Label.setText("Sleep Quality");

        activityType_Section2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        activityType_Section2ComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                activityType_Section2ComboBoxItemStateChanged(evt);
            }
        });
        activityType_Section2ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityType_Section2ComboBoxActionPerformed(evt);
            }
        });

        sleepQuality_Section2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addButton_Section2.setText("Add");
        addButton_Section2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton_Section2ActionPerformed(evt);
            }
        });

        summaryButton_Section2.setText("Summary");
        summaryButton_Section2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryButton_Section2ActionPerformed(evt);
            }
        });

        homeButtonSection2.setText("Home");
        homeButtonSection2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonSection2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(steps_Section2Label)
                            .addComponent(water_Section2Label)
                            .addComponent(calories_Section2Label)
                            .addComponent(duration_Section2Label)
                            .addComponent(sleep_Section2Label)
                            .addComponent(activity_Section2Label)
                            .addComponent(sleepQuality_Section2Label))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sleep_Section2Text)
                            .addComponent(duration_Section2Text)
                            .addComponent(calories_Section2Text)
                            .addComponent(water_Section2Text)
                            .addComponent(steps_Section2Text)
                            .addComponent(activityType_Section2ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sleepQuality_Section2ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(healthOverviewSection2_Label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeButtonSection2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(summaryButton_Section2))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton_Section2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addLabel_Section2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(healthOverviewSection2_Label)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(steps_Section2Label)
                            .addComponent(steps_Section2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(homeButtonSection2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(water_Section2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(water_Section2Label))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calories_Section2Label)
                    .addComponent(calories_Section2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(activity_Section2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duration_Section2Label)
                            .addComponent(duration_Section2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sleep_Section2Label)
                            .addComponent(sleep_Section2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(activityType_Section2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sleepQuality_Section2Label)
                    .addComponent(sleepQuality_Section2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton_Section2)
                    .addComponent(summaryButton_Section2))
                .addGap(18, 18, 18)
                .addComponent(addLabel_Section2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activityType_Section2ComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_activityType_Section2ComboBoxItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_activityType_Section2ComboBoxItemStateChanged

    private void addButton_Section2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton_Section2ActionPerformed
     
        // Check if placeholders are still present in the fields
        if (steps_Section2Text.getText().equals("Enter steps (e.g., 10000)") ||
            water_Section2Text.getText().equals("Enter water intake (e.g., 2.5 L)") ||
            calories_Section2Text.getText().equals("Enter calories (e.g., 2000)") ||
            duration_Section2Text.getText().equals("Enter duration (e.g., 1.5 hours)") ||
            sleep_Section2Text.getText().equals("Enter sleep hours (e.g., 7.5)")) {

            // Show error if placeholders are not replaced
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter valid data in all fields!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; 
        }
        try {
            // user input into parse
            int steps = Integer.parseInt(steps_Section2Text.getText());
            double water = Double.parseDouble(water_Section2Text.getText());
            double calories = Double.parseDouble(calories_Section2Text.getText());
            String activityType = activityType_Section2ComboBox.getSelectedItem().toString();
            double duration = Double.parseDouble(duration_Section2Text.getText());
            double sleepHours = Double.parseDouble(sleep_Section2Text.getText());
            String sleepQuality = sleepQuality_Section2ComboBox.getSelectedItem().toString();

            // create and add HealthRecord to database
            HealthRecord record = new HealthRecord(steps, water, calories, activityType, duration, sleepHours, sleepQuality, null);
            db.addHealthData(record);


            // Show message in the label is inout is valid
            addLabel_Section2.setText("Data added successfully! Check summary for an overview.");
            addLabel_Section2.setForeground(java.awt.Color.GREEN); // color into the message
            } catch (NumberFormatException e) {
            // invalid input
            addLabel_Section2.setText("Please enter valid numeric data!");
            addLabel_Section2.setForeground(java.awt.Color.RED);
            } 
        
            addPlaceholder(steps_Section2Text, "Enter steps (e.g., 10000)");
            addPlaceholder(water_Section2Text, "Enter water intake (e.g., 2.5 L)");
            addPlaceholder(calories_Section2Text, "Enter calories (e.g., 2000)");
            addPlaceholder(duration_Section2Text, "Enter duration (e.g., 1.5 hours)");
            addPlaceholder(sleep_Section2Text, "Enter sleep hours (e.g., 7.5)");

    }//GEN-LAST:event_addButton_Section2ActionPerformed

    private void homeButtonSection2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonSection2ActionPerformed
        new RedGroup_LandingPageGUI().setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_homeButtonSection2ActionPerformed

    private void summaryButton_Section2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryButton_Section2ActionPerformed
        // get averages from the database
        double avgSteps = db.getAverageSteps();
        double avgWater = db.getAverageWaterIntake();
        double avgCalories = db.getAverageCalories();
        String mostFrequentActivity = db.getMostFrequentActivityType();
        double avgDuration = db.getAverageDuration();
        double avgSleepHours = db.getAverageSleepHours();
        String mostFrequentSleepQuality = db.getMostFrequentSleepQuality();

    // pass the calculated avg
    Section2FrameSummary summaryFrame = new Section2FrameSummary(
        avgSteps, avgWater, avgCalories, 
        mostFrequentActivity, avgDuration, 
        avgSleepHours, mostFrequentSleepQuality);

    summaryFrame.setVisible(true);
    this.dispose(); 

           
    }//GEN-LAST:event_summaryButton_Section2ActionPerformed

    private void activityType_Section2ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityType_Section2ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activityType_Section2ComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Section2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Section2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Section2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Section2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Section2Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> activityType_Section2ComboBox;
    private javax.swing.JLabel activity_Section2Label;
    private javax.swing.JButton addButton_Section2;
    private javax.swing.JLabel addLabel_Section2;
    private javax.swing.JLabel calories_Section2Label;
    private javax.swing.JTextField calories_Section2Text;
    private javax.swing.JLabel duration_Section2Label;
    private javax.swing.JTextField duration_Section2Text;
    private javax.swing.JLabel healthOverviewSection2_Label;
    private javax.swing.JButton homeButtonSection2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> sleepQuality_Section2ComboBox;
    private javax.swing.JLabel sleepQuality_Section2Label;
    private javax.swing.JLabel sleep_Section2Label;
    private javax.swing.JTextField sleep_Section2Text;
    private javax.swing.JLabel steps_Section2Label;
    private javax.swing.JTextField steps_Section2Text;
    private javax.swing.JButton summaryButton_Section2;
    private javax.swing.JLabel water_Section2Label;
    private javax.swing.JTextField water_Section2Text;
    // End of variables declaration//GEN-END:variables
}