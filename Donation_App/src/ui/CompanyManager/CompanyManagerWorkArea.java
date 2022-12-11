/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.companyManager;

import Business.Company.Company;
import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.NGO.NGODirectory;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author balajis
 */
public class companyManagerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form companyManagerWorkArea
     */
    DB4OUtil db = DB4OUtil.getInstance();
    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    Company company;
    NGODirectory ngodir;
    Volunteer v;
    
    public companyManagerWorkArea(JPanel container,UserAccount ua,Ecosystem ecosystem) {
        initComponents();
        this.container  = container;
        this.ecosystem = ecosystem;
        this.ua = ua;
        
        ngodir = ecosystem.getEnterpriseDirectory().getNGODirectory();
        company = ngodir.getCompany(ua);
        //txtName.setText(team.getTeamManager());
        jLabel1.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/designer-workspace-office-flat-design-vector-illustration-modern-interior-desktop-showing-design-application-33871210_680x350.jpeg").getImage().getScaledInstance(680,310, Image.SCALE_DEFAULT)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 204, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(704, 600));
        setSize(new java.awt.Dimension(704, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/designer-workspace-office-flat-design-vector-illustration-modern-interior-desktop-showing-design-application-33871210_680x350.jpeg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 680, 310));

        jButton7.setText("Request Volunteer");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 210, 50));

        jButton2.setText("View Scheduled Donations");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 210, 50));

        jButton8.setText("Manage Equipment Order");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 210, 50));

        jButton3.setText("Request Sponsor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 210, 50));

        jButton4.setText("Request Equipment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 210, 50));

        jButton1.setText("Request Transport");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 210, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Company Manager Dashboard");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.first(container);
            db.storeSystem(ecosystem);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         RequestVolunteerPanel rd = new RequestVolunteerPanel(container,ua, ecosystem);
            container.add("orderStat",rd);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"orderStat");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ViewDonationSchedulePanel vms = new ViewDonationSchedulePanel(container, ua, ecosystem);
            container.add("teamScheduleView",vms);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"teamScheduleView");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         OrderStat os = new OrderStat(container, ecosystem,company);
            container.add("orderStat",os);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"orderStat");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        SponsorOfferedPanel spoj = new SponsorOfferedPanel(container, ua, ecosystem);
            container.add("sponsorRequests",spoj);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"sponsorRequests");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        RequestEquipmentPanel rej = new RequestEquipmentPanel(container, ua, ecosystem);
            container.add("equipmentreq",rej);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"equipmentreq");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RequestTransportPanel rt = new RequestTransportPanel(container,ua, ecosystem);
          container.add("requestTransport",rt);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"requestTransport");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
