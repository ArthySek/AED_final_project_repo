/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VenueManagerRole;
import Business.Venue.VenueDirectory;
import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class VenueOrganization extends Organization {
    
    VenueDirectory vd;

    public VenueDirectory getVd() {
        return vd;
    }

    public void setVd(VenueDirectory vd) {
        this.vd = vd;
    }
    public VenueOrganization()
    {
        super(Organization.Type.Venue.getValue());
        vd = new VenueDirectory();
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VenueManagerRole());
        return roles;
    }
    
    
}
