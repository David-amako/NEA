/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neaproject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.TabbedPaneUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amakod
 */
public class Profile extends javax.swing.JFrame {

    
    public Profile() {
    initComponents();
    }
    String Data;
    String Firstname;
    String Surname;
    String Email;
    String Password;
    String Registration_Date;
    String Address;
    String Phone;
    String user_id;
    
    public Profile(String a) {
        initComponents();
        
        JavaHttpClientRECIVE con = new JavaHttpClientRECIVE();
        
        Data = con.ClientR("user/"+a);
        System.out.println(Data);
        
        String[] words1 = Data.split(",");
        String[] words = Data.split("\"");
        
        System.out.println(words[3]);
        user_id = words[3];
        
        String[] d = new String[8];
        
       for (int i = 0; i < words1.length; i++) {
           
            
           words1[i] = words1[i].replaceAll("\\{\"useraccounts\":\\{\""+words[3]+"\":\\{", "");

            words1[i] = words1[i].replaceAll("}}}", "");

            
            words1[i] = words1[i].replaceAll("useraccounts", "");

            if (!words1[i].isEmpty()) {
                d[i] = words1[i];
                
            }
       }
       
        Firstname = d[0];
        Surname = d[1];
        Email = a;
        Password = d[3];
        Registration_Date = d[4];
        Address = d[5];
        Phone = d[6];
    
       String[] FN = d[0].split("\"");
        try {
            jTextField2.setText(FN[3]);
        } catch (Exception e) {
            jTextField2.setText("");
        }
        
        String[] SN = d[1].split("\"");
        try {
            jTextField4.setText(SN[3]);
        } catch (Exception e) {
            jTextField4.setText("");
        }
        
        String[] EM = d[2].split("\"");
        try {
            jTextField6.setText(EM[3]);
        } catch (Exception e) {
            jTextField6.setText("");
        }
        
        String[] PW = d[3].split("\"");
        try {
            jPasswordField1.setText(PW[3]);
        } catch (Exception e) {
            jPasswordField1.setText("");
        }
        
        String[] RD = d[4].split("\"");
        try {
            jTextField5.setText(RD[3]);
        } catch (Exception e) {
            jTextField5.setText("");
        }
        
        String[] ADD = d[5].split("\"");
        try {
            jTextField7.setText(ADD[3]);
        } catch (Exception e) {
            jTextField7.setText("");
        }
        
        String[] PH = d[6].split("\"");
        try {
            jTextField8.setText(PH[3]);
        } catch (Exception e) {
            jTextField8.setText("");
        }
        
        DefaultTableModel model1 = (DefaultTableModel)MyItems.getModel();
        model1.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel)MyBids.getModel();
        model2.setRowCount(0);
       
        String Data1 = (con.ClientR("myitems/"+user_id));
        String Data0 = con.ClientR("bidsum/"+user_id);
        String[] thingst = Data0.split("\"");
        jTextField1.setText(thingst[11]);
        
        String[] things = Data1.split(",");
       
        ArrayList<String> w1 = new ArrayList<String>();
        
