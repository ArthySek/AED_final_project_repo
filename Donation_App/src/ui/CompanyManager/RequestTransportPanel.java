/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CompanyManager;

import Business.Company.Company;
import Business.Delivery.Delivery;
import Business.Delivery.Request;
import Business.Ecosystem;
import Business.NGO.NGODirectory;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import Business.validations.Integerverfier;
import Business.validations.Stringverfier;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author balajis
 */
public class RequestTransportPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestTransportPanel
     */
     static String transportype;
    static String transportvariant;

    public static String getTtype() {
        return transportype;
    }

    public static void setTtype(String transportype) {
        RequestTransportPanel.transportype = transportype;
    }

    public static String getTvariant() {
        return transportvariant;
    }

    public static void setTvariant(String transportvariant) {
        RequestTransportPanel.transportvariant = transportvariant;
    }

    JPanel container;
    Ecosystem ecosystem;
    UserAccount ua;
    Company company;
    NGODirectory ngodir;
    SupplierDirectory supplierdir;
    
    public RequestTransportPanel(JPanel container,UserAccount ua,Ecosystem ecosystem) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.ua = ua;
        ngodir = ecosystem.getEnterpriseDirectory().getNGODirectory();
        supplierdir = ecosystem.getEnterpriseDirectory().getSupplierDirectory();
        company = ngodir.getCompany(ua);
        populatetable();
        addVerifiers();
        jButton2.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.png").getImage().getScaledInstance(100,50, Image.SCALE_DEFAULT)));

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
        reqtransporttbl = new javax.swing.JTable();
        destinationtf = new javax.swing.JTextField();
        budgettf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setSize(new java.awt.Dimension(700, 600));

        reqtransporttbl.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        reqtransporttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Company", "Transport Type", "Availability"
            }
        ));
        reqtransporttbl.setGridColor(new java.awt.Color(255, 0, 102));
        reqtransporttbl.setShowGrid(true);
        jScrollPane1.setViewportView(reqtransporttbl);

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Destination");

        jLabel2.setText("Date");

        jLabel3.setText("Budget");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(budgettf)
                                        .addComponent(destinationtf, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(destinationtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(budgettf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) reqtransporttbl.getModel();
        
        int selectedRow = reqtransporttbl.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Select a transport ");return;}
        
        String transportName = df.getValueAt(selectedRow,0).toString();
        Delivery d = supplierdir.getTravelTransport(transportName);
        Request request = new Request(company.getCompanyName(), transportName);
        request.setLocation(destinationtf.getText());
        request.setDate(datetf.getDate());
        request.setTravelAmount(Integer.parseInt(budgettf.getText()));
        supplierdir.addTravelRequest(request);
        JOptionPane.showMessageDialog(this, "Travel requested");
        budgettf.setText("");
        destinationtf.setText("");
        datetf.setDate(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.show(container,"CompanyManager");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField budgettf;
    private javax.swing.JTextField destinationtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reqtransporttbl;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        
        DefaultTableModel dx = (DefaultTableModel) reqtransporttbl.getModel();
        dx.setRowCount(0);
        ArrayList<Delivery> transports = supplierdir.getTravelTransport();
        HashMap<String,Integer> transport;
        for(Delivery d : transports)
        {
            
            if(d.getTransportTypes() == null) d.setTransportTypes(new HashMap<String,Integer>());
             transport = d.getTransportTypes();
            for(String s : transport.keySet())
            {
                String[] row = {d.getTransportName(),s,String.valueOf(transport.get(s))};
                dx.addRow(row);
            }
                
        }
        reqtransporttbl.setModel(dx);
        
    }

    private void addVerifiers() {
         InputVerifier Stringverfier = new Stringverfier();
         InputVerifier Integerverfier = new Integerverfier();

        destinationtf.setInputVerifier(Stringverfier);
        budgettf.setInputVerifier(Integerverfier);
    }
}
