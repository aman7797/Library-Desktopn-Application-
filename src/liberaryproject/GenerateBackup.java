/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liberaryproject;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;
import javax.swing.JOptionPane;
import liberaryproject.Menu.LiberarianMenu;

/**
 *
 * @author amans
 */
public class GenerateBackup extends javax.swing.JFrame {

    /**
     * Creates new form GenerateBackup
     */
    public GenerateBackup() {
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

        indiarPannel = new javax.swing.JPanel();
        indiraButton = new javax.swing.JButton();
        backUpPannel = new javax.swing.JPanel();
        backUpButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        indiarPannel.setBackground(new java.awt.Color(18, 49, 113));

        indiraButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        indiraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indiraButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout indiarPannelLayout = new javax.swing.GroupLayout(indiarPannel);
        indiarPannel.setLayout(indiarPannelLayout);
        indiarPannelLayout.setHorizontalGroup(
            indiarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indiarPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(indiraButton, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        indiarPannelLayout.setVerticalGroup(
            indiarPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indiarPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(indiraButton, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        backUpPannel.setBackground(new java.awt.Color(153, 255, 153));
        backUpPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        backUpButton.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        backUpButton.setText("Generate Backup");
        backUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backUpButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(16);
        jTextArea1.setText("This will backup the whole data regarding Students Details,\nBooks and Borrowers.This can help to recover the data whenever system \nget corrupted or upgraded.\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout backUpPannelLayout = new javax.swing.GroupLayout(backUpPannel);
        backUpPannel.setLayout(backUpPannelLayout);
        backUpPannelLayout.setHorizontalGroup(
            backUpPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backUpPannelLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(backUpButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backUpPannelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        backUpPannelLayout.setVerticalGroup(
            backUpPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backUpPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(backUpButton)
                .addContainerGap())
        );

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleLabel.setText("Generate Backup");

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
            .addComponent(indiarPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backUpPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(indiarPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backUpPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        //To change the window
        GenerateBackup generateBackup = new GenerateBackup();
        generateBackup.setVisible(false);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void backUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backUpButtonActionPerformed
        // TODO add your handling code here:
        try {

        /*NOTE: Getting path to the Jar file being executed*/
        /*NOTE: YourImplementingClass-> replace with the class executing the code*/
        CodeSource codeSource = GenerateBackup.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();


        /*NOTE: Creating Database Constraints*/
        String dbName = "liberaryproject";
        String dbUser = "root";
        String dbPass = " ";

        /*NOTE: Creating Path Constraints for folder saving*/
        /*NOTE: Here the backup folder is created for saving inside it*/
        String folderPath = jarDir + "\\backup";

        /*NOTE: Creating Folder if it does not exist*/
        File f1 = new File(folderPath);
        f1.mkdir();

        /*NOTE: Creating Path Constraints for backup saving*/
        /*NOTE: Here the backup is saved in a folder called backup with the name backup.sql*/
         String savePath = "\"" + jarDir + "\\backup\\" + "backup.sql\"";

        /*NOTE: Used to create a cmd command*/
        String executeCmd = "mysqldump -u" + dbUser + " -p" + dbPass + " --database " + dbName + " -r " + savePath;

        /*NOTE: Executing the command here*/
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        int processComplete = runtimeProcess.waitFor();

        /*NOTE: processComplete=0 if correctly executed, will contain other values if not*/
        if (processComplete == 0) {
            System.out.println("Backup Complete");
            JOptionPane.showMessageDialog(null, "Backup Complete");
        } else {
            System.out.println("Backup Failure");
        }

    } catch (URISyntaxException | IOException | InterruptedException ex) {
        JOptionPane.showMessageDialog(null, "Error at Backuprestore" + ex.getMessage());
    }
    }//GEN-LAST:event_backUpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GenerateBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GenerateBackup().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton backUpButton;
    private javax.swing.JPanel backUpPannel;
    private javax.swing.JPanel indiarPannel;
    private javax.swing.JButton indiraButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}