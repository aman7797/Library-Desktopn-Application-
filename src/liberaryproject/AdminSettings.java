/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liberaryproject;

import liberaryproject.Menu.LiberarianMenu;

/**
 *
 * @author amans
 */
public class AdminSettings extends javax.swing.JFrame {

    /**
     * Creates new form AdminSettings
     */
    public AdminSettings() {
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

        indiraPannel = new javax.swing.JPanel();
        indiraButton = new javax.swing.JButton();
        passwordPannel = new javax.swing.JPanel();
        toChangeCurrentPasswordLabel = new javax.swing.JLabel();
        currentPasswordField = new javax.swing.JPasswordField();
        toChangeNewPasswordLabel = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JPasswordField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        confirmButton = new javax.swing.JButton();
        informationPannel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        currentPasswordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        submitButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        informationLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        indiraPannel.setBackground(new java.awt.Color(18, 49, 113));

        indiraButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        indiraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indiraButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout indiraPannelLayout = new javax.swing.GroupLayout(indiraPannel);
        indiraPannel.setLayout(indiraPannelLayout);
        indiraPannelLayout.setHorizontalGroup(
            indiraPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indiraPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(indiraButton, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        indiraPannelLayout.setVerticalGroup(
            indiraPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indiraPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(indiraButton, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        passwordPannel.setBackground(new java.awt.Color(153, 255, 153));
        passwordPannel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordPannel.setToolTipText("");

        toChangeCurrentPasswordLabel.setText("Current Password");

        currentPasswordField.setText("jPasswordField1");

        toChangeNewPasswordLabel.setText("New Password");

        newPasswordField.setText("jPasswordField1");

        confirmPasswordLabel.setText("Confirm Password");

        confirmPasswordField.setText("jPasswordField1");

        confirmButton.setText("Confirm");

        javax.swing.GroupLayout passwordPannelLayout = new javax.swing.GroupLayout(passwordPannel);
        passwordPannel.setLayout(passwordPannelLayout);
        passwordPannelLayout.setHorizontalGroup(
            passwordPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPannelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(passwordPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmButton)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordLabel)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toChangeNewPasswordLabel)
                    .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toChangeCurrentPasswordLabel))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        passwordPannelLayout.setVerticalGroup(
            passwordPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPannelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(toChangeCurrentPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toChangeNewPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        informationPannel.setBackground(new java.awt.Color(153, 255, 153));
        informationPannel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        userNameLabel.setText("Username");

        nameLabel.setText("Name");

        emailLabel.setText("Email");

        currentPasswordLabel.setText("Current Password");
        currentPasswordLabel.setToolTipText("");

        passwordField.setText("jPasswordField1");

        submitButton.setText("Submit");

        javax.swing.GroupLayout informationPannelLayout = new javax.swing.GroupLayout(informationPannel);
        informationPannel.setLayout(informationPannelLayout);
        informationPannelLayout.setHorizontalGroup(
            informationPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPannelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(informationPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitButton)
                    .addGroup(informationPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(currentPasswordLabel)
                        .addComponent(emailLabel)
                        .addComponent(nameLabel)
                        .addComponent(userNameLabel)
                        .addComponent(userNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(emailField)
                        .addComponent(passwordField)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        informationPannelLayout.setVerticalGroup(
            informationPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addContainerGap())
        );

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordLabel.setText("Password");

        informationLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        informationLabel.setText("Information");

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleLabel.setText("Admin Settings");
        titleLabel.setToolTipText("");

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_25px.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indiraPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(informationLabel)
                    .addComponent(informationPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(indiraPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleLabel)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(informationLabel)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informationPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indiraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiraButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indiraButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        LiberarianMenu liberarianMenu=new LiberarianMenu();
        liberarianMenu.setVisible(true);
        
        //To close the Window
        AdminSettings adminSettings = new AdminSettings();
        adminSettings.setVisible(false);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField currentPasswordField;
    private javax.swing.JLabel currentPasswordLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton indiraButton;
    private javax.swing.JPanel indiraPannel;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JPanel informationPannel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel passwordPannel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel toChangeCurrentPasswordLabel;
    private javax.swing.JLabel toChangeNewPasswordLabel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
