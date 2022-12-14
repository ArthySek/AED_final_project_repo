/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CompanyManager;

import Business.Company.Company;
import Business.Ecosystem;
import Business.NGO.Donation;
import Business.NGO.NGO;
import Business.NGO.NGODirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author balajis
 */
public class ViewDonationSchedulePanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDonationSchedulePanel
     */
    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    Company company;
    NGODirectory ngodir;
    
    public ViewDonationSchedulePanel(JPanel container,UserAccount ua,Ecosystem ecosystem) {
        initComponents();
        this.container = container;
        this.ua = ua;
        this.ecosystem = ecosystem;
        //date.setText(" "+String.valueOf(LocalTime.now().getHour()) + ":"+String.valueOf(LocalTime.now().getMinute()));
        ngodir = ecosystem.getEnterpriseDirectory().getNGODirectory();
        //date.setText(" "+String.valueOf(LocalTime.now().getHour()) + ":"+String.valueOf(LocalTime.now().getMinute()));
        company = ngodir.getCompany(ua);
        populatetable();
        jButton1.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.png").getImage().getScaledInstance(100,50, Image.SCALE_DEFAULT)));

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
        viewdonationtbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(815, 700));
        setSize(new java.awt.Dimension(815, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewdonationtbl.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        viewdonationtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company", "Venue", "Date", "Schedule Status"
            }
        ));
        viewdonationtbl.setGridColor(new java.awt.Color(0, 0, 0));
        viewdonationtbl.setShowGrid(true);
        jScrollPane1.setViewportView(viewdonationtbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 780, 150));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DONATION SCHEDULE ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.show(container,"companyManager");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewdonationtbl;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        
        NGO ngo = ngodir.getNGO(ua);
        DefaultTableModel df = (DefaultTableModel) viewdonationtbl.getModel();
        df.setRowCount(0);
        String date,venue;
        ArrayList<Donation> donations = ngo.getDonations();
        DateFormat datef = new SimpleDateFormat("dd-MMM-yyyy"); 
        for(Donation m: donations)
        {
            if(m.getComp().equals(company))
            {
            if(m.getVenue() == null) venue = "Not Selected";
            else venue = m.getVenue().getVenueName();
            if(m.getDate() == null) date= "Not Selected";
            else date = datef.format(m.getDate());
                String[] row = {m.getComp().getCompanyName(),venue,date,m.getVenueStatus()};
                df.addRow(row);
            }
        
    }
}
}
