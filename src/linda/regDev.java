/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linda;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.Random;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
import static linda.reg.dateCheck;
import static linda.reg.nameCheck;
public class regDev extends javax.swing.JFrame {
    int temp1;                                                                              // GIA TO SHOWBUTTON
    public regDev() {
        
        initComponents();                                                                   // EMFANIZEI TA LABELS KAI TEXTFIELDS
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        cupslabel = new javax.swing.JLabel();
        labelowner = new javax.swing.JLabel();
        txtcups = new javax.swing.JTextField();
        txtowner = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtusernamecheck = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpasswordcheck = new javax.swing.JTextField();
        check1 = new javax.swing.JCheckBox();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(1400, 851));

        jLabel1.setBackground(new java.awt.Color(255, 0, 153));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel1.setText("Team Info App");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Team Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Year Of Creation");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("(Only for delete option!) ");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cupslabel.setText("Cups");

        labelowner.setText("Owner");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cupslabel)
                    .addComponent(labelowner))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtyear, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtname)
                            .addComponent(txtcups)
                            .addComponent(txtowner))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jButton1)
                .addGap(74, 74, 74)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cupslabel)
                    .addComponent(txtcups, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelowner)
                    .addComponent(txtowner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton5.setText("Read");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("About");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Close");
        jButton7.setMaximumSize(new java.awt.Dimension(65, 25));
        jButton7.setMinimumSize(new java.awt.Dimension(65, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(0, 0, 0));
        jTable2.setForeground(new java.awt.Color(204, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team Name", "Year", "Cups", "Owner", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton8.setText("Show");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Registers");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Pending Accounts");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setText("Username");

        txtusernamecheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernamecheckActionPerformed(evt);
            }
        });

        jLabel9.setText("Password");

        check1.setText("Pass");
        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });

        jButton9.setText("OK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpasswordcheck, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(txtusernamecheck))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(check1)
                .addGap(27, 27, 27)
                .addComponent(jButton9)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtusernamecheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtpasswordcheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check1)
                    .addComponent(jButton9))
                .addContainerGap())
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Existing accounts");

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(185, 185, 185))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton8)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(197, 197, 197)
                                                .addComponent(jLabel7)))
                                        .addGap(0, 3, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(235, 235, 235)
                                        .addComponent(jButton2))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 525, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(logoutbtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoutbtn))
                    .addComponent(jLabel1))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(180, 180, 180))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// TEST
    Connection con1;
    PreparedStatement insert;
                                                                                            // O PINAKAS POY EMFANIZETAI
    private void table_update(){
        int c;
       String TeamName = txtname.getText();
        String Year = txtyear.getText(); 
        String Cups = txtcups.getText();
        String Owner = txtowner.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");         
           con1 = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","");
           insert = con1.prepareStatement("select * from record");
           ResultSet rs = insert.executeQuery();
           ResultSetMetaData Rss = rs.getMetaData();
           c = Rss.getColumnCount();
           DefaultTableModel Df = (DefaultTableModel)jTable2.getModel();
           Df.setRowCount(0);         
           while (rs.next())
           {
                   Vector v2 = new Vector();
                    for (int a=1; a<= c; a++)
                    {
                            //v2.add(rs.getString("id"));
                            v2.add(rs.getString("TeamName"));
                            v2.add(rs.getString("Year"));
                           v2.add(rs.getString("Cups"));
                           v2.add(rs.getString("Owner"));
                            v2.add(rs.getString("Id"));
                    }
                             Df.addRow(v2);               
           }         
            txtname.setText("");
            txtyear.setText("");
            txtyear.setText("");
            txtcups.setText("");
            txtowner.setText("");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(regDev.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void table_updateusernames(){
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");         
           con1 = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","");
           insert = con1.prepareStatement("select  `Username`, `Password` from pendingaccounts");
           ResultSet rs = insert.executeQuery();
           ResultSetMetaData Rss = rs.getMetaData();
           c = Rss.getColumnCount();
           DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
           Df.setRowCount(0);         
           while (rs.next())
           {
                   Vector v2 = new Vector();
                    for (int a=1; a<= c; a++)
                    {
                            //v2.add(rs.getString("id"));
                            v2.add(rs.getString("Username"));
                            v2.add(rs.getString("Password"));
                    }
                             Df.addRow(v2);               
           }         
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(regDev.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void table_existingaccounts (){
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");         
           con1 = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","");
           insert = con1.prepareStatement("select  `Username`, `Password` from login");
           ResultSet rs = insert.executeQuery();
           ResultSetMetaData Rss = rs.getMetaData();
           c = Rss.getColumnCount();
           DefaultTableModel Df = (DefaultTableModel)jTable3.getModel();
           Df.setRowCount(0);         
           while (rs.next())
           {
                   Vector v2 = new Vector();
                    for (int a=1; a<= c; a++)
                    {
                            //v2.add(rs.getString("id"));
                            v2.add(rs.getString("Username"));
                            v2.add(rs.getString("Password"));
                    }
                             Df.addRow(v2);               
           }         
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(regDev.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      private void  logoutbtnActionPerformed(java.awt.event.ActionEvent evt) { 
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dispose();
                new devPanel().setVisible(true);
            }
        });
      }
      private void howToButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            

        JOptionPane.showMessageDialog(this, "<html><b>If you want to edit a register you have to click it once and then update the info on register panel and after that click update!</b></html>");
           JOptionPane.showMessageDialog(this, "<html><b>If you want to delete a register you have to options,type a id on id field and click delete button or click it on table and click delete!</b></html>");
    }   
//TO ENTER
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTable1.setVisible(false);
        String teamName = txtname.getText();
        teamName=nameCheck(teamName);
        String Year = txtyear.getText();
        String Cups = txtcups.getText();
        String Owner = txtowner.getText();
        Year=dateCheck(Year);
        try {
            Class.forName("com.mysql.jdbc.Driver");     
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","");
            insert = con1.prepareStatement("insert into record(TeamName,Year,Cups,Owner)values(?,?,?,?)");
            insert.setString(1,teamName);
            insert.setString(2, Year);
            insert.setString(3, Cups);
            insert.setString(4, Owner);
            insert.executeUpdate();           
            JOptionPane.showMessageDialog(this,"Record Added");//Pop up Message 
            txtname.setText("");
            txtyear.setText("");
            txtcups.setText("");
            txtowner.setText("");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(regDev.class.getName()).log(Level.SEVERE, null, ex);    
    }//GEN-LAST:event_jButton1ActionPerformed
                                                             
}
    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed
                                                                                         //OTAN PATAS TO MOUSE KAI KANEI FILL TA TEXTFIELDS
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        txtusernamecheck.setText(Df.getValueAt(selectedIndex,0).toString());
        txtpasswordcheck.setText(Df.getValueAt(selectedIndex,1).toString());
    }//GEN-LAST:event_jTable1MouseClicked

