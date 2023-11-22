/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package neaproject;


import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tempa
 */
public class ItemAnalysis extends javax.swing.JFrame {

    /**
     * Creates new form ItemAnalysis
     */
    public ItemAnalysis() {
        initComponents();
    }
    String Email;
    String user_id;
    String Title;
    String Description;
    String Starting_Price;
    String Current_Price;
    String Item_number;
    
    public ItemAnalysis(String msg0, String msg1, String msg2, String msg3, String msg4, String msg5, String msg6){
        initComponents();
        Email = msg2;
        user_id = msg3;
        Title = msg0;
        Description = msg1;
        Starting_Price = msg4;
        Current_Price = msg5;
        Item_number = msg6;
        
        jLabel8.setText(Title);
        DefaultTableModel model1 = (DefaultTableModel)Reviewws.getModel();
        model1.setRowCount(0);
        
        JavaHttpClientRECIVE con = new JavaHttpClientRECIVE();
        
        String dope = con.ClientR("reviews/"+Item_number);
        String[] things = dope.split("\"");
        ArrayList<String> w1 = new ArrayList<String>();
        for (int i = 0; i < things.length; i++) {
            
           
            things[i] = things[i].replaceAll("\\{", "");
            things[i] = things[i].replaceAll(":\\{", "");
            things[i] = things[i].replaceAll(":", "");
            things[i] = things[i].replaceAll(",", "");
            things[i] = things[i].replaceAll("}}}", "");
            things[i] = things[i].replaceAll("\\}", "");
            things[i] = things[i].replaceAll("\"", "");
            things[i] = things[i].replaceAll("\"\"", "");
            things[i] = things[i].replaceAll("\"\"\"", "");
            
            things[i] = things[i].replaceAll("Reviews", "");
            things[i] = things[i].replaceAll("review", "");
            if (!things[i].isEmpty()) {
                try {
                     int x = Integer.parseInt(things[i]);
                } catch (Exception e) {
                 w1.add(things[i]);
            if (w1.size() == 1) {
                int n = w1.size();
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w1.get(j);
                }
                model1.addRow(tbData);
                w1.clear();
           }
                }
                
            } 
       }
        
        
        
        
        String Data2 = null;
        String Data3 = null;
                
        try {
            Data2 = con.ClientR("calitem?title="+URLEncoder.encode(Title, StandardCharsets.UTF_8.toString())+"&description="+URLEncoder.encode(Description, StandardCharsets.UTF_8.toString()));
        System.out.println(Data2);
        
            Data3 = con.ClientR("Mostfre?title="+URLEncoder.encode(Title, StandardCharsets.UTF_8.toString())+"&description="+URLEncoder.encode(Description, StandardCharsets.UTF_8.toString()));
            
        } catch (Exception e) {
        }
        
        String[] things1 = Data3.split("\"");
       
        
        
       for (int i = 0; i < things1.length; i++) {
            
           
            things1[i] = things1[i].replaceAll("\\{", "");
            things1[i] = things1[i].replaceAll(":\\{", "");
            things1[i] = things1[i].replaceAll(":", "");
            things1[i] = things1[i].replaceAll(",", "");
            things1[i] = things1[i].replaceAll("}}}", "");
            things1[i] = things1[i].replaceAll("\\}", "");
            things1[i] = things1[i].replaceAll("\"", "");
            things1[i] = things1[i].replaceAll("\"\"", "");
            things1[i] = things1[i].replaceAll("\"\"\"", "");
            
            things1[i] = things1[i].replaceAll("Mostfres", "");
            things1[i] = things1[i].replaceAll(user_id, "");
            things1[i] = things1[i].replaceAll("totalBidsPlaced", "");
            things1[i] = things1[i].replaceAll("firstname", "");
            things1[i] = things1[i].replaceAll("surname", "");

            
       }
        try {
        jTextField2.setText(things1[11]);
        
        } catch (Exception e) {
            jTextField2.setText("Null");
        }
        try {
        
        jTextField4.setText(things1[15]);
        
        } catch (Exception e) {
            jTextField4.setText("Null");
        }
        try {
        
        jTextField5.setText(things1[19]);
        } catch (Exception e) {
            jTextField5.setText("Null");
        }
        
        String[] things2 = Data2.split("\"");
        for (int i = 0; i < things2.length; i++) {
            
           
            things2[i] = things2[i].replaceAll("\\{", "");
            things2[i] = things2[i].replaceAll(":\\{", "");
            things2[i] = things2[i].replaceAll(":", "");
            things2[i] = things2[i].replaceAll(",", "");
            things2[i] = things2[i].replaceAll("}}}", "");
            things2[i] = things2[i].replaceAll("\\}", "");
            things2[i] = things2[i].replaceAll("\"", "");
            things2[i] = things2[i].replaceAll("\"\"", "");
            things2[i] = things2[i].replaceAll("\"\"\"", "");
            
            things2[i] = things2[i].replaceAll("noOfBid", "");
            things2[i] = things2[i].replaceAll("title", "");
            things2[i] = things2[i].replaceAll("totalBids", "");
            things2[i] = things2[i].replaceAll(Title, "");
 
       }
        try {
        
        jTextField3.setText(things2[11]);
        } catch (Exception e) {
            jTextField5.setText("Null");
        }
        
        float x = Float.parseFloat(Starting_Price);
        float y = Float.parseFloat(Current_Price);
        float z = y - x;
        String v = String.valueOf(z);
        jTextField1.setText(v);
        
    }
    //item?title="+URLEncoder.encode(Title, StandardCharsets.UTF_8.toString())+"&description="+URLEncoder.encode(Description, StandardCharsets.UTF_8.toString())
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reviewws = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton3.setText("Home");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(1003, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel3.setText("Total Profit:");

        jTextField1.setEditable(false);
        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Most Frequent Bidder:");

        jTextField2.setEditable(false);
        jTextField2.setText("jTextField2");

        jLabel6.setText("No Of Bids on item:");

        jTextField3.setEditable(false);
        jTextField3.setText("jTextField3");

        jTextField4.setEditable(false);
        jTextField4.setText("jTextField4");

        jTextField5.setEditable(false);
        jTextField5.setText("jTextField5");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Title:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("jLabel8");

        Reviewws.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reviews"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Reviewws);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new Homepage(Email).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(ItemAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemAnalysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Reviewws;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
