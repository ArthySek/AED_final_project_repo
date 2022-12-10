/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SponsorRole;
import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class PeopleOrganization extends Organization {
    
     public PeopleOrganization()
    {
        super(Organization.Type.People.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SponsorRole());
        return roles;
    }
    
}
