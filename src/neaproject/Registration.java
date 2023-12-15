/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neaproject;

import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author amakod
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    

    
    
    
    public Registration() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        editFirstname = new javax.swing.JTextField();
        EditEmail = new javax.swing.JTextField();
        EditPassword = new javax.swing.JTextField();
        EditCPassword = new javax.swing.JTextField();
        editSurname = new javax.swing.JTextField();
        EditPhone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Brand");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(357, 357, 357))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        editFirstname.setForeground(new java.awt.Color(153, 153, 153));
        editFirstname.setText("Firstname*");
        editFirstname.setToolTipText("Enter your First name");
        editFirstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editFirstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editFirstnameFocusLost(evt);
            }
        });
        editFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFirstnameActionPerformed(evt);
            }
        });

        EditEmail.setForeground(new java.awt.Color(153, 153, 153));
        EditEmail.setText("Email*");
        EditEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditEmailFocusLost(evt);
            }
        });
        EditEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEmailActionPerformed(evt);
            }
        });

        EditPassword.setForeground(new java.awt.Color(153, 153, 153));
        EditPassword.setText("Password*");
        EditPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditPasswordFocusLost(evt);
            }
        });
        EditPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPasswordActionPerformed(evt);
            }
        });

        EditCPassword.setForeground(new java.awt.Color(153, 153, 153));
        EditCPassword.setText("Confirm Password*");
        EditCPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditCPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditCPasswordFocusLost(evt);
            }
        });

        editSurname.setForeground(new java.awt.Color(153, 153, 153));
        editSurname.setText("Surname*");
        editSurname.setToolTipText("");
        editSurname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        editSurname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editSurnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editSurnameFocusLost(evt);
            }
        });
        editSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSurnameActionPerformed(evt);
            }
        });

        EditPhone.setForeground(new java.awt.Color(153, 153, 153));
        EditPhone.setText("Phone");
        EditPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditPhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditPhoneFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Adobe Fan Heiti Std B", 1, 18)); // NOI18N
        jLabel2.setText("Registration");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editFirstname)
                    .addComponent(editSurname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditCPassword))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel2)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(editFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        btnSignIn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSignIn.setText("Sign Up");
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editSurnameActionPerformed

    private void EditEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditEmailActionPerformed

    private void EditPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditPasswordActionPerformed

    private void editFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editFirstnameActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        
        
            
            String firstname = editFirstname.getText();
            String surname = editSurname.getText();
            String email = EditEmail.getText();
            String password = EditPassword.getText();
            String cpassword = EditCPassword.getText();
            String phone = EditPhone.getText();
            Date date = Date.valueOf(LocalDate.now());
            String g = String.valueOf(LocalDate.now());
            System.out.println(date);
            
            JavaHttpClientSEND con = new JavaHttpClientSEND();
            
            boolean valid = true;
           
            
             try {
            // Try to parse the string to an integer
            int number = Integer.parseInt(password);

           valid = false;
            
        } catch (NumberFormatException e) {
            
        }
             
            
             
     
            if (valid == true) {
            
        
             
            if (password == null ? cpassword != null : !password.equals(cpassword)) {
                System.out.println(password);
                System.out.println(cpassword);
                 JOptionPane.showMessageDialog(this, "Passwords Do Not Match");
                 EditPassword.setText("");
                 EditCPassword.setText("");
            }else{
                Encryptor encryptor = new Encryptor();
                try {
                    password = encryptor.encryptString(password);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                }
                int data = con.ClientS("adduser","{\"Firstname\":\""+firstname+"\",\"Surname\":\""+surname+"\",\"Email\":\""+email+"\",\"Password\":\""+password+"\",\"Registration_date\":\""+date+"\",\"Phone\":\""+phone+"\"}");
                if (data == 500) {
                       JOptionPane.showMessageDialog(this, "An Error has occured maybe email is aleady used");
                 EditEmail.setText("");
                    }else{
                JOptionPane.showMessageDialog(this, "Account Sucsessfully Added");
            
                dispose();
                SignIn sign = new SignIn();
                sign.setVisible(true);
                }
            }
        
            }else if (valid == false){
                JOptionPane.showMessageDialog(this, "Passwords only contains numbers");
                 EditPassword.setText("");
                 EditCPassword.setText("");
            }
        
        
    }//GEN-LAST:event_btnSignInActionPerformed

    private void editFirstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editFirstnameFocusGained
        if(editFirstname.getText().equals("Firstname*")){
            editFirstname.setText("");
            editFirstname.setForeground (new Color(0,0,0));
        }
    }//GEN-LAST:event_editFirstnameFocusGained

    private void editFirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editFirstnameFocusLost
      if(editFirstname.getText().equals("")){
          editFirstname.setText("Firstname*");
          editFirstname.setForeground (new Color(153,153,153));
      }
    }//GEN-LAST:event_editFirstnameFocusLost

    private void editSurnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editSurnameFocusLost
        if(editSurname.getText().equals("")){
          editSurname.setText("Surname*");
          editSurname.setForeground (new Color(153,153,153));
      }
    }//GEN-LAST:event_editSurnameFocusLost

    private void editSurnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editSurnameFocusGained
        if(editSurname.getText().equals("Surname*")){
            editSurname.setText("");
            editSurname.setForeground (new Color(0,0,0));
        }
    }//GEN-LAST:event_editSurnameFocusGained

    private void EditEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditEmailFocusGained
        if(EditEmail.getText().equals("Email*")){
            EditEmail.setText("");
            EditEmail.setForeground (new Color(0,0,0));
        }
    }//GEN-LAST:event_EditEmailFocusGained

    private void EditEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditEmailFocusLost
        if(EditEmail.getText().equals("")){
          EditEmail.setText("Email*");
          EditEmail.setForeground (new Color(153,153,153));
      }
    }//GEN-LAST:event_EditEmailFocusLost

    private void EditPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditPasswordFocusGained
        if(EditPassword.getText().equals("Password*")){
            EditPassword.setText("");
            EditPassword.setForeground (new Color(0,0,0));
        }
    }//GEN-LAST:event_EditPasswordFocusGained

    private void EditPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditPasswordFocusLost
        if(EditPassword.getText().equals("")){
          EditPassword.setText("Password*");
          EditPassword.setForeground (new Color(153,153,153));
      }
    }//GEN-LAST:event_EditPasswordFocusLost

    private void EditCPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditCPasswordFocusGained
        if(EditCPassword.getText().equals("Confirm Password*")){
            EditCPassword.setText("");
            EditCPassword.setForeground (new Color(0,0,0));
        }
    }//GEN-LAST:event_EditCPasswordFocusGained

    private void EditCPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditCPasswordFocusLost
        if(EditCPassword.getText().equals("")){
          EditCPassword.setText("Confirm Password*");
          EditCPassword.setForeground (new Color(153,153,153));
      }
    }//GEN-LAST:event_EditCPasswordFocusLost

    private void EditPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditPhoneFocusGained
        if(EditPhone.getText().equals("Phone")){
            EditPhone.setText("");
            EditPhone.setForeground (new Color(0,0,0));
        }
    }//GEN-LAST:event_EditPhoneFocusGained

    private void EditPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditPhoneFocusLost
        if(EditPhone.getText().equals("")){
          EditPhone.setText("Phone");
          EditPhone.setForeground (new Color(153,153,153));
      }
    }//GEN-LAST:event_EditPhoneFocusLost

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EditCPassword;
    private javax.swing.JTextField EditEmail;
    private javax.swing.JTextField EditPassword;
    private javax.swing.JTextField EditPhone;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JTextField editFirstname;
    private javax.swing.JTextField editSurname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
