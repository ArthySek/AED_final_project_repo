/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VolunteerRole;
import Business.Volunteer.VolunteerDirectory;
import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class VolunteerOrganization extends Organization {
    
     VolunteerDirectory vd ;

    public VolunteerDirectory getVd() {
        return vd;
    }

    public void setVd(VolunteerDirectory vd) {
        this.vd = vd;
    }
    public VolunteerOrganization()
    {
        super(Organization.Type.Volunteer.getValue());
        vd = new VolunteerDirectory();
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VolunteerRole());
        return roles;
    }
    
}
