/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.EquipmentSupplierRole;

import Business.Ecosystem;
import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author balajis
 */
public class ManageStocksPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStocksPanel
     */
    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    SupplierDirectory supplierdir;
    Supplier supplier;
    public ManageStocksPanel(JPanel container, UserAccount ua,Ecosystem ecosystem) {
        initComponents();
        this.container = container;
        this.ua = ua;
        this.ecosystem = ecosystem;
        supplierdir = ecosystem.getEnterpriseDirectory().getSupplierDirectory();
        supplier = supplierdir.getSupplier(ua);
        populatetable();
        jLabel3.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/stock2_820x350.jpeg").getImage().getScaledInstance(760,260, Image.SCALE_DEFAULT)));
        jButton1.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.jpeg").getImage().getScaledInstance(100,50, Image.SCALE_DEFAULT)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Equipmenttbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        equiptypetf = new javax.swing.JTextField();
        availtf = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 102));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Equipmenttbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Equipmenttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Equipment_Type", "Availability"
            }
        ));
        Equipmenttbl.setGridColor(new java.awt.Color(0, 153, 204));
        Equipmenttbl.setShowGrid(true);
        jScrollPane1.setViewportView(Equipmenttbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 570, 150));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 100, 50));
        add(equiptypetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 270, -1));
        add(availtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 270, -1));

        jButton2.setText("Add to Stocks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 120, 40));

        jLabel1.setText("Equipment_Type");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        jLabel2.setText("Availability");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 132, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/stock2_820x350.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 760, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        HashMap<String,Integer> equipment = supplier.getEquipment();
        
        if(equipment.containsKey(equiptypetf.getText()))
        {
            equipment.put(equiptypetf.getText(), equipment.get(equiptypetf.getText()) + Integer.parseInt(availtf.getText()));
        }
        else
        equipment.put(equiptypetf.getText(), Integer.parseInt(availtf.getText()));
        populatetable();
        availtf.setText("");
        equiptypetf.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"supplierWorkSpace");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Equipmenttbl;
    private javax.swing.JTextField availtf;
    private javax.swing.JTextField equiptypetf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        
        DefaultTableModel df = (DefaultTableModel) Equipmenttbl.getModel();
        df.setRowCount(0);
        
        HashMap<String,Integer> equipments = supplier.getEquipment();
        
        for(String s: equipments.keySet())
        {
            String[] row = {s,String.valueOf(equipments.get(s))};
            df.addRow(row);
        }
        Equipmenttbl.setModel(df);
    }
    }

