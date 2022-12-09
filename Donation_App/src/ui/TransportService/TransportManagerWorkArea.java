/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TransportService;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author sarveshzeke
 */
public class TransportManagerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form TransportManager
     */
  
    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    Date date;
    DB4OUtil db = DB4OUtil.getInstance();
    public TransportManagerWorkArea(JPanel container,UserAccount ua,Ecosystem ecosystem) {
        initComponents();
        //date.setText(" "+String.valueOf(LocalTime.now().getHour()) + ":"+String.valueOf(LocalTime.now().getMinute()));
        this.ecosystem = ecosystem;
        this.ua = ua;
        this.container = container;
        //lblTM.setIcon(new ImageIcon(new ImageIcon("src/Business/Util/Icon/Travel Manager.png").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmt = new javax.swing.JButton();
        btnbooking = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();


        setBackground(new java.awt.Color(0, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnmt.setText("Manage Transport");

        btnmt.setMaximumSize(new java.awt.Dimension(128, 29));

        btnmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmtActionPerformed(evt);
            }
        });

        add(btnmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 160, 50));


        btnbooking.setText("View Booking");
        btnbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbookingActionPerformed(evt);
            }
        });

        add(btnbooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 157, 50));


        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 160, 50));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel2.setText("TRANSPORT MANAGER WORK AREA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

    }// </editor-fold>//GEN-END:initComponents

    private void btnbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookingActionPerformed
        // TODO add your handling code here:
        TransportBooking ta = new TransportBooking(container,ua, ecosystem);
         container.add("TransportBooking",ta);
         CardLayout layout = (CardLayout) container.getLayout();
         layout.show(container,"TransportBooking");
    }//GEN-LAST:event_btnbookingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.first(container);
            db.storeSystem(ecosystem);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmtActionPerformed
        // TODO add your handling code here:
         Transport ta = new Transport(container,ua, ecosystem);
         container.add("AddTransportJPanel",ta);
         CardLayout layout = (CardLayout) container.getLayout();
         layout.show(container,"AddTransportJPanel");
    }//GEN-LAST:event_btnmtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbooking;
    private javax.swing.JButton btnmt;
    private javax.swing.JButton jButton1;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

    // End of variables declaration//GEN-END:variables
}
