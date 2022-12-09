/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SponsorRole;
import Business.Sponsor.SponsorDirectory;
import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class SponsorsOrganization extends Organization {
    
    SponsorDirectory sponsorDirectory ;

    public SponsorDirectory getSponsorDirectory() {
        return sponsorDirectory;
    }

    public void setSponsorDirectory(SponsorDirectory sponsorDirectory) {
        this.sponsorDirectory = sponsorDirectory;
    }
    public SponsorsOrganization()
    {
        super(Organization.Type.Sponsors.getValue());
        sponsorDirectory = new SponsorDirectory();
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SponsorRole());
        return roles;
    }
    
    
}
