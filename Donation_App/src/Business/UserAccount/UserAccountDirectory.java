/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//import javax.management.relation.Role;

/**
 *
 * @author rohinibalasubramanian
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> userAccountList = new ArrayList<UserAccount>();

    ArrayList<UserAccount> accountAccessRequests = new ArrayList<UserAccount>();

    public ArrayList<UserAccount> getAccountAccessRequests() {
        return accountAccessRequests;
    }
    public void setAccountAccessRequests(ArrayList<UserAccount> accountAccessRequests) {
        this.accountAccessRequests = accountAccessRequests;
    }
    
    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public boolean authenticateUseraccount(String username, String password){
        for (UserAccount ua : userAccountList)
        {
            if(ua.getUsername().equals(username) && ua.getPassword() == null) 
            {
               return false;
            }
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    
       public UserAccount accessUseraccountRequest(String username, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
       // userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        if(userAccountList == null) setAccountAccessRequests(new ArrayList<UserAccount>());
        userAccountList.add(userAccount);
        return userAccount;
    }
       
       
       public UserAccount addAdminAccess(String username, Employee employee)
      
       {
           UserAccount userAccount = new UserAccount();
           for(UserAccount ua : userAccountList)
           {
               if(ua.getRole().toString().equals("Business.Role.Admin"))
               {
                   ua.setUsername(username);
                   ua.setEmployee(employee);
                   ua.setAccountStatus("Access requested");
                   ua.setPassword(null);
                   return ua;
               }
           }   
            userAccount.setUsername(username);
            userAccount.setEmployee(employee);
            userAccount.setRole(new AdminRole());
            userAccountList.add(userAccount);       
           return userAccount;
       }
       
       
       public void provideAccess(String userName)
       {
           for(UserAccount u : userAccountList)
           {
               if(u.getUsername().equals(userName))
               {
                   u.setAccountStatus("Access granted");
               }
           }
       }
       
       
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public UserAccount getUserToGrantAccess(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return ua;
        }
        return null;
    }
}

