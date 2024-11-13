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

    /**
     * Creates new form Section2Frame
     */
    public Section2Frame() {
        initComponents();
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

        sleepQuality_Section2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addButton_Section2.setText("Add");
        addButton_Section2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton_Section2ActionPerformed(evt);
            }
        });

        summaryButton_Section2.setText("Summary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
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
                                .addComponent(addButton_Section2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                                .addComponent(summaryButton_Section2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(healthOverviewSection2_Label)))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(healthOverviewSection2_Label)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(steps_Section2Label)
                    .addComponent(steps_Section2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(water_Section2Label)
                    .addComponent(water_Section2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton_Section2)
                    .addComponent(summaryButton_Section2))
                .addGap(31, 31, 31))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_addButton_Section2ActionPerformed

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
    private javax.swing.JLabel calories_Section2Label;
    private javax.swing.JTextField calories_Section2Text;
    private javax.swing.JLabel duration_Section2Label;
    private javax.swing.JTextField duration_Section2Text;
    private javax.swing.JLabel healthOverviewSection2_Label;
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
