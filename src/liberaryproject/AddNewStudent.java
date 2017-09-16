/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddNewStudent.java
 *
 * Created on Sep 15, 2017, 12:23:30 PM
 */
package liberaryproject;

/**
 *
 * @author Rozi Roti
 */
public class AddNewStudent extends javax.swing.JFrame {

    /** Creates new form AddNewStudent */
    public AddNewStudent() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        indiraPannel = new javax.swing.JPanel();
        indiraButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        detailsPannel = new javax.swing.JPanel();
        studentIDdaLabel = new javax.swing.JLabel();
        studentNameLabel = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        batchLabel = new javax.swing.JLabel();
        mobileNumberLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        studentNameField = new javax.swing.JTextField();
        studentIdField1 = new javax.swing.JTextField();
        departmentField = new javax.swing.JTextField();
        batchField = new javax.swing.JTextField();
        mobileNumberField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        addButton = new javax.swing.JButton();
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

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 24));
        titleLabel.setText("Add New Student");

        detailsPannel.setBackground(new java.awt.Color(153, 255, 153));
        detailsPannel.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        studentIDdaLabel.setText("Student ID:");

        studentNameLabel.setText("Student Name:");

        departmentLabel.setText("Department");

        batchLabel.setText("Batch:");

        mobileNumberLabel.setText("Mobile No:");

        emailLabel.setText("Email:");

        passwordLabel.setText("Password");

        studentNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameFieldActionPerformed(evt);
            }
        });

        studentIdField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdField1ActionPerformed(evt);
            }
        });

        departmentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentFieldActionPerformed(evt);
            }
        });

        batchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchFieldActionPerformed(evt);
            }
        });

        mobileNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileNumberFieldActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        passwordField.setText("jPasswordField1");

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Checkmark_25px_1.png"))); // NOI18N

        javax.swing.GroupLayout detailsPannelLayout = new javax.swing.GroupLayout(detailsPannel);
        detailsPannel.setLayout(detailsPannelLayout);
        detailsPannelLayout.setHorizontalGroup(
            detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPannelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(detailsPannelLayout.createSequentialGroup()
                        .addComponent(studentNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailsPannelLayout.createSequentialGroup()
                        .addComponent(studentIDdaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(studentIdField1))
                    .addGroup(detailsPannelLayout.createSequentialGroup()
                        .addGroup(detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departmentLabel)
                            .addComponent(batchLabel)
                            .addComponent(mobileNumberLabel)
                            .addComponent(emailLabel)
                            .addComponent(passwordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(mobileNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(batchField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(departmentField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(addButton)
                            .addComponent(passwordField, 0, 0, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        detailsPannelLayout.setVerticalGroup(
            detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPannelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIDdaLabel)
                    .addComponent(studentIdField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameLabel)
                    .addComponent(studentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentLabel)
                    .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batchLabel)
                    .addComponent(batchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNumberLabel)
                    .addComponent(mobileNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addButton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(502, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton)
                .addGap(149, 149, 149)
                .addComponent(detailsPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(indiraPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(detailsPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(backButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void indiraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiraButtonActionPerformed
        
}//GEN-LAST:event_indiraButtonActionPerformed

private void studentNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameFieldActionPerformed
    
}//GEN-LAST:event_studentNameFieldActionPerformed

private void studentIdField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdField1ActionPerformed

}//GEN-LAST:event_studentIdField1ActionPerformed

private void departmentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentFieldActionPerformed

}//GEN-LAST:event_departmentFieldActionPerformed

private void batchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchFieldActionPerformed

}//GEN-LAST:event_batchFieldActionPerformed

private void mobileNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileNumberFieldActionPerformed

}//GEN-LAST:event_mobileNumberFieldActionPerformed

private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed

}//GEN-LAST:event_emailFieldActionPerformed

private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

    ManageStudents manageStudents=new ManageStudents();
    manageStudents.setVisible(true);
    
    //To close the current window 
    AddNewBook addNewBook=new AddNewBook();
    addNewBook.setVisible(false);
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
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddNewStudent().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField batchField;
    private javax.swing.JLabel batchLabel;
    private javax.swing.JTextField departmentField;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JPanel detailsPannel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton indiraButton;
    private javax.swing.JPanel indiraPannel;
    private javax.swing.JTextField mobileNumberField;
    private javax.swing.JLabel mobileNumberLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel studentIDdaLabel;
    private javax.swing.JTextField studentIdField1;
    private javax.swing.JTextField studentNameField;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
