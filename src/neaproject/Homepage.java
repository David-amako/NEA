/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neaproject;

/**
 *
 * @author amakod
 */

import java.sql.Date;
import java.time.chrono.ChronoLocalDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
        
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
    }

    public String username;
    
    public Homepage(String user) {
        initComponents();
        username = user;
        
        
        DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
        model1.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel)jTable2.getModel();
        model2.setRowCount(0);
        DefaultTableModel model3 = (DefaultTableModel)jTable3.getModel();
        model3.setRowCount(0);
        DefaultTableModel model4 = (DefaultTableModel)jTable4.getModel();
        model4.setRowCount(0);
        DefaultTableModel model5 = (DefaultTableModel)jTable5.getModel();
        model5.setRowCount(0);
        DefaultTableModel model6 = (DefaultTableModel)jTable6.getModel();
        model6.setRowCount(0);
        DefaultTableModel model7 = (DefaultTableModel)jTable7.getModel();
        model7.setRowCount(0);
        
        JavaHttpClientRECIVE con = new JavaHttpClientRECIVE();
        
        String Data1 = (con.ClientR("shoeitems"));
        
        
       String[] words1 = Data1.split("\"");
       
        ArrayList<String> w1 = new ArrayList<String>();
        
       for (int i = 0; i < words1.length; i++) {
            
            words1[i] = words1[i].replaceAll("\\{", "");
            words1[i] = words1[i].replaceAll(":\\{", "");
            words1[i] = words1[i].replaceAll(":", "");
            words1[i] = words1[i].replaceAll(",", "");
            words1[i] = words1[i].replaceAll("},", "");
            words1[i] = words1[i].replaceAll("}}}", "");
            words1[i] = words1[i].replaceAll("\\}", "");
            
            words1[i] = words1[i].replaceAll("items", "");
            words1[i] = words1[i].replaceAll("Title", "");
            words1[i] = words1[i].replaceAll("Description", "");
            words1[i] = words1[i].replaceAll("Current_bid", "");
            words1[i] = words1[i].replaceAll("end_date", "");
            words1[i] = words1[i].replaceAll("Seller", "");
            if (words1[i].isEmpty()) {   
        }else{
                w1.add(words1[i]);
                System.out.println(words1[i]);
                
            }
            if (w1.size() == 6) {
                w1.remove(0);
                int n = w1.size();
                
                
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w1.get(j);
                }
                
                model1.addRow(tbData);
                w1.clear();
           }
       }
       
       //------------------------------------------------------------
        
        String Data2 = (con.ClientR("clothingitems"));
        
        
       String[] words2 = Data2.split("\"");
       
        ArrayList<String> w2 = new ArrayList<String>();
        
       for (int i = 0; i < words2.length; i++) {
            
            words2[i] = words2[i].replaceAll("\\{", "");
            words2[i] = words2[i].replaceAll(":\\{", "");
            words2[i] = words2[i].replaceAll(":", "");
            words2[i] = words2[i].replaceAll(",", "");
            words2[i] = words2[i].replaceAll("},", "");
            words2[i] = words2[i].replaceAll("}}}", "");
            words2[i] = words2[i].replaceAll("\\}", "");
            words2[i] = words2[i].replaceAll("items", "");
            words2[i] = words2[i].replaceAll("Title", "");
            words2[i] = words2[i].replaceAll("Description", "");
            words2[i] = words2[i].replaceAll("Current_bid", "");
            words2[i] = words2[i].replaceAll("end_date", "");
            words2[i] = words2[i].replaceAll("Seller", "");
            if (words2[i].isEmpty()) {   
        }else{
                w2.add(words2[i]);
                
            }
            if (w2.size() == 6) {
                w2.remove(0);
                int n = w2.size();
               
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w2.get(j);
                }
                
                model2.addRow(tbData);
                w2.clear();
           }
       }
       
       //------------------------------------------------------------
       
       String Data3 = (con.ClientR("electronicsitems"));
        
        
       String[] words3 = Data3.split("\"");
       
        ArrayList<String> w3 = new ArrayList<String>();
        
       for (int i = 0; i < words3.length; i++) {
            
            words3[i] = words3[i].replaceAll("\\{", "");
            words3[i] = words3[i].replaceAll(":\\{", "");
            words3[i] = words3[i].replaceAll(":", "");
            words3[i] = words3[i].replaceAll(",", "");
            words3[i] = words3[i].replaceAll("},", "");
            words3[i] = words3[i].replaceAll("}}}", "");
            words3[i] = words3[i].replaceAll("\\}", "");
            words3[i] = words3[i].replaceAll("items", "");
            words3[i] = words3[i].replaceAll("Title", "");
            words3[i] = words3[i].replaceAll("Description", "");
            words3[i] = words3[i].replaceAll("Current_bid", "");
            words3[i] = words3[i].replaceAll("end_date", "");
            words3[i] = words3[i].replaceAll("Seller", "");
            if (words3[i].isEmpty()) {   
        }else{
                w3.add(words3[i]);
                
            }
            if (w3.size() == 6) {
                w3.remove(0);
                int n = w3.size();
             
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w3.get(j);
                }
                
                model3.addRow(tbData);
                w3.clear();
           }
       }
       
       //------------------------------------------------------------
       
       String Data4 = (con.ClientR("sportsitems"));
        
        
       String[] words4 = Data4.split("\"");
       
        ArrayList<String> w4 = new ArrayList<String>();
        
       for (int i = 0; i < words4.length; i++) {
            
            words4[i] = words4[i].replaceAll("\\{", "");
            words4[i] = words4[i].replaceAll(":\\{", "");
            words4[i] = words4[i].replaceAll(":", "");
            words4[i] = words4[i].replaceAll(",", "");
            words4[i] = words4[i].replaceAll("},", "");
            words4[i] = words4[i].replaceAll("}}}", "");
            words4[i] = words4[i].replaceAll("\\}", "");
            words4[i] = words4[i].replaceAll("items", "");
            words4[i] = words4[i].replaceAll("Title", "");
            words4[i] = words4[i].replaceAll("Description", "");
            words4[i] = words4[i].replaceAll("Current_bid", "");
            words4[i] = words4[i].replaceAll("end_date", "");
            words4[i] = words4[i].replaceAll("Seller", "");
            if (words4[i].isEmpty()) {   
        }else{
                w4.add(words4[i]);
                
            }
            if (w4.size() == 6) {
                w4.remove(0);
                int n = w4.size();
               
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w4.get(j);
                }
                
                model4.addRow(tbData);
                w4.clear();
           }
       }
       
       //------------------------------------------------------------
       
       String Data5 = (con.ClientR("healthitems"));
        
        
       String[] words5 = Data5.split("\"");
       
        ArrayList<String> w5 = new ArrayList<String>();
        
       for (int i = 0; i < words5.length; i++) {
            
            words5[i] = words5[i].replaceAll("\\{", "");
            words5[i] = words5[i].replaceAll(":\\{", "");
            words5[i] = words5[i].replaceAll(":", "");
            words5[i] = words5[i].replaceAll(",", "");
            words5[i] = words5[i].replaceAll("},", "");
            words5[i] = words5[i].replaceAll("}}}", "");
            words5[i] = words5[i].replaceAll("\\}", "");
            words5[i] = words5[i].replaceAll("items", "");
            words5[i] = words5[i].replaceAll("Title", "");
            words5[i] = words5[i].replaceAll("Description", "");
            words5[i] = words5[i].replaceAll("Current_bid", "");
            words5[i] = words5[i].replaceAll("end_date", "");
            words5[i] = words5[i].replaceAll("Seller", "");
            if (words5[i].isEmpty()) {   
        }else{
                w5.add(words5[i]);
                
            }
            if (w5.size() == 6) {
                w5.remove(0);
                int n = w5.size();
               
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w5.get(j);
                }
                
                model5.addRow(tbData);
                w5.clear();
           }
       }
       
       //------------------------------------------------------------
       
       String Data6 = (con.ClientR("furnitureitems"));
        
        
       String[] words6 = Data6.split("\"");
       
        ArrayList<String> w6 = new ArrayList<String>();
        
       for (int i = 0; i < words6.length; i++) {
            
            words6[i] = words6[i].replaceAll("\\{", "");
            words6[i] = words6[i].replaceAll(":\\{", "");
            words6[i] = words6[i].replaceAll(":", "");
            words6[i] = words6[i].replaceAll(",", "");
            words6[i] = words6[i].replaceAll("},", "");
            words6[i] = words6[i].replaceAll("}}}", "");
            words6[i] = words6[i].replaceAll("\\}", "");
            words6[i] = words6[i].replaceAll("items", "");
            words6[i] = words6[i].replaceAll("Title", "");
            words6[i] = words6[i].replaceAll("Description", "");
            words6[i] = words6[i].replaceAll("Current_bid", "");
            words6[i] = words6[i].replaceAll("end_date", "");
            words6[i] = words6[i].replaceAll("Seller", "");
            if (words6[i].isEmpty()) {   
        }else{
                w6.add(words6[i]);
                
            }
            if (w6.size() == 6) {
                w6.remove(0);
                int n = w6.size();
             
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w6.get(j);
                }
                
                model6.addRow(tbData);
                w6.clear();
           }
       }
       
       //------------------------------------------------------------
       
       String Data7 = (con.ClientR("otheritems"));
        
        
       String[] words7 = Data7.split("\"");
       
        ArrayList<String> w7 = new ArrayList<String>();
        
       for (int i = 0; i < words7.length; i++) {
            
            words7[i] = words7[i].replaceAll("\\{", "");
            words7[i] = words7[i].replaceAll(":\\{", "");
            words7[i] = words7[i].replaceAll(":", "");
            words7[i] = words7[i].replaceAll(",", "");
            words7[i] = words7[i].replaceAll("},", "");
            words7[i] = words7[i].replaceAll("}}}", "");
            words7[i] = words7[i].replaceAll("\\}", "");
            words7[i] = words7[i].replaceAll("items", "");
            words7[i] = words7[i].replaceAll("Title", "");
            words7[i] = words7[i].replaceAll("Description", "");
            words7[i] = words7[i].replaceAll("Current_bid", "");
            words7[i] = words7[i].replaceAll("end_date", "");
            words7[i] = words7[i].replaceAll("Seller", "");
            if (words7[i].isEmpty()) {   
        }else{
                w7.add(words7[i]);
                
            }
            if (w7.size() == 6) {
                w7.remove(0);
                int n = w7.size();
             
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w7.get(j);
                }
                
                model7.addRow(tbData);
                w7.clear();
           }
       }
       
       
       //------------------------------------------------------------
       
       
       
       
       
        

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
        jTextField1 = new javax.swing.JTextField();
        Account = new javax.swing.JButton();
        RefreshBtn = new javax.swing.JButton();
        TabbedPannel = new javax.swing.JTabbedPane();
        ShoeTab = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ClothingTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ElectronicsTab = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        SportsTab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        HealthTab = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        FurnitureTab = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        Other = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Search for Items");

        Account.setText("Account");
        Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountActionPerformed(evt);
            }
        });

        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(RefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Account)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RefreshBtn))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Description", "Price", "End Date", "Seller"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable1);

        javax.swing.GroupLayout ShoeTabLayout = new javax.swing.GroupLayout(ShoeTab);
        ShoeTab.setLayout(ShoeTabLayout);
        ShoeTabLayout.setHorizontalGroup(
            ShoeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShoeTabLayout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
                .addContainerGap())
        );
        ShoeTabLayout.setVerticalGroup(
            ShoeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        TabbedPannel.addTab("Shoes", ShoeTab);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Description", "Price", "End Date", "Seller"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout ClothingTabLayout = new javax.swing.GroupLayout(ClothingTab);
        ClothingTab.setLayout(ClothingTabLayout);
        ClothingTabLayout.setHorizontalGroup(
            ClothingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClothingTabLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
                .addContainerGap())
        );
        ClothingTabLayout.setVerticalGroup(
            ClothingTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        TabbedPannel.addTab("Clothing", ClothingTab);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Description", "Price", "End Date", "Seller"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout ElectronicsTabLayout = new javax.swing.GroupLayout(ElectronicsTab);
        ElectronicsTab.setLayout(ElectronicsTabLayout);
        ElectronicsTabLayout.setHorizontalGroup(
            ElectronicsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectronicsTabLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
                .addContainerGap())
        );
        ElectronicsTabLayout.setVerticalGroup(
            ElectronicsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        TabbedPannel.addTab("Electronics", ElectronicsTab);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Description", "Price", "End Date", "Seller"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout SportsTabLayout = new javax.swing.GroupLayout(SportsTab);
        SportsTab.setLayout(SportsTabLayout);
        SportsTabLayout.setHorizontalGroup(
            SportsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SportsTabLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
                .addContainerGap())
        );
        SportsTabLayout.setVerticalGroup(
            SportsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        TabbedPannel.addTab("Sports", SportsTab);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Description", "Price", "End Date", "Seller"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout HealthTabLayout = new javax.swing.GroupLayout(HealthTab);
        HealthTab.setLayout(HealthTabLayout);
        HealthTabLayout.setHorizontalGroup(
            HealthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HealthTabLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
                .addContainerGap())
        );
        HealthTabLayout.setVerticalGroup(
            HealthTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        TabbedPannel.addTab("Health", HealthTab);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Description", "Price", "End Date", "Seller"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        javax.swing.GroupLayout FurnitureTabLayout = new javax.swing.GroupLayout(FurnitureTab);
        FurnitureTab.setLayout(FurnitureTabLayout);
        FurnitureTabLayout.setHorizontalGroup(
            FurnitureTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FurnitureTabLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
                .addContainerGap())
        );
        FurnitureTabLayout.setVerticalGroup(
            FurnitureTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        TabbedPannel.addTab("Furniture", FurnitureTab);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Description", "Price", "End Date", "Seller"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);

        javax.swing.GroupLayout OtherLayout = new javax.swing.GroupLayout(Other);
        Other.setLayout(OtherLayout);
        OtherLayout.setHorizontalGroup(
            OtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OtherLayout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
                .addContainerGap())
        );
        OtherLayout.setVerticalGroup(
            OtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        TabbedPannel.addTab("Other", Other);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TabbedPannel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TabbedPannel))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountActionPerformed
        
        new Profile(username).setVisible(true);
        
        dispose();
    }//GEN-LAST:event_AccountActionPerformed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        
        DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
        model1.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel)jTable2.getModel();
        model2.setRowCount(0);
        DefaultTableModel model3 = (DefaultTableModel)jTable3.getModel();
        model3.setRowCount(0);
        DefaultTableModel model4 = (DefaultTableModel)jTable4.getModel();
        model4.setRowCount(0);
        DefaultTableModel model5 = (DefaultTableModel)jTable5.getModel();
        model5.setRowCount(0);
        DefaultTableModel model6 = (DefaultTableModel)jTable6.getModel();
        model6.setRowCount(0);
        DefaultTableModel model7 = (DefaultTableModel)jTable7.getModel();
        model7.setRowCount(0);
        
        JavaHttpClientRECIVE con = new JavaHttpClientRECIVE();
        
        String Data1 = (con.ClientR("shoeitems"));
        
        
       String[] words1 = Data1.split("\"");
       
        ArrayList<String> w1 = new ArrayList<String>();
        
       for (int i = 0; i < words1.length; i++) {
            
            words1[i] = words1[i].replaceAll("\\{", "");
            words1[i] = words1[i].replaceAll(":\\{", "");
            words1[i] = words1[i].replaceAll(":", "");
            words1[i] = words1[i].replaceAll(",", "");
            words1[i] = words1[i].replaceAll("},", "");
            words1[i] = words1[i].replaceAll("}}}", "");
            words1[i] = words1[i].replaceAll("\\}", "");
            
            words1[i] = words1[i].replaceAll("items", "");
            words1[i] = words1[i].replaceAll("Title", "");
            words1[i] = words1[i].replaceAll("Description", "");
            words1[i] = words1[i].replaceAll("Current_bid", "");
            words1[i] = words1[i].replaceAll("end_date", "");
            words1[i] = words1[i].replaceAll("Seller", "");
            if (words1[i].isEmpty()) {   
        }else{
                w1.add(words1[i]);
                System.out.println(words1[i]);
                
            }
            if (w1.size() == 6) {
                w1.remove(0);
                int n = w1.size();
                
               /* String[] temp = w1.get(2).split("");
                
                

        // Add something to the index before the penultimate (if array length is greater than 1)
 
            int penultimateIndex = temp.length - 2;
            temp[penultimateIndex] = "." + temp[penultimateIndex];
        

        // Join the array elements into a string using the comma as a delimiter
        String modifiedString = String.join("", temp);
                System.out.println(modifiedString);
        w1.set(2, modifiedString);
        // Print the modified string*/
        
    
                
               
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w1.get(j);
                }
                
                model1.addRow(tbData);
                w1.clear();
           }
       }
       
       //------------------------------------------------------------
        
        String Data2 = (con.ClientR("clothingitems"));
        
        
       String[] words2 = Data2.split("\"");
       
        ArrayList<String> w2 = new ArrayList<String>();
        
       for (int i = 0; i < words2.length; i++) {
            
            words2[i] = words2[i].replaceAll("\\{", "");
            words2[i] = words2[i].replaceAll(":\\{", "");
            words2[i] = words2[i].replaceAll(":", "");
            words2[i] = words2[i].replaceAll(",", "");
            words2[i] = words2[i].replaceAll("},", "");
            words2[i] = words2[i].replaceAll("}}}", "");
            words2[i] = words2[i].replaceAll("\\}", "");
            words2[i] = words2[i].replaceAll("items", "");
            words2[i] = words2[i].replaceAll("Title", "");
            words2[i] = words2[i].replaceAll("Description", "");
            words2[i] = words2[i].replaceAll("Current_bid", "");
            words2[i] = words2[i].replaceAll("end_date", "");
            words2[i] = words2[i].replaceAll("Seller", "");
            if (words2[i].isEmpty()) {   
        }else{
                w2.add(words2[i]);
                
            }
            if (w2.size() == 6) {
                w2.remove(0);
                int n = w2.size();
               /* String[] temp = w2.get(2).split("");
                
                

        // Add something to the index before the penultimate (if array length is greater than 1)
 
            int penultimateIndex = temp.length - 2;
            temp[penultimateIndex] = "." + temp[penultimateIndex];
        

        // Join the array elements into a string using the comma as a delimiter
        String modifiedString = String.join("", temp);
                System.out.println(modifiedString);
        w2.set(2, modifiedString);
        // Print the modified string
        System.out.println("Modified String: " + modifiedString);*/
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w2.get(j);
                }
                
                model2.addRow(tbData);
                w2.clear();
           }
       }
       
       //------------------------------------------------------------
       
       String Data3 = (con.ClientR("electronicsitems"));
        
        
       String[] words3 = Data3.split("\"");
       
        ArrayList<String> w3 = new ArrayList<String>();
        
       for (int i = 0; i < words3.length; i++) {
            
            words3[i] = words3[i].replaceAll("\\{", "");
            words3[i] = words3[i].replaceAll(":\\{", "");
            words3[i] = words3[i].replaceAll(":", "");
            words3[i] = words3[i].replaceAll(",", "");
            words3[i] = words3[i].replaceAll("},", "");
            words3[i] = words3[i].replaceAll("}}}", "");
            words3[i] = words3[i].replaceAll("\\}", "");
            words3[i] = words3[i].replaceAll("items", "");
            words3[i] = words3[i].replaceAll("Title", "");
            words3[i] = words3[i].replaceAll("Description", "");
            words3[i] = words3[i].replaceAll("Current_bid", "");
            words3[i] = words3[i].replaceAll("end_date", "");
            words3[i] = words3[i].replaceAll("Seller", "");
            if (words3[i].isEmpty()) {   
        }else{
                w3.add(words3[i]);
                
            }
            if (w3.size() == 6) {
                w3.remove(0);
                int n = w3.size();
              /*  String[] temp = w3.get(2).split("");
                
                

        // Add something to the index before the penultimate (if array length is greater than 1)
 
            int penultimateIndex = temp.length - 2;
            temp[penultimateIndex] = "." + temp[penultimateIndex];
        

        // Join the array elements into a string using the comma as a delimiter
        String modifiedString = String.join("", temp);
                System.out.println(modifiedString);
        w3.set(2, modifiedString);
        // Print the modified string
        System.out.println("Modified String: " + modifiedString);*/
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w3.get(j);
                }
                
                model3.addRow(tbData);
                w3.clear();
           }
       }
       
       //------------------------------------------------------------
       
       String Data4 = (con.ClientR("sportsitems"));
        
        
       String[] words4 = Data4.split("\"");
       
        ArrayList<String> w4 = new ArrayList<String>();
        
       for (int i = 0; i < words4.length; i++) {
            
            words4[i] = words4[i].replaceAll("\\{", "");
            words4[i] = words4[i].replaceAll(":\\{", "");
            words4[i] = words4[i].replaceAll(":", "");
            words4[i] = words4[i].replaceAll(",", "");
            words4[i] = words4[i].replaceAll("},", "");
            words4[i] = words4[i].replaceAll("}}}", "");
            words4[i] = words4[i].replaceAll("\\}", "");
            words4[i] = words4[i].replaceAll("items", "");
            words4[i] = words4[i].replaceAll("Title", "");
            words4[i] = words4[i].replaceAll("Description", "");
            words4[i] = words4[i].replaceAll("Current_bid", "");
            words4[i] = words4[i].replaceAll("end_date", "");
            words4[i] = words4[i].replaceAll("Seller", "");
            if (words4[i].isEmpty()) {   
        }else{
                w4.add(words4[i]);
                
            }
            if (w4.size() == 6) {
                w4.remove(0);
                int n = w4.size();
               /* String[] temp = w4.get(2).split("");
                
                

        // Add something to the index before the penultimate (if array length is greater than 1)
 
            int penultimateIndex = temp.length - 2;
            temp[penultimateIndex] = "." + temp[penultimateIndex];
        

        // Join the array elements into a string using the comma as a delimiter
        String modifiedString = String.join("", temp);
                System.out.println(modifiedString);
        w4.set(2, modifiedString);
        // Print the modified string
        System.out.println("Modified String: " + modifiedString);*/
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w4.get(j);
                }
                
                model4.addRow(tbData);
                w4.clear();
           }
       }
       
       //------------------------------------------------------------
       
       String Data5 = (con.ClientR("healthitems"));
        
        
       String[] words5 = Data5.split("\"");
       
        ArrayList<String> w5 = new ArrayList<String>();
        
       for (int i = 0; i < words5.length; i++) {
            
            words5[i] = words5[i].replaceAll("\\{", "");
            words5[i] = words5[i].replaceAll(":\\{", "");
            words5[i] = words5[i].replaceAll(":", "");
            words5[i] = words5[i].replaceAll(",", "");
            words5[i] = words5[i].replaceAll("},", "");
            words5[i] = words5[i].replaceAll("}}}", "");
            words5[i] = words5[i].replaceAll("\\}", "");
            words5[i] = words5[i].replaceAll("items", "");
            words5[i] = words5[i].replaceAll("Title", "");
            words5[i] = words5[i].replaceAll("Description", "");
            words5[i] = words5[i].replaceAll("Current_bid", "");
            words5[i] = words5[i].replaceAll("end_date", "");
            words5[i] = words5[i].replaceAll("Seller", "");
            if (words5[i].isEmpty()) {   
        }else{
                w5.add(words5[i]);
                
            }
            if (w5.size() == 6) {
                w5.remove(0);
                int n = w5.size();
               /* String[] temp = w5.get(2).split("");
                
                

        // Add something to the index before the penultimate (if array length is greater than 1)
 
            int penultimateIndex = temp.length - 2;
            temp[penultimateIndex] = "." + temp[penultimateIndex];
        

        // Join the array elements into a string using the comma as a delimiter
        String modifiedString = String.join("", temp);
                System.out.println(modifiedString);
        w5.set(2, modifiedString);
        // Print the modified string
        System.out.println("Modified String: " + modifiedString);*/
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w5.get(j);
                }
                
                model5.addRow(tbData);
                w5.clear();
           }
       }
       
       //------------------------------------------------------------
       
       String Data6 = (con.ClientR("furnitureitems"));
        
        
       String[] words6 = Data6.split("\"");
       
        ArrayList<String> w6 = new ArrayList<String>();
        
       for (int i = 0; i < words6.length; i++) {
            
            words6[i] = words6[i].replaceAll("\\{", "");
            words6[i] = words6[i].replaceAll(":\\{", "");
            words6[i] = words6[i].replaceAll(":", "");
            words6[i] = words6[i].replaceAll(",", "");
            words6[i] = words6[i].replaceAll("},", "");
            words6[i] = words6[i].replaceAll("}}}", "");
            words6[i] = words6[i].replaceAll("\\}", "");
            words6[i] = words6[i].replaceAll("items", "");
            words6[i] = words6[i].replaceAll("Title", "");
            words6[i] = words6[i].replaceAll("Description", "");
            words6[i] = words6[i].replaceAll("Current_bid", "");
            words6[i] = words6[i].replaceAll("end_date", "");
            words6[i] = words6[i].replaceAll("Seller", "");
            if (words6[i].isEmpty()) {   
        }else{
                w6.add(words6[i]);
                
            }
            if (w6.size() == 6) {
                w6.remove(0);
                int n = w6.size();
             /*   String[] temp = w6.get(2).split("");
                
                

        // Add something to the index before the penultimate (if array length is greater than 1)
 
            int penultimateIndex = temp.length - 2;
            temp[penultimateIndex] = "." + temp[penultimateIndex];
        

        // Join the array elements into a string using the comma as a delimiter
        String modifiedString = String.join("", temp);
                System.out.println(modifiedString);
        w6.set(2, modifiedString);
        // Print the modified string
        System.out.println("Modified String: " + modifiedString);*/
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w6.get(j);
                }
                
                model6.addRow(tbData);
                w6.clear();
           }
       }
       
       //------------------------------------------------------------
       
       String Data7 = (con.ClientR("otheritems"));
        
        
       String[] words7 = Data7.split("\"");
       
        ArrayList<String> w7 = new ArrayList<String>();
        
       for (int i = 0; i < words7.length; i++) {
            
            words7[i] = words7[i].replaceAll("\\{", "");
            words7[i] = words7[i].replaceAll(":\\{", "");
            words7[i] = words7[i].replaceAll(":", "");
            words7[i] = words7[i].replaceAll(",", "");
            words7[i] = words7[i].replaceAll("},", "");
            words7[i] = words7[i].replaceAll("}}}", "");
            words7[i] = words7[i].replaceAll("\\}", "");
            words7[i] = words7[i].replaceAll("items", "");
            words7[i] = words7[i].replaceAll("Title", "");
            words7[i] = words7[i].replaceAll("Description", "");
            words7[i] = words7[i].replaceAll("Current_bid", "");
            words7[i] = words7[i].replaceAll("end_date", "");
            words7[i] = words7[i].replaceAll("Seller", "");
            if (words7[i].isEmpty()) {   
        }else{
                w7.add(words7[i]);
                
            }
            if (w7.size() == 6) {
                w7.remove(0);
                int n = w7.size();
             /*   String[] temp = w7.get(2).split("");
                
                

        // Add something to the index before the penultimate (if array length is greater than 1)
 
            int penultimateIndex = temp.length - 2;
            temp[penultimateIndex] = "." + temp[penultimateIndex];
        

        // Join the array elements into a string using the comma as a delimiter
        String modifiedString = String.join("", temp);
                System.out.println(modifiedString);
        w7.set(2, modifiedString);
        // Print the modified string
        System.out.println("Modified String: " + modifiedString);*/
                String[] tbData = new String[n];
                for (int j = 0; j < n; j++) {
                    tbData[j] = w7.get(j);
                }
                
                model7.addRow(tbData);
                w7.clear();
           }
       }
       
       
       //------------------------------------------------------------
       
       
       
       
       
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int Row = jTable1.getSelectedRow();
         DefaultTableModel Model = (DefaultTableModel)jTable1.getModel();
         
         String Title = Model.getValueAt(Row, 0).toString();
         String Description = Model.getValueAt(Row, 1).toString();
         String Price = Model.getValueAt(Row, 2).toString();
         String End_Time = Model.getValueAt(Row, 3).toString();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate localDate = LocalDate.parse(End_Time, formatter);
         
         String Seller = Model.getValueAt(Row, 4).toString();
         
         new ItemPage(Title,Description,Price,localDate,Seller, username).setVisible(true);
         dispose();
         
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int Row = jTable2.getSelectedRow();
         DefaultTableModel Model = (DefaultTableModel)jTable2.getModel();
         
         String Title = Model.getValueAt(Row, 0).toString();
         String Description = Model.getValueAt(Row, 1).toString();
         String Price = Model.getValueAt(Row, 2).toString();
         String End_Time = Model.getValueAt(Row, 3).toString();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate localDate = LocalDate.parse(End_Time, formatter);
         
         String Seller = Model.getValueAt(Row, 4).toString();
         
         new ItemPage(Title,Description,Price,localDate,Seller, username).setVisible(true);
         dispose();
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int Row = jTable3.getSelectedRow();
         DefaultTableModel Model = (DefaultTableModel)jTable3.getModel();
         
         String Title = Model.getValueAt(Row, 0).toString();
         String Description = Model.getValueAt(Row, 1).toString();
         String Price = Model.getValueAt(Row, 2).toString();
         String End_Time = Model.getValueAt(Row, 3).toString();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate localDate = LocalDate.parse(End_Time, formatter);
         
         String Seller = Model.getValueAt(Row, 4).toString();
         
         new ItemPage(Title,Description,Price,localDate,Seller, username).setVisible(true);
         dispose();
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        int Row = jTable4.getSelectedRow();
         DefaultTableModel Model = (DefaultTableModel)jTable4.getModel();
         
         String Title = Model.getValueAt(Row, 0).toString();
         String Description = Model.getValueAt(Row, 1).toString();
         String Price = Model.getValueAt(Row, 2).toString();
         String End_Time = Model.getValueAt(Row, 3).toString();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate localDate = LocalDate.parse(End_Time, formatter);
         
         String Seller = Model.getValueAt(Row, 4).toString();
         
         new ItemPage(Title,Description,Price,localDate,Seller, username).setVisible(true);
         dispose();
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        int Row = jTable5.getSelectedRow();
         DefaultTableModel Model = (DefaultTableModel)jTable5.getModel();
         
         String Title = Model.getValueAt(Row, 0).toString();
         String Description = Model.getValueAt(Row, 1).toString();
         String Price = Model.getValueAt(Row, 2).toString();
         String End_Time = Model.getValueAt(Row, 3).toString();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate localDate = LocalDate.parse(End_Time, formatter);
         
         String Seller = Model.getValueAt(Row, 4).toString();
         
         new ItemPage(Title,Description,Price,localDate,Seller, username).setVisible(true);
         dispose();
    }//GEN-LAST:event_jTable5MouseClicked

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        int Row = jTable6.getSelectedRow();
         DefaultTableModel Model = (DefaultTableModel)jTable6.getModel();
         
         String Title = Model.getValueAt(Row, 0).toString();
         String Description = Model.getValueAt(Row, 1).toString();
         String Price = Model.getValueAt(Row, 2).toString();
         String End_Time = Model.getValueAt(Row, 3).toString();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate localDate = LocalDate.parse(End_Time, formatter);
         
         String Seller = Model.getValueAt(Row, 4).toString();
         
         new ItemPage(Title,Description,Price,localDate,Seller, username).setVisible(true);
         dispose();
    }//GEN-LAST:event_jTable6MouseClicked

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        int Row = jTable7.getSelectedRow();
         DefaultTableModel Model = (DefaultTableModel)jTable7.getModel();
         
         String Title = Model.getValueAt(Row, 0).toString();
         String Description = Model.getValueAt(Row, 1).toString();
         String Price = Model.getValueAt(Row, 2).toString();
         String End_Time = Model.getValueAt(Row, 3).toString();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate localDate = LocalDate.parse(End_Time, formatter);
         
         String Seller = Model.getValueAt(Row, 4).toString();
         
         new ItemPage(Title,Description,Price,localDate,Seller, username).setVisible(true);
         dispose();
    }//GEN-LAST:event_jTable7MouseClicked

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Account;
    private javax.swing.JPanel ClothingTab;
    private javax.swing.JPanel ElectronicsTab;
    private javax.swing.JPanel FurnitureTab;
    private javax.swing.JPanel HealthTab;
    private javax.swing.JPanel Other;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JPanel ShoeTab;
    private javax.swing.JPanel SportsTab;
    private javax.swing.JTabbedPane TabbedPannel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
