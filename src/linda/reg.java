/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linda;

import static java.awt.Event.DELETE;
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
public class reg extends javax.swing.JFrame {
    int temp1;                                                                              // GIA TO SHOWBUTTON
    public reg() {
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        howToButton = new javax.swing.JButton();
        profilebtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 153));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel1.setText("Team Info App");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 35, 550, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtyear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(77, 77, 77)
                .addComponent(jButton3)
                .addGap(97, 97, 97))
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
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 205, -1, -1));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team Name", "Year", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 205, 395, 329));

        jButton4.setBackground(new java.awt.Color(251, 0, 0));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 541, 98, -1));

        jButton5.setText("Read");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 541, 98, -1));

        jButton2.setText("Update");
        jButton2.setMaximumSize(new java.awt.Dimension(61, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(61, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 541, 98, -1));

        jButton6.setText("About");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 625, 98, 33));

        jButton7.setText("Close");
        jButton7.setMaximumSize(new java.awt.Dimension(65, 25));
        jButton7.setMinimumSize(new java.awt.Dimension(65, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 625, 79, 33));

        howToButton.setText("How to..");
        howToButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howToButtonActionPerformed(evt);
            }
        });
        getContentPane().add(howToButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 584, 161, -1));

        profilebtn.setText("Profile");
        profilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebtnActionPerformed(evt);
            }
        });
        getContentPane().add(profilebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 13, -1, -1));

        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 13, -1, -1));

        jButton8.setText("Back");
        jButton8.setMaximumSize(new java.awt.Dimension(65, 25));
        jButton8.setMinimumSize(new java.awt.Dimension(65, 25));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 625, 68, 33));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/istockphoto-874402896-2048x2048.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 670));

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
        try {
            Class.forName("com.mysql.jdbc.Driver");         
           con1 = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","");
           insert = con1.prepareStatement("select * from record");
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
                            v2.add(rs.getString("TeamName"));
                            v2.add(rs.getString("Year"));
                           v2.add(rs.getString("Id"));
                    }
                             Df.addRow(v2);               
           }         
            txtname.setText("");
            txtyear.setText("");
            txtyear.setText("");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
                                                                                            //TO ENTER
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //jTable1.setVisible(false);
        String teamName = txtname.getText();
        teamName=nameCheck(teamName);
        String Year = txtyear.getText();
        Year=dateCheck(Year);
        try {
            Class.forName("com.mysql.jdbc.Driver");     
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","");
            insert = con1.prepareStatement("insert into record(TeamName,Year)values(?,?)");
            insert.setString(1,teamName);
            insert.setString(2, Year);
            insert.executeUpdate();           
            JOptionPane.showMessageDialog(this,"Record Added");//Pop up Message 
            table_update();
            txtname.setText("");
            txtyear.setText("");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);    
    }//GEN-LAST:event_jButton1ActionPerformed
//TO ID KENO GIA DELETE
}
    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed
                                                                                            //OTAN PATAS TO MOUSE KAI KANEI FILL TA TEXTFIELDS
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        txtname.setText(Df.getValueAt(selectedIndex,0).toString());
        txtyear.setText(Df.getValueAt(selectedIndex,1).toString());
        txtid.setText(Df.getValueAt(selectedIndex,2).toString());

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked
                                                                                            //EDIT BUTTON
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","")) {
            String deleteQuery = "DELETE FROM record WHERE ID = ?";
            int test = Integer.parseInt(txtid.getText());
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                int idToDelete = test;
                preparedStatement.setInt(1, idToDelete);
                int rowsAffected = preparedStatement.executeUpdate();               
            }           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String teamName = txtname.getText();
        teamName=nameCheck(teamName);
        String Year = txtyear.getText();
        Year=dateCheck(Year);
        try {
            Class.forName("com.mysql.jdbc.Driver");     
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","");
            insert = con1.prepareStatement("insert into record(TeamName,Year)values(?,?)");
            insert.setString(1,teamName);
            insert.setString(2, Year);
            insert.executeUpdate();                     
            table_update();
            JOptionPane.showMessageDialog(this,"Succesfully changed");//Pop up Message 
            txtname.setText("");
            txtyear.setText("");
            txtid.setText("");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);    
    }                                          
        
    }//GEN-LAST:event_jButton2ActionPerformed
/* DE KSERW PWS DIAGRAFETAI TO KATW
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
*/
                                                                                           //TO DELETE!
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/linda","root","")) {
            String deleteQuery = "DELETE FROM record WHERE ID = ?";
            int test = Integer.parseInt(txtid.getText());
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                int idToDelete = test;
                preparedStatement.setInt(1, idToDelete);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {                  
                    JOptionPane.showMessageDialog(this,"You delete a register succesfully!");
                    txtid.setText("");
                    txtname.setText("");
                    txtyear.setText("");
                    table_update();
                } else {
                    JOptionPane.showMessageDialog(this,"We didnt find a register with that ID");
                    txtid.setText("");
                    txtname.setText("");
                    txtyear.setText("");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed
                                                                                           //TO CLEAR
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtname.setText("");
        txtyear.setText("");
        txtid.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed
                                                                                            //ABOUT 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(this,"Εργασία εξαμήνου για το μάθημα Ειδικές Τεχνολογίες Λογισμικού. \n\nΕφαρμογή που συλλέγει πληροφορίες για ποδοσφαιρικές ομάδες.\n\n Back end:Άρμπι Νγκέλα(20390165) ");
        
    }//GEN-LAST:event_jButton6ActionPerformed
                                                                                            // TO CLOSE
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed
                                                                                            // HOW TO 
    private void howToButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howToButtonActionPerformed

        JOptionPane.showMessageDialog(this, "<html><b>If you want to edit a register you have to click it once and then update the info on register panel and after that click update!</b></html>");
           JOptionPane.showMessageDialog(this, "<html><b>If you want to delete a register you have to options,type a id on id field and click delete button or click it on table and click delete!</b></html>");
    }//GEN-LAST:event_howToButtonActionPerformed

    private void profilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebtnActionPerformed
     
    }//GEN-LAST:event_profilebtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dispose();
                new LoginJ().setVisible(true);
            }
        });
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
        new LoginJ().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed
                                                                                           // TO READ BUTTON
      private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        temp1=1;
         if (temp1 > 0 ){
             jTable1.setVisible(true);
        table_update();
        
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
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
           //fdfsg
           //gsdgsdgdsf
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
    private javax.swing.JButton howToButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton profilebtn;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
