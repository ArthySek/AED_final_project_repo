/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CompanyManager;

import Business.Company.Company;
import Business.Ecosystem;
import Business.NGO.NGODirectory;
import Business.Sponsor.Sponsor;
import Business.Sponsor.SponsorDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author balajis
 */
public class SponsorOfferedPanel extends javax.swing.JPanel {

    /**
     * Creates new form SponsorOfferedPanel
     */
    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    SponsorDirectory sponsordir;
    Company company;
    NGODirectory ngodir;
    public SponsorOfferedPanel(JPanel container,UserAccount ua,Ecosystem ecosystem) {
        initComponents();
        this.container = container;
        this.ua = ua;
        this.ecosystem = ecosystem;
        ngodir = ecosystem.getEnterpriseDirectory().getNGODirectory();
        sponsordir = ecosystem.getEnterpriseDirectory().getSponsorDirectory();
        company = ngodir.getCompany(ua);
        populatetable();
        
        jLabel2.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/20943645_600x400.jpeg").getImage().getScaledInstance(690,350, Image.SCALE_DEFAULT)));
        jButton3.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.png").getImage().getScaledInstance(100,50, Image.SCALE_DEFAULT)));

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
        sponsorreqtbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sponsorreqtbl.setBackground(new java.awt.Color(255, 51, 102));
        sponsorreqtbl.setBorder(new javax.swing.border.MatteBorder(null));
        sponsorreqtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sponsor", "Offered Amount"
            }
        ));
        jScrollPane1.setViewportView(sponsorreqtbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 480, 80));

        jButton1.setText("Accept Sponsor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 150, 50));

        jButton2.setText("Decline Sponsor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 150, 50));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 100, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/20943645_600x400.jpeg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 690, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) sponsorreqtbl.getModel();
        int selectedRow = sponsorreqtbl.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Please Select a sponsor and proceed");return;}
        String sponsorname = df.getValueAt(selectedRow,0).toString();
        int amount = Integer.parseInt(df.getValueAt(selectedRow,1).toString());
        sponsordir.sponsorToCompany(sponsorname, amount, company);
        company.addBudget(amount);
        populatetable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) sponsorreqtbl.getModel();
        int selectedRow = sponsorreqtbl.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Please Select a sponsor and proceed");return;}
        String sponsorname = df.getValueAt(selectedRow,0).toString();
        Sponsor sponsor = sponsordir.getSponsor(sponsorname);
        HashMap<Company,String> offerStatus = sponsor.getOfferStatus();
        offerStatus.put(company, "Declined");
         populatetable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.show(container,"CompanyManager");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable sponsorreqtbl;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        
         DefaultTableModel df = (DefaultTableModel) sponsorreqtbl.getModel();
        df.setRowCount(0);
        ArrayList<Sponsor> sponsors = sponsordir.getSponsorsDirectory();
        HashMap<Company,Integer> offer;
        HashMap<Company,String> offerStatus;
        for(Sponsor s:sponsors)
        {
             offer = s.getSponsoredRequests();
             offerStatus = s.getOfferStatus();
             for(Company t : offer.keySet())
             {
                 if(t.equals(company) && offerStatus.get(t).equals("Requested"))
                 {
                     String[] row = {s.getSponsorName(),String.valueOf(offer.get(t))};
                     df.addRow(row);
                 }
             }
        }
        
        sponsorreqtbl.setModel(df);
    }
    }