/* DE KSERW PWS DIAGRAFETAI TO KATW
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
*/
                                                                                          //TO CLEAR
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtname.setText("");
        txtyear.setText("");
        txtid.setText("");
        txtcups.setText("");
        txtowner.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed
                                                                                            //ABOUT 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(this,"Εργασία εξαμήνου για το μάθημα Ειδικές Τεχνολογίες Λογισμικού. \n\nΕφαρμογή που συλλέγει πληροφορίες για ποδοσφαιρικές ομάδες.\n\n Άρμπι Νγκέλα(20390165) ");
        
    }//GEN-LAST:event_jButton6ActionPerformed
                                                                                            // TO CLOSE
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
      DefaultTableModel Df = (DefaultTableModel)jTable2.getModel();
        int selectedIndex = jTable2.getSelectedRow();
        txtname.setText(Df.getValueAt(selectedIndex,0).toString());
        txtyear.setText(Df.getValueAt(selectedIndex,1).toString());
        txtid.setText(Df.getValueAt(selectedIndex,2).toString());
        txtcups.setText(Df.getValueAt(selectedIndex,3).toString());
        txtowner.setText(Df.getValueAt(selectedIndex,4).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      temp1=1;
         if (temp1 > 0 ){
             jTable2.setVisible(true);
       table_updateusernames(); 
       //table_update();
        
        }
        else {
              JOptionPane.showMessageDialog(this,temp1);  
                }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
     /* if(check1.isSelected())
           JOptionPane.showMessageDialog(this,"ok"); 
       */    
       
    }//GEN-LAST:event_check1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(check1.isSelected()){
            String teamName = txtusernamecheck.getText();      
            String Year = txtpasswordcheck.getText();       
        try {
            Class.forName("com.mysql.jdbc.Driver");     
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","");
            insert = con1.prepareStatement("insert into login(Username,Password)values(?,?)");
            insert.setString(1,teamName);
            insert.setString(2, Year);
            insert.executeUpdate();           
            JOptionPane.showMessageDialog(this,"Record Added");//Pop up Message 
            table_update();
            txtname.setText("");
            txtyear.setText("");
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","")) {
            String deleteQuery = "DELETE FROM pendingaccounts WHERE Password = ?";
            int test = Integer.parseInt(txtpasswordcheck.getText());
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                int idToDelete = test;
                preparedStatement.setInt(1, idToDelete);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {                  
                    //JOptionPane.showMessageDialog(this,"You delete a register succesfully!");                  
                  table_updateusernames(); 
                } else {
                    JOptionPane.showMessageDialog(this,"We didnt find a register with that ID");                  
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
                }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);  
        }
        } else {
             try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","")) {
            String deleteQuery = "DELETE FROM pendingaccounts WHERE Password = ?";
            int test = Integer.parseInt(txtpasswordcheck.getText());
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                int idToDelete = test;
                preparedStatement.setInt(1, idToDelete);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {                  
                    JOptionPane.showMessageDialog(this,"You delete a register succesfully!");                  
                  table_updateusernames(); 
                } else {
                    JOptionPane.showMessageDialog(this,"We didnt find a register with that ID");                  
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
                }
            
        
    }//GEN-LAST:event_jButton9ActionPerformed
    }
    private void txtusernamecheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernamecheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernamecheckActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 temp1=1;
         if (temp1 > 0 ){
             jTable2.setVisible(true);
       table_existingaccounts(); 
       //table_update();
        
        }
        else {
              JOptionPane.showMessageDialog(this,temp1);  
                }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       dispose();
        new LoginJ().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
                                                                                           // TO READ BUTTON
      private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        temp1=1;
         if (temp1 > 0 ){
             jTable1.setVisible(true);
        table_update();
        //table_updateusernames(); 
        }
        else {
              JOptionPane.showMessageDialog(this,temp1);  
                }
        
        
      }
                                                                                          //TO MAIN
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(regDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new reg().setVisible(true);
                new customerPopUp().setVisible(true);
                
            }
        });
    }


   
    public static  String nameCheck (String wrongName){    
        while (wrongName.isEmpty()) {             
                wrongName = JOptionPane.showInputDialog("Enter the teams name:");         
            if (wrongName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "The team name cannot be empty.");
            }
                
         }
   return wrongName;
    }    
    public static  String dateCheck (String wrongDate){  
          int userNumber = Integer.parseInt(wrongDate);
        while (userNumber<1900 || userNumber>2023) {             
        if (wrongDate == null) {
            JOptionPane.showMessageDialog(null,"The user pressed cancel");
            
        } else {
            try {           
                // Έλεγχος αν είναι τετραψήφιος και μεγαλύτερος του 1900.
                if (userNumber >= 1000 && userNumber <= 9999 && userNumber > 1900) {
                    JOptionPane.showMessageDialog(null,"Number must have 4 digits, bigger that 1900 and smaller than existing 2023");
                } else {
                    JOptionPane.showMessageDialog(null,"Number must have 4 digits, bigger that 1900 and smaller than existing 2023");
                   
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Wrong input");
                
            }
        }
   wrongDate = JOptionPane.showInputDialog("Enter the teams year of creation:");
   userNumber=Integer.parseInt(wrongDate);
    } 
    return wrongDate; } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check1;
    private javax.swing.JLabel cupslabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel labelowner;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JTextField txtcups;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtowner;
    private javax.swing.JTextField txtpasswordcheck;
    private javax.swing.JTextField txtusernamecheck;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
