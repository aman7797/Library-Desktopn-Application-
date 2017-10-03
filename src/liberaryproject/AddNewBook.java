
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liberaryproject;

/**
 *
 * @author amans
 */
public class AddNewBook extends javax.swing.JFrame {

    /**
     * Creates new form AddNewBook
     */
    public AddNewBook() {
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
        primaryPsnnel = new javax.swing.JPanel();
        accessionNumberLabel = new javax.swing.JLabel();
        accessionNumberfield = new javax.swing.JTextField();
        classNumberLabel = new javax.swing.JLabel();
        classNumberField = new javax.swing.JTextField();
        detailPannel = new javax.swing.JPanel();
        bookTitleField = new javax.swing.JTextField();
        authorNameField = new javax.swing.JTextField();
        editionField = new javax.swing.JTextField();
        bookTitleLabel = new javax.swing.JLabel();
        authorNameLabel = new javax.swing.JLabel();
        editionLabel = new javax.swing.JLabel();
        addressPannel = new javax.swing.JPanel();
        countLabel = new javax.swing.JLabel();
        rowLabel = new javax.swing.JLabel();
        columnLabel = new javax.swing.JLabel();
        bookSelfNumberField = new javax.swing.JTextField();
        rowNumberfield = new javax.swing.JTextField();
        columnNumberfield = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 153));

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
                .addContainerGap(19, Short.MAX_VALUE))
        );
        indiraPannelLayout.setVerticalGroup(
            indiraPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indiraPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(indiraButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        primaryPsnnel.setBackground(new java.awt.Color(153, 255, 153));
        primaryPsnnel.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        accessionNumberLabel.setText("Accession no.:");

        classNumberLabel.setText("Class No.:");

        javax.swing.GroupLayout primaryPsnnelLayout = new javax.swing.GroupLayout(primaryPsnnel);
        primaryPsnnel.setLayout(primaryPsnnelLayout);
        primaryPsnnelLayout.setHorizontalGroup(
            primaryPsnnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primaryPsnnelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(primaryPsnnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accessionNumberLabel)
                    .addComponent(classNumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(primaryPsnnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accessionNumberfield, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        primaryPsnnelLayout.setVerticalGroup(
            primaryPsnnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primaryPsnnelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(primaryPsnnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accessionNumberLabel)
                    .addComponent(accessionNumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(primaryPsnnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classNumberLabel)
                    .addComponent(classNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        detailPannel.setBackground(new java.awt.Color(153, 255, 153));
        detailPannel.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        bookTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTitleFieldActionPerformed(evt);
            }
        });

        bookTitleLabel.setText("Book Title:");

        authorNameLabel.setText("Author Name:");

        editionLabel.setText("Edition:");
        editionLabel.setToolTipText("");

        javax.swing.GroupLayout detailPannelLayout = new javax.swing.GroupLayout(detailPannel);
        detailPannel.setLayout(detailPannelLayout);
        detailPannelLayout.setHorizontalGroup(
            detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookTitleLabel)
                    .addComponent(authorNameLabel)
                    .addComponent(editionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(authorNameField)
                    .addComponent(editionField)
                    .addComponent(bookTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        detailPannelLayout.setVerticalGroup(
            detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPannelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookTitleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editionLabel))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        addressPannel.setBackground(new java.awt.Color(153, 255, 153));
        addressPannel.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        countLabel.setText("Count:");

        rowLabel.setText("Row No.:");

        columnLabel.setText("Column No.:");

        rowNumberfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rowNumberfieldActionPerformed(evt);
            }
        });

        columnNumberfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnNumberfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addressPannelLayout = new javax.swing.GroupLayout(addressPannel);
        addressPannel.setLayout(addressPannelLayout);
        addressPannelLayout.setHorizontalGroup(
            addressPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addressPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countLabel)
                    .addComponent(rowLabel)
                    .addComponent(columnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addressPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addressPannelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(columnNumberfield))
                    .addComponent(bookSelfNumberField)
                    .addComponent(rowNumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        addressPannelLayout.setVerticalGroup(
            addressPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressPannelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(addressPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addressPannelLayout.createSequentialGroup()
                        .addComponent(bookSelfNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rowNumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addressPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(columnNumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(columnLabel)))
                    .addGroup(addressPannelLayout.createSequentialGroup()
                        .addComponent(countLabel)
                        .addGap(18, 18, 18)
                        .addComponent(rowLabel)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        addButton.setFont(new java.awt.Font("Tahoma", 1, 12));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Checkmark_25px_1.png"))); // NOI18N
        addButton.setText("Add");

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24));
        titleLabel.setText("Add New Book");

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
                .addGap(21, 21, 21)
                .addComponent(primaryPsnnel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(detailPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(addressPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(558, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(addButton)
                .addGap(315, 315, 315))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(indiraPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titleLabel)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(detailPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primaryPsnnel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addressPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addButton)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indiraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiraButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indiraButtonActionPerformed

    private void bookTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTitleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTitleFieldActionPerformed

    private void rowNumberfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rowNumberfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rowNumberfieldActionPerformed

    private void columnNumberfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnNumberfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnNumberfieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        ManageBooks manageBooks=new ManageBooks();
        manageBooks.setVisible(true);
        
        //To close the current window 
    AddNewBook addNewBook= new AddNewBook();
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
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accessionNumberLabel;
    private javax.swing.JTextField accessionNumberfield;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addressPannel;
    private javax.swing.JTextField authorNameField;
    private javax.swing.JLabel authorNameLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bookSelfNumberField;
    private javax.swing.JTextField bookTitleField;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JTextField classNumberField;
    private javax.swing.JLabel classNumberLabel;
    private javax.swing.JLabel columnLabel;
    private javax.swing.JTextField columnNumberfield;
    private javax.swing.JLabel countLabel;
    private javax.swing.JPanel detailPannel;
    private javax.swing.JTextField editionField;
    private javax.swing.JLabel editionLabel;
    private javax.swing.JButton indiraButton;
    private javax.swing.JPanel indiraPannel;
    private javax.swing.JPanel primaryPsnnel;
    private javax.swing.JLabel rowLabel;
    private javax.swing.JTextField rowNumberfield;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
