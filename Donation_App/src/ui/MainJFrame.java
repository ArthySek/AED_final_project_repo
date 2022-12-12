/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Image;
import static java.lang.System.exit;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.util.Date;
import javax.swing.JOptionPane;
import ui.AnalyticsTeam.NgoAnalyticsTeamPanel;
import ui.CompanyManager.CompanyManagerWorkArea;
import ui.EquipmentSupplierRole.EquipmentSupplierWorkSpace;
import ui.LocationManagerRole.LocationManagerWorkArea;
import ui.NGOAdminRole.AdminWorkArea;
import ui.SponsorRole.SponsorWorkArea;
import ui.SystemAdminRole.SystemAdminWorkArea;
import ui.TransportService.TransportManagerWorkArea;
import ui.VolunteerRole.VolunteerWorkArea;
import ui.logistics.LogisticsWorkArea;

/**
 *
 * @author balajis
 */

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
      Ecosystem ecosystem;
     UserAccountDirectory useraccountDirectory;
     UserAccount ua;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
     
     
    public MainJFrame() {
        initComponents();
      
        ecosystem = dB4OUtil.retrieveSystem();
       useraccountDirectory = ecosystem.getUserAccountDirectory();
      
          date.setText(" "+String.valueOf(LocalTime.now().getHour()) + ":"+String.valueOf(LocalTime.now().getMinute()));
          //lblHome.setIcon(new ImageIcon(new ImageIcon("src/Business/Util/Icon/Home.png").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
        ArrayList<UserAccount> users = useraccountDirectory.getUserAccountList();
        
         for(UserAccount ua: users)
         {
             if(ua.getUsername().equals("volunteer4") || ua.getUsername().equals("volunteer3"))
             {
                 ua.setEmail("arthyssekar@gmail.com");
             }
         }
        jLabel4.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/My project.jpg").getImage().getScaledInstance(520, 300, Image.SCALE_DEFAULT)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        container = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        usernametf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        passtf1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(630, 530));
        getContentPane().setLayout(new java.awt.CardLayout());

        container.setLayout(new java.awt.CardLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MainPanel.add(usernametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 290, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 100, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 100, 40));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Username:");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 80, 20));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Password:");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 80, 20));

        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 100, 40));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setText("Activate");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, 40));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/My project.jpg"))); // NOI18N
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, 280));
        MainPanel.add(passtf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 290, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setText("DONATE - HELP PEOPLE IN NEED");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 390, -1));

        date.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        date.setText("<Date Time>");
        MainPanel.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 180, 30));

        container.add(MainPanel, "card2");

        getContentPane().add(container, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username = usernametf.getText();
        String password = passtf1.getText();
       
        
        if(useraccountDirectory.authenticateUseraccount(username, password))
        {
            this.ua = useraccountDirectory.authenticateUser(username, password);
           
        if(ua.getRole().toString().equals("Business.Role.SystemAdminRole"))
        {
            SystemAdminWorkArea sa = new SystemAdminWorkArea(container, ecosystem);
            container.add("Sysadmin",sa);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"Sysadmin");
        }
        if(ua.getRole().toString().equals("Business.Role.AdminRole"))
        {
            AdminWorkArea awa = new AdminWorkArea(container,ua,ecosystem);
            container.add("adminWorkarea",awa);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"adminWorkarea");
        }
        
        if(ua.getRole().toString().equals("Business.Role.CompanyManagerRole"))
        {
            CompanyManagerWorkArea cm = new CompanyManagerWorkArea(container, ua,ecosystem);
            container.add("companyManager",cm);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"companyManager");
        }
        
        if(ua.getRole().toString().equals("Business.Role.VenueManagerRole"))
        {
            LocationManagerWorkArea vm = new LocationManagerWorkArea(container, ua,ecosystem);
            container.add("venueManager",vm);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"venueManager");
        }
        if(ua.getRole().toString().equals("Business.Role.VolunteerRole"))
        {
            VolunteerWorkArea dw = new VolunteerWorkArea(container, ua,ecosystem);
            container.add("volunteerWorkArea",dw);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"volunteerWorkArea");
        }
        
        if(ua.getRole().toString().equals("Business.Role.SponsorRole"))
        {
            SponsorWorkArea swa = new SponsorWorkArea(container, ua,ecosystem);
            container.add("sponsorWorkArea",swa);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"sponsorWorkArea");
        }
        

        
         if(ua.getRole().toString().equals("Business.Role.SupplierRole"))
        {
            EquipmentSupplierWorkSpace swa = new EquipmentSupplierWorkSpace(container, ua,ecosystem);
            container.add("supplierWorkSpace",swa);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"supplierWorkSpace");
        }
         
         if(ua.getRole().toString().equals("Business.Role.LogisticRole"))
        {
            LogisticsWorkArea lwaa = new LogisticsWorkArea(container,ua,ecosystem);
            container.add("logisticWorkArea",lwaa);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"logisticWorkArea");
        }
        
        if(ua.getRole().toString().equals("Business.Role.AnalyticsteamRole"))
        {
            NgoAnalyticsTeamPanel atp = new NgoAnalyticsTeamPanel(container,ecosystem);
            container.add("analytics",atp);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"analytics");
        }
       
        
        if(ua.getRole().toString().equals("Business.Role.TravelRole"))
        {
            TransportManagerWorkArea tm = new TransportManagerWorkArea(container,ua,ecosystem);
            container.add("transportManager",tm);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"transportManager");
        }
       
       }
        else
            
        JOptionPane.showMessageDialog(this, "Invalid credentials");
        usernametf.setText(null);
        passtf1.setText(null);
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            RegisterPanel rp = new RegisterPanel(container,ecosystem);
            container.add("Register",rp);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"Register");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            AccountActivationPanel aa = new AccountActivationPanel(container,ecosystem);
            container.add("accountActivate",aa);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"accountActivate");
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel container;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField passtf1;
    private javax.swing.JTextField usernametf;
    // End of variables declaration//GEN-END:variables
}
