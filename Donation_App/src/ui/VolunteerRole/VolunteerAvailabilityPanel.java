/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.VolunteerRole;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import Business.Volunteer.VolunteerDirectory;
import java.awt.CardLayout;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.companyManager.RequestVolunteerPanel;

/**
 *
 * @author sarveshzeke
 */
public class VolunteerAvailabilityPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerAvailabilityPanel
     */
    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    Volunteer volunteer;
    VolunteerDirectory vd;
    SimpleDateFormat date1 =  new SimpleDateFormat("HH:mm");
    SimpleDateFormat date2=  new SimpleDateFormat("dd/MM/yyyy");
        
    public VolunteerAvailabilityPanel(JPanel container,UserAccount ua,Ecosystem ecosystem) {
        initComponents();
        this.container = container;
        this.ua = ua;
        this.ecosystem = ecosystem;
        vd = ecosystem.getEnterpriseDirectory().getVolunteerDirectory();
        volunteer = vd.getVolunteer(ua);
        jButton2.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.png").getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT)));
        jLabel3.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/vol.jpeg").getImage().getScaledInstance(320, 250, Image.SCALE_DEFAULT)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datetf = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        timecmbbx = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(datetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 170, -1));

        jButton1.setText("Get Time Slots");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 140, 250, -1));

        timecmbbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timecmbbxActionPerformed(evt);
            }
        });
        add(timecmbbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 160, -1));

        jButton2.setText("Not available during these times");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 263, -1, -1));

        jLabel1.setText("Time");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 40, -1));

        jLabel2.setText("Date");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, 26));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/vol.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String date = date2.format(datetf.getDate());
      try{
      vd.updateStatusDoctor(date2.parse(date), date1.parse((String)timecmbbx.getSelectedItem()), volunteer);
      }
      catch(ParseException e)
              {
                  
              }
         JOptionPane.showMessageDialog(this, "Status Updated");
         datetf.setDate(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Date> timeslots = new ArrayList<Date>();
        String designation = volunteer.getvolunteerDesignation();
        ArrayList<Volunteer> volunteerlist  = vd.getvolunteersByDesignation(designation);
        String date =date2.format(datetf.getDate());
        for(Volunteer v: volunteerlist)
        {
           if(v.getvolunteerName().equals(volunteer.getvolunteerName())){}
           try {
               v.setDate(date2.parse(date));
           } catch (ParseException ex) {
               Logger.getLogger(RequestVolunteerPanel.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        try {
            timeslots = vd.getAvailbleSlots(date2.parse(date),volunteer.getvolunteerName());
            
        } catch (ParseException ex) {
           ex.printStackTrace();
        }
       DefaultComboBoxModel df = new DefaultComboBoxModel();
          
        for(Date d: timeslots)
        {
            df.addElement(date1.format(d));
        }
        timecmbbx.setModel(df);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void timecmbbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timecmbbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timecmbbxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.show(container,"volunteerWorkArea");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datetf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> timecmbbx;
    // End of variables declaration//GEN-END:variables
}
