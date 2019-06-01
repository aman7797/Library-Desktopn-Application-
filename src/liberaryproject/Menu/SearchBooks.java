/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liberaryproject.Menu;

import liberaryproject.Search.SearchbyName;
import liberaryproject.Search.SearchbyAuthorName;
import liberaryproject.Search.SearchbyCode;

/**
 *
 * @author amans
 */
public class SearchBooks extends javax.swing.JFrame {

    /**
     * Creates new form SearchBooks
     */
    public SearchBooks() {
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
        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        menuPannel = new javax.swing.JPanel();
        searchbyNameButton = new javax.swing.JButton();
        searchByAuthorNameButton = new javax.swing.JButton();
        searchByCodeButton = new javax.swing.JButton();

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

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleLabel.setText("Search Book");

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_25px.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        menuPannel.setBackground(new java.awt.Color(153, 255, 153));
        menuPannel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchbyNameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Contacts_50px.png"))); // NOI18N
        searchbyNameButton.setText("Search By Name");
        searchbyNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbyNameButtonActionPerformed(evt);
            }
        });

        searchByAuthorNameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Name_50px.png"))); // NOI18N
        searchByAuthorNameButton.setText("Seach By Author Name");
        searchByAuthorNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByAuthorNameButtonActionPerformed(evt);
            }
        });

        searchByCodeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_50px_1.png"))); // NOI18N
        searchByCodeButton.setText("Search By Code");
        searchByCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByCodeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPannelLayout = new javax.swing.GroupLayout(menuPannel);
        menuPannel.setLayout(menuPannelLayout);
        menuPannelLayout.setHorizontalGroup(
            menuPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchByCodeButton)
                .addGap(28, 28, 28)
                .addComponent(searchbyNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchByAuthorNameButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPannelLayout.setVerticalGroup(
            menuPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbyNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByAuthorNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indiraPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(menuPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(indiraPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleLabel)
                .addGap(45, 45, 45)
                .addComponent(menuPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(backButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchByCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByCodeButtonActionPerformed

        SearchbyCode searchbyCode=new SearchbyCode();
        searchbyCode.setVisible(true);
        
        //To close the window
        SearchBooks searchBooks = new SearchBooks();
        searchBooks.setVisible(false);
        dispose();
        
    }//GEN-LAST:event_searchByCodeButtonActionPerformed

    private void indiraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiraButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indiraButtonActionPerformed

    private void searchbyNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbyNameButtonActionPerformed

        SearchbyName searchbyName=new SearchbyName();
        searchbyName.setVisible(true);
        
        SearchBooks searchBooks=new SearchBooks();
        searchBooks.setVisible(false);
        dispose();
        
                
                
    }//GEN-LAST:event_searchbyNameButtonActionPerformed

    private void searchByAuthorNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByAuthorNameButtonActionPerformed

        SearchbyAuthorName searchbyAuthorName=new SearchbyAuthorName();
        searchbyAuthorName.setVisible(true);
        
        SearchBooks searchBooks =new SearchBooks();
        searchBooks.setVisible(false);
        dispose();
    }//GEN-LAST:event_searchByAuthorNameButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        LiberarianMenu liberarianMenu=new LiberarianMenu();
        liberarianMenu.setVisible(true);
        
        SearchBooks searchBooks =new SearchBooks();
        searchBooks.setVisible(false);
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
            java.util.logging.Logger.getLogger(SearchBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SearchBooks().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton indiraButton;
    private javax.swing.JPanel indiraPannel;
    private javax.swing.JPanel menuPannel;
    private javax.swing.JButton searchByAuthorNameButton;
    private javax.swing.JButton searchByCodeButton;
    private javax.swing.JButton searchbyNameButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
