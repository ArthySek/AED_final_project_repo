/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author ram.a
 */
public abstract class Role {


    
    public enum RoleType{
        Admin("Admin Role"),
        Volunteer("Volunteer"),
       // PlayerRole("Player Role"),
        SystemAdmin("System Admin Role"),
      //  Coach("Coach Role"),
     //   DataAnalyst("Data Analyst Role"),
        Supplier("Equipment Supplier Role"),
        Sponsor("Sponsor Role"),
        CompanyManager("Company Manager Role"),
        VenueManager("Venue Manager Role"),
        LogisticRole("Logistic Manager Role"),
        DataAnalystRole("Data Analyst Role");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
        public String getRoleType()
        {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            Ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    
    
}
