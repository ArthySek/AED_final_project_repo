/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.logistics;

import Business.Ecosystem;
import Business.Logistics.Logistic;
import Business.Supplier.Order;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanmayshekhar
 */
public class ManageOrders extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrders
     */
    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    Date date;
    SupplierDirectory supplierdir;
    Logistic logistic;
    public ManageOrders(JPanel container,UserAccount ua,Ecosystem ecosystem) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.ua = ua;
        supplierdir = ecosystem.getEnterpriseDirectory().getSupplierDirectory();
        logistic = supplierdir.getLogistic(ua);
        populateTable();
        populateSelect();
        btnback.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.png").getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT)));

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnupdate = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        cmbOrders = new javax.swing.JComboBox<>();
        equiptf = new javax.swing.JTextField();
        statustf = new javax.swing.JTextField();
        comptf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        tblOrders.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Sender", "Receiver", "Status", "Date"
            }
        ));
        tblOrders.setGridColor(new java.awt.Color(0, 0, 153));
        tblOrders.setShowGrid(true);
        jScrollPane1.setViewportView(tblOrders);

        cmbOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrdersActionPerformed(evt);
            }
        });

        equiptf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equiptfActionPerformed(evt);
            }
        });

        comptf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comptfActionPerformed(evt);
            }
        });

        jLabel1.setText("Order ID");

        jLabel2.setText("Equipments");

        jLabel3.setText("Status");

        jLabel4.setText("Company");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(equiptf)
                    .addComponent(statustf)
                    .addComponent(comptf, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(cmbOrders, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equiptf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statustf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comptf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void equiptfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equiptfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equiptfActionPerformed

    private void comptfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comptfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comptfActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
         CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"logisticWorkArea");
    }//GEN-LAST:event_btnbackActionPerformed

    private void cmbOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrdersActionPerformed
        // TODO add your handling code here:
        Order order = supplierdir.getOrder((String) cmbOrders.getSelectedItem());
        equiptf.setText(order.getItem());
        comptf.setText(order.getcompanyName());
    }//GEN-LAST:event_cmbOrdersActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        Order order = supplierdir.getOrder((String) cmbOrders.getSelectedItem());
        order.setStatus(statustf.getText());
        populateTable();
        equiptf.setText("");
        statustf.setText("");
        comptf.setText("");
    }//GEN-LAST:event_btnupdateActionPerformed
    private void populateTable() {
        DefaultTableModel df = (DefaultTableModel) tblOrders.getModel();
        df.setRowCount(0);
        ArrayList<Order> orders = supplierdir.getOrders();
        for(Order o: orders)
        {
            if(o.getLogistics().equals(logistic.getLogisticCompany())){
                if(o.getStatus().equals("Ordered")) {continue;}
                else{
            String[] row = {String.valueOf(o.getOrderId()),o.getSupplierName(),o.getcompanyName(),o.getStatus(),String.valueOf(o.getLocaldatetime())};
            df.addRow(row);}}
        }
        
        tblOrders.setModel(df);
    }

    private void populateSelect() {
         ArrayList<Order> orders = supplierdir.getOrders();
        DefaultComboBoxModel dx = new DefaultComboBoxModel();
        for(Order o: orders)
        {
            dx.addElement(String.valueOf(o.getOrderId()));
        }
        cmbOrders.setModel(dx);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbOrders;
    private javax.swing.JTextField comptf;
    private javax.swing.JTextField equiptf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField statustf;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
