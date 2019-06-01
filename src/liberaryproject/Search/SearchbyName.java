/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liberaryproject.Search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import liberaryproject.Menu.SearchBooks;

/**
 *
 * @author amans
 */
public class SearchbyName extends javax.swing.JFrame {

    /**
     * Creates new form SearchbyCode
     */
    public SearchbyName() {
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
        detailPannel = new javax.swing.JPanel();
        bookNameforSearchLabel = new javax.swing.JLabel();
        booknameforsearch = new javax.swing.JTextField();
        accessionNumberLabel = new javax.swing.JLabel();
        claasnumberLabel = new javax.swing.JLabel();
        accessionNumberfield = new javax.swing.JTextField();
        classNumberField = new javax.swing.JTextField();
        bookNameLabel = new javax.swing.JLabel();
        authorNameLabel = new javax.swing.JLabel();
        bookNameField = new javax.swing.JTextField();
        authotNameField = new javax.swing.JTextField();
        editionLabel = new javax.swing.JLabel();
        editionField = new javax.swing.JTextField();
        columnNumberLabel = new javax.swing.JLabel();
        columnNumberField = new javax.swing.JTextField();
        rowNumberLabel = new javax.swing.JLabel();
        rowNumberField = new javax.swing.JTextField();
        CountLabel = new javax.swing.JLabel();
        countTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        titlelabel = new javax.swing.JLabel();

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
                .addGap(19, 19, 19)
                .addComponent(indiraButton, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        indiraPannelLayout.setVerticalGroup(
            indiraPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indiraPannelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(indiraButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        detailPannel.setBackground(new java.awt.Color(153, 255, 153));
        detailPannel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bookNameforSearchLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bookNameforSearchLabel.setText("Book Name:");

        booknameforsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booknameforsearchMouseClicked(evt);
            }
        });

        accessionNumberLabel.setText("Accession No. :");

        claasnumberLabel.setText("Class No. :");

        accessionNumberfield.setBackground(new java.awt.Color(153, 255, 153));
        accessionNumberfield.setBorder(null);

        classNumberField.setBackground(new java.awt.Color(153, 255, 153));
        classNumberField.setBorder(null);

        bookNameLabel.setText("Book Name:");

        authorNameLabel.setText("Author Name:");

        bookNameField.setBackground(new java.awt.Color(153, 255, 153));
        bookNameField.setBorder(null);

        authotNameField.setBackground(new java.awt.Color(153, 255, 153));
        authotNameField.setBorder(null);

        editionLabel.setText("Edition:");

        editionField.setBackground(new java.awt.Color(153, 255, 153));
        editionField.setBorder(null);

        columnNumberLabel.setText("Column No.:");

        columnNumberField.setBackground(new java.awt.Color(153, 255, 153));
        columnNumberField.setBorder(null);
        columnNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnNumberFieldActionPerformed(evt);
            }
        });

        rowNumberLabel.setText("Row No.:");

        rowNumberField.setBackground(new java.awt.Color(153, 255, 153));
        rowNumberField.setBorder(null);

        CountLabel.setText("Count:");

        countTextField.setBackground(new java.awt.Color(153, 255, 153));
        countTextField.setToolTipText("");
        countTextField.setBorder(null);

        javax.swing.GroupLayout detailPannelLayout = new javax.swing.GroupLayout(detailPannel);
        detailPannel.setLayout(detailPannelLayout);
        detailPannelLayout.setHorizontalGroup(
            detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPannelLayout.createSequentialGroup()
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPannelLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(bookNameforSearchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(booknameforsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailPannelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(claasnumberLabel)
                            .addComponent(accessionNumberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailPannelLayout.createSequentialGroup()
                                .addComponent(classNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(authorNameLabel)
                                    .addComponent(editionLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editionField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(authotNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(detailPannelLayout.createSequentialGroup()
                                .addComponent(accessionNumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bookNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(bookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(columnNumberLabel)
                            .addComponent(rowNumberLabel)
                            .addComponent(CountLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rowNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(columnNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(countTextField))))
                .addGap(23, 23, 23))
        );
        detailPannelLayout.setVerticalGroup(
            detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookNameforSearchLabel)
                    .addComponent(booknameforsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accessionNumberLabel)
                    .addComponent(accessionNumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNameLabel)
                    .addComponent(bookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CountLabel)
                    .addComponent(countTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPannelLayout.createSequentialGroup()
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(claasnumberLabel)
                            .addComponent(classNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorNameLabel)
                            .addComponent(authotNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editionLabel)
                            .addComponent(editionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(detailPannelLayout.createSequentialGroup()
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(columnNumberLabel)
                            .addComponent(columnNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(detailPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rowNumberLabel)
                            .addComponent(rowNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        accessionNumberLabel.getAccessibleContext().setAccessibleName("Accession No.:");
        bookNameLabel.getAccessibleContext().setAccessibleName("");
        authorNameLabel.getAccessibleContext().setAccessibleName("");
        rowNumberLabel.getAccessibleContext().setAccessibleName("");

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_25px.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        titlelabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titlelabel.setText("Search by Name");
        titlelabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indiraPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(detailPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titlelabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(indiraPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titlelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(detailPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indiraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiraButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indiraButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        SearchBooks searchBooks =new SearchBooks();
        searchBooks.setVisible(true);
        
        //To change the window
        SearchbyName searchbyName = new SearchbyName();
        searchbyName.setVisible(false);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void booknameforsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booknameforsearchMouseClicked
        // TODO add your handling code here:
        // String no=booknameforsearch.getText();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost/liberaryproject","root", "");
            System.out.print("Database is connected!!");
            String selectSQL = "select * from books where `BookTitle`=?";
            PreparedStatement ps = con.prepareStatement(selectSQL);
            ps.setString(1, booknameforsearch.getText());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                //Retrieve by column name
                 String ano = rs.getString(1);
                 String cno = rs.getString(2);
                 String booktitle = rs.getString(3);
                 String aname = rs.getString(4);
                 String edition = rs.getString(5);
                 String count = rs.getString(6);
                 String rowno= rs.getString(7);
                 String columnno = rs.getString(8);
                 System.out.println("Accession No : " + ano);
                 System.out.println("Class No : " + cno);
                 System.out.println("Book Title : " + booktitle);
                 System.out.println("Author Name : " + aname);
                 System.out.println("Edition : " + edition);
                 System.out.println("Count : " + count);
                 System.out.println("Row No : " + rowno);
                 System.out.println("Column No : " + columnno);
                                  //Display values
                 accessionNumberfield.setText(ano);
                 classNumberField.setText(cno);
                 bookNameField.setText(booktitle);
                 authotNameField.setText(aname);
                 editionField.setText(edition);
                 countTextField.setText(count);
                 rowNumberField.setText(rowno);
                 columnNumberField.setText(columnno);
      }
      rs.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Book Updated");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SearchbyName.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_booknameforsearchMouseClicked

    private void columnNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnNumberFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SearchbyName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchbyName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchbyName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchbyName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchbyName().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CountLabel;
    private javax.swing.JLabel accessionNumberLabel;
    private javax.swing.JTextField accessionNumberfield;
    private javax.swing.JLabel authorNameLabel;
    private javax.swing.JTextField authotNameField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bookNameField;
    private javax.swing.JLabel bookNameLabel;
    private javax.swing.JLabel bookNameforSearchLabel;
    private javax.swing.JTextField booknameforsearch;
    private javax.swing.JLabel claasnumberLabel;
    private javax.swing.JTextField classNumberField;
    private javax.swing.JTextField columnNumberField;
    private javax.swing.JLabel columnNumberLabel;
    private javax.swing.JTextField countTextField;
    private javax.swing.JPanel detailPannel;
    private javax.swing.JTextField editionField;
    private javax.swing.JLabel editionLabel;
    private javax.swing.JButton indiraButton;
    private javax.swing.JPanel indiraPannel;
    private javax.swing.JTextField rowNumberField;
    private javax.swing.JLabel rowNumberLabel;
    private javax.swing.JLabel titlelabel;
    // End of variables declaration//GEN-END:variables
}
