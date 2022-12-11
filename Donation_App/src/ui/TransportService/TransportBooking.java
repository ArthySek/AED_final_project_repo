/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TransportService;

import Business.Delivery.Delivery;
import Business.Delivery.Request;
import Business.Ecosystem;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;

import java.awt.Image;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanmayshekhar
 */
public class TransportBooking extends javax.swing.JPanel {

    /**
     * Creates new form TransportBooking
     */
    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    SupplierDirectory supplierdir;
    Date date;
    Delivery d;
    public TransportBooking(JPanel container,UserAccount ua,Ecosystem ecosystem) {
        initComponents();
        this.container=container;
        this.ecosystem=ecosystem;
        this.ua = ua;
        //date.setText(" "+String.valueOf(LocalTime.now().getHour()) + ":"+String.valueOf(LocalTime.now().getMinute()));
        supplierdir = ecosystem.getEnterpriseDirectory().getSupplierDirectory();
        d = supplierdir.getTravelTransport(ua);
        populateTable();

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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewBooking = new javax.swing.JTable();
        btnaccept = new javax.swing.JButton();
        btnreject = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 204));


        tblViewBooking.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        tblViewBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Company Name", "Destination", "Amount", "Date", "Status"
            }
        ));
        tblViewBooking.setGridColor(new java.awt.Color(0, 102, 102));
        tblViewBooking.setShowGrid(true);
        jScrollPane1.setViewportView(tblViewBooking);


        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 527, 100));


        btnaccept.setText("Accept ");
        btnaccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacceptActionPerformed(evt);
            }
        });

        add(btnaccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 122, 40));


        btnreject.setText("Reject");
        btnreject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrejectActionPerformed(evt);
            }
        });

        add(btnreject, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 122, 40));

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N

        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 100, 50));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Transport Booking ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

    }// </editor-fold>//GEN-END:initComponents

    private void btnacceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacceptActionPerformed
        // TODO add your handling code here:
         DefaultTableModel df = (DefaultTableModel) tblViewBooking.getModel();
        int selectedRow = tblViewBooking.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Select request and proceed");return;}
        String companyName = df.getValueAt(selectedRow,0).toString();
        String destination = df.getValueAt(selectedRow,1).toString();
        
        Request r = supplierdir.getRequest(companyName, d.getTransportName(), destination);
        r.setStatus("Accepted");
        populateTable();
    }//GEN-LAST:event_btnacceptActionPerformed

    private void btnrejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrejectActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) tblViewBooking.getModel();
        int selectedRow = tblViewBooking.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Select request and proceed");return;}
        String companyName = df.getValueAt(selectedRow,0).toString();
        String destination = df.getValueAt(selectedRow,1).toString();
        
        Request r = supplierdir.getRequest(companyName, d.getTransportName(), destination);
        r.setStatus("Declined");
        populateTable();
    }//GEN-LAST:event_btnrejectActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
         CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"transportManager");
//      
    }//GEN-LAST:event_btnbackActionPerformed

private void populateTable() {
        DefaultTableModel df = (DefaultTableModel) tblViewBooking.getModel();
        df.setRowCount(0);
        if(supplierdir.getTravelRequests() == null) supplierdir.setTravelRequests(new ArrayList<Request>());
        ArrayList<Request> requests = supplierdir.getTravelRequests();
        
        DateFormat datef = new SimpleDateFormat("dd-MMM-yyyy");
        String date;
        for(Request r: requests)
        {
            
            if(r.getTravelTransport().equals(d.getTransportName()))
            {
               date = datef.format(r.getDate());
                String[] row = {r.getTravelTeam(),r.getLocation(),String.valueOf(r.getTravelAmount()),date,r.getStatus()};
                df.addRow(row);
            }
        }
        tblViewBooking.setModel(df);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaccept;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnreject;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewBooking;
    // End of variables declaration//GEN-END:variables
}
