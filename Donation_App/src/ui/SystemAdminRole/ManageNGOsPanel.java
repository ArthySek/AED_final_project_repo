/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminRole;

import Business.Ecosystem;
import Business.NGO.NGO;
import Business.NGO.NGODirectory;
import java.awt.CardLayout;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarveshzeke
 */
public class ManageNGOsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNGOsPanel
     */
    JPanel container;
    Ecosystem ecosystem;
    NGODirectory ngodir;
    
    public ManageNGOsPanel(JPanel container,Ecosystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.container = container;
        ngodir = ecosystem.getEnterpriseDirectory().getNGODirectory();
        populatetable();

        jButton2.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.png").getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT)));
        jButton2.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/background.jpeg").getImage().getScaledInstance(2609, 1600, Image.SCALE_DEFAULT)));


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        jLabel2 = new javax.swing.JLabel();

        jScrollPane1 = new javax.swing.JScrollPane();
        ngotbl = new javax.swing.JTable();
        ngotf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jLabel2.setPreferredSize(new java.awt.Dimension(700, 600));

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setSize(new java.awt.Dimension(700, 600));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ngotbl.setBackground(new java.awt.Color(255, 204, 204));
        ngotbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NGO", "Contributing Companies"
            }
        ));
        jScrollPane1.setViewportView(ngotbl);


        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 500, 120));
        add(ngotf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 190, 40));


        jButton1.setText("Add NGO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 300, 40));

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 100, 50));

        jLabel3.setFont(new java.awt.Font("Muna", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("MANAGE NGO ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 170, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/background.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -30, -1, -1));

    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.show(container,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NGO ngo = new NGO(ngotf.getText());
        ngodir.addNGO(ngo);
        populatetable();
        ngotf.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ngotbl;
    private javax.swing.JTextField ngotf;
    // End of variables declaration//GEN-END:variables

 

    private void populatetable() {
        
        ArrayList<NGO> ngolist = ngodir.getNgolist();
        DefaultTableModel dt = (DefaultTableModel) ngotbl.getModel();
        dt.setRowCount(0);
        for(NGO s: ngolist)
        {
            String[] row = {s.getNGOName(),String.valueOf(s.getNoOfcompany())};
            dt.addRow(row);
        }
        ngotbl.setModel(dt);
    }
    }

