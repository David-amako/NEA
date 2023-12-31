/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package neaproject;

import java.awt.Color;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author amakod
 */
public class CreatingItem extends javax.swing.JFrame {

  
    String Seller;
    
     public CreatingItem(String msg) {
        initComponents();
        jLabel5.setText(msg);
        Seller = msg;
         
    }
    

    
            
    public CreatingItem() {
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
        jButton1 = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        Starting_Price = new javax.swing.JLabel();
        Bid_Duration = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        EditTitle = new javax.swing.JTextField();
        EditDesciption = new javax.swing.JTextField();
        EditStarting_Price = new javax.swing.JTextField();
        EditCategory = new javax.swing.JComboBox<>();
        EditDuration = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Brand");

        jButton1.setText("Home");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(123, 123, 123))
        );

        Title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Title.setText("Title");

        Description.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Description.setText("Description");

        Starting_Price.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Starting_Price.setText("Starting Price");

        Bid_Duration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Bid_Duration.setText("End Date");

        Category.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Category.setText("Categoty");

        EditTitle.setForeground(new java.awt.Color(153, 153, 153));
        EditTitle.setText("Title...");
        EditTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditTitleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditTitleFocusLost(evt);
            }
        });
        EditTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTitleActionPerformed(evt);
            }
        });

        EditDesciption.setForeground(new java.awt.Color(153, 153, 153));
        EditDesciption.setText("Max of 50 characters");
        EditDesciption.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditDesciptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditDesciptionFocusLost(evt);
            }
        });
        EditDesciption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDesciptionActionPerformed(evt);
            }
        });

        EditStarting_Price.setText("0.00");
        EditStarting_Price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditStarting_PriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditStarting_PriceFocusLost(evt);
            }
        });
        EditStarting_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStarting_PriceActionPerformed(evt);
            }
        });

        EditCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Shoes", "Clothing", "Electronics", "Sports", "Health", "Furniture", "Other" }));

        EditDuration.setText("YYYY-MM-DD");
        EditDuration.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditDurationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditDurationFocusLost(evt);
            }
        });
        EditDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDurationActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Seller");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(Category)
                    .addComponent(Description)
                    .addComponent(Title)
                    .addComponent(Starting_Price)
                    .addComponent(Bid_Duration))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditDesciption)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(EditTitle)
                                        .addComponent(EditCategory, 0, 204, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(EditDuration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                            .addComponent(EditStarting_Price, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))))
                                .addGap(0, 188, Short.MAX_VALUE)))
                        .addContainerGap(460, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title)
                    .addComponent(EditTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Description)
                    .addComponent(EditDesciption, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Starting_Price)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EditStarting_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bid_Duration)
                    .addComponent(EditDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Category)
                    .addComponent(EditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new Homepage(Seller).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EditDesciptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDesciptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditDesciptionActionPerformed

    private void EditTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditTitleActionPerformed

    private void EditDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditDurationActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        
            String Title = EditTitle.getText();
            String Description = EditDesciption.getText();
            String StatingPrice = EditStarting_Price.getText();
            int ncategory = EditCategory.getSelectedIndex();
            String Date = EditDuration.getText();
            String Category = EditCategory.getItemAt(ncategory);
            
            JavaHttpClientSEND con = new JavaHttpClientSEND();
            SignIn in = new SignIn();
            
            
            
            
            
            
            int data = con.ClientS("additem","{\"Title\":\""+Title+"\",\"Description\":\""+Description+"\",\"Starting_Bid\":\""+StatingPrice+"\",\"Current_bid\":\""+StatingPrice+"\",\"End_Date\":\""+Date+"\",\"Seller\":\""+Seller+"\",\"Category\":\""+Category+"\"}");
            
            if (data == 500) {
                JOptionPane.showMessageDialog(this, "Error while adding item");
            
        } else {
                JOptionPane.showMessageDialog(this, "Item successfully added");
            
                    dispose();
                    
                    new Homepage(Seller).setVisible(true);
            
        }
            


        
    }//GEN-LAST:event_CreateActionPerformed

    private void EditTitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditTitleFocusGained
        if(EditTitle.getText().equals("Title...")){
            EditTitle.setText("");
            EditTitle.setForeground (new Color(0,0,0));
        }
    }//GEN-LAST:event_EditTitleFocusGained

    private void EditTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditTitleFocusLost
        if(EditTitle.getText().equals("")){
          EditTitle.setText("Title...");
          EditTitle.setForeground (new Color(153,153,153));
      }
    }//GEN-LAST:event_EditTitleFocusLost

    private void EditDesciptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditDesciptionFocusGained
        if(EditDesciption.getText().equals("Max of 50 characters")){
            EditDesciption.setText("");
            EditDesciption.setForeground (new Color(0,0,0));
        }
    }//GEN-LAST:event_EditDesciptionFocusGained

    private void EditDesciptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditDesciptionFocusLost
        if(EditDesciption.getText().equals("")){
          EditDesciption.setText("Max of 50 characters");
          EditDesciption.setForeground (new Color(153,153,153));
      }
    }//GEN-LAST:event_EditDesciptionFocusLost

    private void EditStarting_PriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditStarting_PriceFocusGained
        
    }//GEN-LAST:event_EditStarting_PriceFocusGained

    private void EditStarting_PriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditStarting_PriceFocusLost
       
    }//GEN-LAST:event_EditStarting_PriceFocusLost

    private void EditDurationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditDurationFocusGained
       
    }//GEN-LAST:event_EditDurationFocusGained

    private void EditDurationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditDurationFocusLost
        
    }//GEN-LAST:event_EditDurationFocusLost

    private void EditStarting_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStarting_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditStarting_PriceActionPerformed

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
            java.util.logging.Logger.getLogger(CreatingItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatingItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatingItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatingItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatingItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bid_Duration;
    private javax.swing.JLabel Category;
    private javax.swing.JButton Create;
    private javax.swing.JLabel Description;
    private javax.swing.JComboBox<String> EditCategory;
    private javax.swing.JTextField EditDesciption;
    private javax.swing.JTextField EditDuration;
    private javax.swing.JTextField EditStarting_Price;
    private javax.swing.JTextField EditTitle;
    private javax.swing.JLabel Starting_Price;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
