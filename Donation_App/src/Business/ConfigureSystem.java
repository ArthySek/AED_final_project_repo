/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author rohinibalasubramanian
 */
public class ConfigureSystem {
    
    
        public static Ecosystem configure(){
            
     Ecosystem system = Ecosystem.getInstance();
        EmployeeDirectory employeeDirectory = system.getEmployeeDirectory();
        if(employeeDirectory == null)
        {
            employeeDirectory = new EmployeeDirectory();
        }
        EnterpriseDirectory ed= system.getEnterpriseDirectory();
        if(ed == null)
         {
            ed = new EnterpriseDirectory();
         }
        
        /*Sysadmin*/
        Employee employee = employeeDirectory.createEmployee("sysadmin");
        UserAccountDirectory userAccountDirectory = system.getUserAccountDirectory();
        if(userAccountDirectory == null)
        {
            userAccountDirectory = new UserAccountDirectory();
        }
        UserAccount ua = userAccountDirectory.createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        system.setEmployeeDirectory(employeeDirectory);
        system.setUserAccountDirectory(userAccountDirectory);
        
        /*NGOEnterprise*/


        Enterprise ngoEnterprise = ed.AddNewEnterprise("NGOEnterprise", Enterprise.EnterpriseType.NGO);
        OrganizationDirectory ngoOrganizationDirectory = ngoEnterprise.getOrganizationDirectory();
        if(ngoOrganizationDirectory == null)
        {
            ngoOrganizationDirectory = new OrganizationDirectory();
        }
        ngoOrganizationDirectory.createOrganization(Organization.Type.NGO);
        ngoOrganizationDirectory.createOrganization(Organization.Type.Company);
        ngoOrganizationDirectory.createOrganization(Organization.Type.Admin);
       
     
        
        /*Venue Enterprse*/
        
        Enterprise venueEnterprise = ed.AddNewEnterprise("VenueEnterprise", Enterprise.EnterpriseType.Venue);
        OrganizationDirectory venueOrganizationDirectory = venueEnterprise.getOrganizationDirectory();
        if(venueOrganizationDirectory == null)
        {
            venueOrganizationDirectory = new OrganizationDirectory();
        }
        venueOrganizationDirectory.createOrganization(Organization.Type.Venue);
        venueOrganizationDirectory.createOrganization(Organization.Type.People);
        
        /*Sponsor Enterprise*/
        
        Enterprise sponsorEnterprise = ed.AddNewEnterprise("SponsorEnterprise", Enterprise.EnterpriseType.Sponsors);
        OrganizationDirectory sponsorOrganizationDirectory = sponsorEnterprise.getOrganizationDirectory();
        if(sponsorOrganizationDirectory == null)
        {
            sponsorOrganizationDirectory = new OrganizationDirectory();
        }
        sponsorOrganizationDirectory.createOrganization(Organization.Type.Sponsors);
        
        
        /*Volunteer Enterprise*/
        
        Enterprise volunteerEnterprise = ed.AddNewEnterprise("VolunteerEnterprise", Enterprise.EnterpriseType.Volunteer);
        OrganizationDirectory volunteerOrganizationDirectory = volunteerEnterprise.getOrganizationDirectory();
        if(volunteerOrganizationDirectory == null)
        {
            volunteerOrganizationDirectory = new OrganizationDirectory();
        }
        volunteerOrganizationDirectory.createOrganization(Organization.Type.Volunteer);
        
        
        /*Supplier Enterprise*/
        
        Enterprise supplierEnterprise = ed.AddNewEnterprise("SupplierEnterprise", Enterprise.EnterpriseType.EquipmentSupplier);
        OrganizationDirectory supplierOrganizationDirectory = supplierEnterprise.getOrganizationDirectory();
        if(supplierOrganizationDirectory == null)
        {
            supplierOrganizationDirectory = new OrganizationDirectory();
        }
        supplierOrganizationDirectory.createOrganization(Organization.Type.EquipmentSupplier);
                
        
        
        
        system.setEnterpriseDirectory(ed);
        return system;
    }
    
    
}