       for (int i = 0; i < things.length; i++) {
            
            things[i] = things[i].replaceAll("\\{", "");
            things[i] = things[i].replaceAll(":\\{", "");
            things[i] = things[i].replaceAll(":", "");
            things[i] = things[i].replaceAll(",", "");
            things[i] = things[i].replaceAll("},", "");
            things[i] = things[i].replaceAll("}}}", "");
            things[i] = things[i].replaceAll("\\}", "");
            things[i] = things[i].replaceAll("\"", "");
            things[i] = things[i].replaceAll("\"\"", "");
            things[i] = things[i].replaceAll("\"\"\"", "");
            
            things[i] = things[i].replaceAll("myitems", "");
            things[i] = things[i].replaceAll("title", "");
            things[i] = things[i].replaceAll("description", "");
            things[i] = things[i].replaceAll("starting_bid", "");
            things[i] = things[i].replaceAll("currentBid_holder", "");
            things[i] = things[i].replaceAll("current_bid", "");
            things[i] = things[i].replaceAll("end_date", "");
            things[i] = things[i].replaceAll("Seller", "");
            
            w1.add(things[i]);
            if (w1.size() == 6) {
                String x = w1.get(0);
                w1.set(0, x.substring((x.length())/2));
                int n = w1.size();
                
                
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w1.get(j);
                }
                model1.addRow(tbData);
                w1.clear();
           }
       }
       
       String Data2 = (con.ClientR("mybids/"+user_id));
        
        String[] things1 = Data2.split(",");
       
        ArrayList<String> w2 = new ArrayList<String>();
        
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
            
            things1[i] = things1[i].replaceAll("myitems", "");
            things1[i] = things1[i].replaceAll("title", "");
            things1[i] = things1[i].replaceAll("description", "");
            things1[i] = things1[i].replaceAll("starting_bid", "");
            things1[i] = things1[i].replaceAll("bid_amount", "");
            things1[i] = things1[i].replaceAll("bid_date", "");
            things1[i] = things1[i].replaceAll("currentBid_holder", "");
            things1[i] = things1[i].replaceAll("current_bid", "");
            things1[i] = things1[i].replaceAll("end_date", "");

            
            if (!things1[i].isEmpty()) {
                System.out.println(":::::;::"+things1[i]);
               w2.add(things1[i]);
           }
            
            
            
            if (w2.size() == 8) {
                String x = w2.get(0);
                System.out.println(x+":::::;:");
                w2.set(0, x.substring((x.length())/2));
                int n = w2.size();
                
                
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w2.get(j);
                }
                model2.addRow(tbData);
                w2.clear();
           }
       }
        
        
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
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        CreateItem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MyItems = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        MyBids = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel1.setText("Firstname");

        jLabel8.setText("Surname");

        jLabel9.setText("Email");

        jLabel10.setText("Password");

        jLabel11.setText("Reg Date");

        jLabel12.setText("Address");

        jLabel13.setText("Phone");

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);

        jTextField5.setEditable(false);

        jTextField6.setEditable(false);

        jTextField7.setEditable(false);

        jTextField8.setEditable(false);

        jPasswordField1.setEditable(false);
        jPasswordField1.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(481, 481, 481)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel5)))
                    .addContainerGap(529, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(196, 196, 196)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel5)
                    .addContainerGap(243, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Profile", jPanel2);

        CreateItem.setText("Create");
        CreateItem.setToolTipText("");
        CreateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateItemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Create An Item");

        MyItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title", "Description", "Starting Price", "Current Price", "End_Date", "Current Bid Holder"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MyItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MyItems);

        MyBids.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title", "Description", "Starting Price", "Your Bid Price", "Current Bid Price", "Bid Date", "End Date", "CurrentBid Holder"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MyBids.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyBidsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(MyBids);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("My Items");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("My Bids");

        jLabel14.setText("Total Spent:");

        jTextField1.setEditable(false);
        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CreateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(jLabel7)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CreateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Selling", jPanel4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Wishlist", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Settings", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new Homepage(Email).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CreateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateItemActionPerformed
                dispose();
                
                new CreatingItem(Email).setVisible(true);
                
    }//GEN-LAST:event_CreateItemActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void MyItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyItemsMouseClicked
        
        int Row = MyItems.getSelectedRow();
        DefaultTableModel Model = (DefaultTableModel)MyItems.getModel();
        String Title = Model.getValueAt(Row, 0).toString();
        String Description = Model.getValueAt(Row, 1).toString();
        JavaHttpClientRECIVE con = new JavaHttpClientRECIVE();
        String Data = null;
        try {
            Data = con.ClientR("item?title="+URLEncoder.encode(Title, StandardCharsets.UTF_8.toString())+"&description="+URLEncoder.encode(Description, StandardCharsets.UTF_8.toString()));
        } catch (UnsupportedEncodingException ex) {   
        }
        String[] things1 = Data.split("\"");
        String Item_number = things1[3];
        
        
        String Sprice = Model.getValueAt(Row, 2).toString();
        String Cprice = Model.getValueAt(Row, 3).toString();
         
        new ItemAnalysis(Title,Description,Email,user_id, Sprice, Cprice, Item_number).setVisible(true);
        dispose();
        
    }//GEN-LAST:event_MyItemsMouseClicked

    private void MyBidsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyBidsMouseClicked
        
        int Row = MyBids.getSelectedRow();
        DefaultTableModel Model = (DefaultTableModel)MyBids.getModel();
        
        LocalDate today = LocalDate.now();
        
        String End_Time = Model.getValueAt(Row, 6).toString();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate localDate = LocalDate.parse(End_Time, formatter);
         String tTitle = Model.getValueAt(Row, 0).toString();
        String dDescription = Model.getValueAt(Row, 1).toString();
        if (today.isBefore(localDate)) {
            JOptionPane.showMessageDialog(this, "Bid has not ended");
        } else {
            new ReviewPage(Email, tTitle, dDescription).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_MyBidsMouseClicked
    
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateItem;
    private javax.swing.JTable MyBids;
    private javax.swing.JTable MyItems;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
