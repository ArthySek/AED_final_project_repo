/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.NGO.NGODirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class NGOOrganization extends Organization {
    
    private NGODirectory ngoDirectory;

    public NGODirectory getNgoDirectory() {
        return ngoDirectory;
    }

    public void setNgoDirectory(NGODirectory ngoDirectory) {
        this.ngoDirectory = ngoDirectory;
    }

    public NGOOrganization()
    {
        super(Organization.Type.NGO.getValue());
        ngoDirectory = new NGODirectory();
    }
    
    
    
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdminRole());
        return roles;
    }
    
}
