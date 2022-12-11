/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.EmployeeDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author arthy
 */
public class Ecosystem extends Organization {
    
    EmployeeDirectory employeeDirectory;
    UserAccountDirectory UserAccountDirectory;
    EnterpriseDirectory enterpriseDirectory;

    public Ecosystem(EmployeeDirectory employeeDirectory, UserAccountDirectory UserAccountDirectory, EnterpriseDirectory enterpriseDirectory) 
    {
        super();
        this.employeeDirectory = employeeDirectory;
        this.UserAccountDirectory = UserAccountDirectory;
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public Ecosystem(EmployeeDirectory employeeDirectory, UserAccountDirectory UserAccountDirectory, EnterpriseDirectory enterpriseDirectory, String name) {
        super(name);
        this.employeeDirectory = employeeDirectory;
        this.UserAccountDirectory = UserAccountDirectory;
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return UserAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory UserAccountDirectory) {
        this.UserAccountDirectory = UserAccountDirectory;
    }
    private static Ecosystem business;
    public static Ecosystem getInstance(){
        if(business==null){
            business=new Ecosystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private Ecosystem(){
        super(null);
    }

    
    public boolean checkuserunique(String username){
        
        return true;
    }
    
}
