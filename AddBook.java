/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arpit Harod
 */
public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtpublisher = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Book Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 340, 53));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 178, 120, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Book Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 260, 120, 28));

        btnclose.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arpit Harod\\OneDrive\\Documents\\NetBeansProjects\\LibraryManagementSystem\\src\\icons\\closeee.jpg")); // NOI18N
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 0, 51, 44));

        txtid.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 190, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Publisher");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 120, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 120, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Publisher Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 160, 28));

        txtname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 190, 30));

        txtpublisher.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtpublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpublisherActionPerformed(evt);
            }
        });
        getContentPane().add(txtpublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 190, 30));

        txtprice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 190, 30));

        txtdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 190, 30));

        btnsave.setBackground(new java.awt.Color(204, 0, 0));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText(" Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 90, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arpit Harod\\OneDrive\\Documents\\NetBeansProjects\\LibraryManagementSystem\\src\\icons\\9.book-stack-library-room-blurred-bookshelf-background_42691-514.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpublisherActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if(txtid.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Field is Required");
            txtid.requestFocus();
        }
        else if(txtname.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Field is Required");
            txtname.requestFocus();
        }
        else if(txtpublisher.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Field is Required");
            txtpublisher.requestFocus();
        }
        else if(txtprice.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Field is Required");
            txtprice.requestFocus();
        }
        else if(txtdate.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Field is Required");
            txtdate.requestFocus();
        }
        else{
            Connection conn=Connect.Connection();
            try {
                PreparedStatement pst=conn.prepareStatement("Insert into book(id,name,publisher,price,year,status) values(?,?,?,?,?,?)");
                pst.setString(1,txtid.getText());
                pst.setString(2,txtname.getText());
                pst.setString(3,txtpublisher.getText());
                pst.setString(4,txtprice.getText());
                pst.setString(5,txtdate.getText());
                pst.setString(6,"Not-Issued");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Record Saved");
                txtid.setText("");
                txtname.setText("");
                txtpublisher.setText("");
                txtprice.setText("");
                txtdate.setText("");
                
            } catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnsaveActionPerformed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpublisher;
    // End of variables declaration//GEN-END:variables
}
