/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.VolunteerRole;

import Business.Company.Company;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import Business.Volunteer.VolunteerDirectory;
import java.awt.CardLayout;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarveshzeke
 */
public class ViewVolunteerAvailability extends javax.swing.JPanel {

    /**
     * Creates new form ViewVolunteerAvailability
     */
    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    VolunteerDirectory vd;
    Volunteer v;
    
    public ViewVolunteerAvailability(JPanel container, UserAccount ua, Ecosystem ecosystem) {
        initComponents();
        this.container = container;
        this.ua = ua;
        this.ecosystem = ecosystem;
        vd=ecosystem.getEnterpriseDirectory().getVolunteerDirectory();
        populatetable();
        jButton2.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.png").getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT)));

        
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
        volavailtbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volavailtbl.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        volavailtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company Manager", "Company", "Date", "Time"
            }
        ));
        volavailtbl.setGridColor(new java.awt.Color(0, 102, 102));
        volavailtbl.setShowGrid(true);
        jScrollPane1.setViewportView(volavailtbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 606, 100));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 100, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 100, 50));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("VOLUNTEER AVAILABILITY ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populatetable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            // TODO add your handling code here:
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"volunteerWorkArea");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable volavailtbl;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        
         ArrayList<Volunteer> volunteers = vd.getVolunteers();
        DefaultTableModel df = (DefaultTableModel) volavailtbl.getModel();
        df.setRowCount(0);
        for(Volunteer v : volunteers)
        {
            if(v.getUa().equals(ua))
            {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
                for(Company c : v.getCompanyMapping().keySet())
                {
                    String companyManager = c.getcompanyManager();
                    String companyName = c.getcompanyName();
                        for(Date dt :v.getCompanyMapping().get(c).keySet())
                        {
                            String date = sdf.format(dt);
                            for(Date ti : v.getCompanyMapping().get(c).get(dt))
                            {
                                String time = sdf1.format(ti);
                                String[] row ={companyManager,companyName,date,time};
                                df.addRow(row);
                            }
                                  
                        }
                        
                }
                             
            }
           
        }
       volavailtbl.setModel(df);
    }
}
