/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication3.F1.kitaplar;
import static javaapplication3.mainJFrame.conn;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nina
 */
public class ShowOrders extends javax.swing.JFrame {

    /**
     * Creates new form ShowOrders
     */
    DefaultTableModel dtm;
    public ShowOrders() {
        initComponents();
           dtm = (DefaultTableModel)tablo.getModel();
           dtm.setRowCount(0);
            String query2 = null;
            query2 = "SELECT * FROM Department ";
            try (PreparedStatement pst = conn.prepareStatement(query2)) {
                 
                ResultSet r2 = pst.executeQuery();
                while (r2.next()){
                    String MID = r2.getString(1);
                    String ISBN = r2.getString(2);
                    String  Amount = r2.getString(3);
                    String ODate=r2.getString(4);
                    Object[] satir ={MID, ISBN, Amount,ODate,null};
                    
                    dtm.addRow(satir);}
                
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage());
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        dnumber = new javax.swing.JTextField();
        mgrssn = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        dname = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        s = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dname", "Dnumber", "Mgrssn", "Mgrstartdate"
            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        jLabel1.setText("Department");

        mgrssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrssnActionPerformed(evt);
            }
        });

        dname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnameActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jButton2.setText("Order By Dnumber");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Order By Dname");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Order Dnumber Desc");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Order By Date");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mgrssn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2)
                        .addGap(7, 7, 7)
                        .addComponent(jButton3)
                        .addGap(12, 12, 12)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(dnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mgrssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
        new F1().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
dtm = (DefaultTableModel)tablo.getModel();
        int  SelectedRowIndex= tablo.getSelectedRow();
       //this.setisbnn(Integer.parseInt((String) dtm.getValueAt(SelectedRowIndex, 0)));
       // System.out.println(getisbnn());
       dname.setText((String) dtm.getValueAt(SelectedRowIndex, 0));
       dnumber.setText((String) dtm.getValueAt(SelectedRowIndex, 1));
       this.setisbnn(Integer.parseInt((String) dtm.getValueAt(SelectedRowIndex, 1)));
       mgrssn.setText((String) dtm.getValueAt(SelectedRowIndex, 2));
       date.setText((String) dtm.getValueAt(SelectedRowIndex, 3));
      // kitaplar.add(getisbnn());        // TODO add your handling code here:
    }//GEN-LAST:event_tabloMouseClicked

    private void dnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnameActionPerformed

    private void mgrssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrssnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mgrssnActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String query4 = null;       
     
                      query4 ="update department set dname ='"+dname.getText()+"',dnumber ="+getisbnn()+",mgrssn='"+mgrssn.getText() +"',mgrstartdate='"+ date.getText()+"' where dnumber="+getisbnn();
                System.out.println(query4);
                    try (PreparedStatement pst3 = conn.prepareStatement(query4)) {
                        boolean r4 = pst3.execute();
                        pst3.close();
                        
                    } catch (SQLException ex) {
             Logger.getLogger(SiparisEkle.class.getName()).log(Level.SEVERE, null, ex);
         }
        dname.setText("");
        dnumber.setText("");
        mgrssn.setText("");
        date.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
 dtm = (DefaultTableModel)tablo.getModel();
           dtm.setRowCount(0);
            String query2 = null;
            query2 = "SELECT * FROM Department where dname like '%"+s.getText()+"%' or mgrssn like '%"+s.getText()+"%'";
            try (PreparedStatement pst = conn.prepareStatement(query2)) {
                 
                ResultSet r2 = pst.executeQuery();
                while (r2.next()){
                    String MID = r2.getString(1);
                    String ISBN = r2.getString(2);
                    String  Amount = r2.getString(3);
                    String ODate=r2.getString(4);
                    Object[] satir ={MID, ISBN, Amount,ODate,null};
                    
                    dtm.addRow(satir);}
                
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 dtm = (DefaultTableModel)tablo.getModel();
           dtm.setRowCount(0);
            String query2 = null;
            query2 = "SELECT * FROM Department order by dnumber";
            try (PreparedStatement pst = conn.prepareStatement(query2)) {
                 
                ResultSet r2 = pst.executeQuery();
                while (r2.next()){
                    String MID = r2.getString(1);
                    String ISBN = r2.getString(2);
                    String  Amount = r2.getString(3);
                    String ODate=r2.getString(4);
                    Object[] satir ={MID, ISBN, Amount,ODate,null};
                    
                    dtm.addRow(satir);}
                
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage());
        }        // TODO add your        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 dtm = (DefaultTableModel)tablo.getModel();
           dtm.setRowCount(0);
            String query2 = null;
            query2 = "SELECT * FROM Department order by dname";
            try (PreparedStatement pst = conn.prepareStatement(query2)) {
                 
                ResultSet r2 = pst.executeQuery();
                while (r2.next()){
                    String MID = r2.getString(1);
                    String ISBN = r2.getString(2);
                    String  Amount = r2.getString(3);
                    String ODate=r2.getString(4);
                    Object[] satir ={MID, ISBN, Amount,ODate,null};
                    
                    dtm.addRow(satir);}
                
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage());
        }        // TODO add your        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         dtm = (DefaultTableModel)tablo.getModel();
           dtm.setRowCount(0);
            String query2 = null;
            query2 = "SELECT * FROM Department order by dnumber desc";
            try (PreparedStatement pst = conn.prepareStatement(query2)) {
                 
                ResultSet r2 = pst.executeQuery();
                while (r2.next()){
                    String MID = r2.getString(1);
                    String ISBN = r2.getString(2);
                    String  Amount = r2.getString(3);
                    String ODate=r2.getString(4);
                    Object[] satir ={MID, ISBN, Amount,ODate,null};
                    
                    dtm.addRow(satir);}
                
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage());
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            dtm = (DefaultTableModel)tablo.getModel();
           dtm.setRowCount(0);
            String query2 = null;
            query2 = "SELECT * FROM Department order by mgrstartdate";
            try (PreparedStatement pst = conn.prepareStatement(query2)) {
                 
                ResultSet r2 = pst.executeQuery();
                while (r2.next()){
                    String MID = r2.getString(1);
                    String ISBN = r2.getString(2);
                    String  Amount = r2.getString(3);
                    String ODate=r2.getString(4);
                    Object[] satir ={MID, ISBN, Amount,ODate,null};
                    
                    dtm.addRow(satir);}
                
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage());
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ShowOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowOrders().setVisible(true);
            }
        });
    }
     public Integer getisbnn() {
		return isbnn;
	}

	public void setisbnn(Integer a) {
		this.isbnn = a;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JTextField dname;
    private javax.swing.JTextField dnumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mgrssn;
    private javax.swing.JTextField s;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables
private Integer isbnn;
}
