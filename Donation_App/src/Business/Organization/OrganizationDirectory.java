/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.NGO.getValue())){
            organization = new NGOOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Company.getValue())){
            organization = new CompanyOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Sponsors.getValue())){
            organization = new SponsorsOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.EquipmentSupplier.getValue())){
            organization = new DonationSupplierOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Volunteer.getValue())){
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Venue.getValue())){
            organization = new VenueOrganization();
            organizationList.add(organization);
        }
        
        
        else if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new CompanyManagerOrganization();
            organizationList.add(organization);
        }
        
      
        else if (type.getValue().equals(Organization.Type.People.getValue())){
            organization = new PeopleOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
    
}
