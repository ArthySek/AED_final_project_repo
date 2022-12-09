/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NGOAdminRole;

import Business.Ecosystem;
import Business.NGO.Donation;
import Business.NGO.NGO;
import Business.NGO.NGODirectory;
import Business.Venue.Venue;
import Business.Venue.VenueDirectory;
import java.awt.CardLayout;
import java.awt.Image;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarveshzeke
 */
public class ManageSchedulePanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSchedulePanel
     */
    
    JPanel container;
    Ecosystem ecosystem;
    NGODirectory ngodir;
    VenueDirectory vd;
    
    public ManageSchedulePanel(JPanel container,Ecosystem ecosystem) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        ngodir = ecosystem.getEnterpriseDirectory().getNGODirectory();
        vd = ecosystem.getEnterpriseDirectory().getVenueDirectory();
        populatecombo();
        jLabel7.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/food-donation.jpeg").getImage().getScaledInstance(760, 570, Image.SCALE_DEFAULT)));
        jButton3.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.png").getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ngocmbbx = new javax.swing.JComboBox<>();
        donationnocmbbx = new javax.swing.JComboBox<>();
        donationtf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        scheduletbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        locationlist = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        datetf = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ngocmbbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngocmbbxActionPerformed(evt);
            }
        });
        add(ngocmbbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, -1));

        donationnocmbbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationnocmbbxActionPerformed(evt);
            }
        });
        add(donationnocmbbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 150, -1));
        add(donationtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, 30));

        scheduletbl.setBackground(new java.awt.Color(255, 255, 204));
        scheduletbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        scheduletbl.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        scheduletbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Donation_No", "Company", "Venue", "Date", "Schedule"
            }
        ));
        scheduletbl.setGridColor(new java.awt.Color(0, 0, 0));
        scheduletbl.setShowGrid(true);
        jScrollPane1.setViewportView(scheduletbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 740, 90));

        jButton1.setText("Get Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, 30));

        jScrollPane2.setViewportView(locationlist);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 150, 30));

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setText("Schedule Donation");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, -1, 50));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Date");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("NGO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Donation No");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Donation");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 100, 50));
        add(datetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 150, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 255));
        jLabel5.setText("Schedule Donation ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 370, 60));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/food-donation.jpeg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void ngocmbbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngocmbbxActionPerformed
        // TODO add your handling code here:
        String ngoName = (String) ngocmbbx.getSelectedItem();
        NGO ngo = ngodir.getNGO(ngoName);
        ArrayList<Donation> donations = ngo.getDonations();
        DefaultComboBoxModel df = new DefaultComboBoxModel();
        for(Donation m: donations)
        {
            df.addElement(m.getDonation_no());
        }
        donationnocmbbx.setModel(df);
         populatetable();
    }//GEN-LAST:event_ngocmbbxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"adminWorkarea");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void donationnocmbbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationnocmbbxActionPerformed
        // TODO add your handling code here:
        String ngoName = (String) ngocmbbx.getSelectedItem();
        String donationNo = String.valueOf(donationnocmbbx.getSelectedItem());
        Donation donation = ngodir.getDonation(donationNo,ngoName);
        String company1 = donation.getComp().getCompanyName();
       
        donationtf.setText(company1);
        System.out.println(company1);
    }//GEN-LAST:event_donationnocmbbxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         ArrayList<Venue> venues = new ArrayList<Venue>();
        try {
            venues = vd.getAvailbleVenues(datetf.getDate());
        } catch (ParseException ex) {
            Logger.getLogger(ManageSchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
      //  DefaultComboBoxModel df = new DefaultComboBoxModel();
        DefaultListModel dl = new DefaultListModel();
          
        for(Venue v: venues)
        {
            dl.addElement(v.getVenueName());
        }
        
        locationlist.setModel(dl);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(locationlist.getSelectedIndex() == -1) 
        {
            JOptionPane.showMessageDialog(this, "Please select a venue");
            return;
        }
        Donation donation = ngodir.getDonation(String.valueOf(donationnocmbbx.getSelectedItem()),String.valueOf(ngocmbbx.getSelectedItem()));
        donation.setVenueStatus("Requested");
        vd.requestVenue(String.valueOf(locationlist.getSelectedValue()), donation, datetf.getDate());
        populatetable();
        donationtf.setText("");
        datetf.setDate(null);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datetf;
    private javax.swing.JComboBox<String> donationnocmbbx;
    private javax.swing.JTextField donationtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> locationlist;
    private javax.swing.JComboBox<String> ngocmbbx;
    private javax.swing.JTable scheduletbl;
    // End of variables declaration//GEN-END:variables

    private void populatecombo() {
        
         ArrayList<NGO> ngo = ngodir.getNgolist();
        DefaultComboBoxModel df = new DefaultComboBoxModel();
        
        for(NGO s: ngo)
        {
            df.addElement(s.getNGOName());
        }
        ngocmbbx.setModel(df);
    }

    private void populatetable() {
        
        String ngoName = (String) ngocmbbx.getSelectedItem();
        NGO ngo = ngodir.getNGO(ngoName);
        String venname,schedulestat,date;
        ArrayList<Donation> donations = ngo.getDonations();
        DefaultTableModel df = (DefaultTableModel) scheduletbl.getModel();
        df.setRowCount(0);
        DateFormat datef = new SimpleDateFormat("dd-MMM-yyyy"); 
               
        for(Donation m: donations)
        {
            if(m.getVenueStatus() == null) m.setVenueStatus("Not Selected");
            schedulestat = m.getVenueStatus();
           if(m.getVenue() == null) 
           {venname = "Not Selected"; date = "Not Selected";}
           else {
               venname = m.getVenue().getVenueName();
               
               date = datef.format(m.getDate());
           }
           
            String[] row = {String.valueOf(m.getDonation_no()),m.getComp().getCompanyName(),venname,date,schedulestat};
            df.addRow(row);
        }
        scheduletbl.setModel(df);
    }
    }
    

