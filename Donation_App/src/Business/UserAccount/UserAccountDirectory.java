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

 * @author arthy
=======
 
 */
public class userAccountDirectory {
    ArrayList<UserAccount> UserAccountList = new ArrayList<UserAccount>();

    ArrayList<UserAccount> accountAccessRequests = new ArrayList<UserAccount>();

    public ArrayList<UserAccount> getAccountAccessRequests() {
        return accountAccessRequests;
    }
    public void setAccountAccessRequests(ArrayList<UserAccount> accountAccessRequests) {
        this.accountAccessRequests = accountAccessRequests;
    }
    
    public userAccountDirectory() {
        UserAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return UserAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : UserAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public boolean authenticateUserAccount(String username, String password){
        for (UserAccount ua : UserAccountList)
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
        UserAccount UserAccount = new UserAccount();
        UserAccount.setUsername(username);
        UserAccount.setPassword(password);
        UserAccount.setEmployee(employee);
        UserAccount.setRole(role);
        UserAccountList.add(UserAccount);
        return UserAccount;
    }
    
    
       public UserAccount accessUserAccountRequest(String username, Employee employee, Role role){
        UserAccount UserAccount = new UserAccount();
        UserAccount.setUsername(username);
       // UserAccount.setPassword(password);
        UserAccount.setEmployee(employee);
        UserAccount.setRole(role);
        if(UserAccountList == null) setAccountAccessRequests(new ArrayList<UserAccount>());
        UserAccountList.add(UserAccount);
        return UserAccount;
    }
       
       
       public UserAccount addAdminAccess(String username, Employee employee)
      
       {
           UserAccount UserAccount = new UserAccount();
           for(UserAccount ua : UserAccountList)
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
            UserAccount.setUsername(username);
            UserAccount.setEmployee(employee);
            UserAccount.setRole(new AdminRole());
            UserAccountList.add(UserAccount);       
           return UserAccount;
       }
       
       
       public void provideAccess(String userName)
       {
           for(UserAccount u : UserAccountList)
           {
               if(u.getUsername().equals(userName))
               {
                   u.setAccountStatus("Access granted");
               }
           }
       }
       
       
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : UserAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public UserAccount getUserToGrantAccess(String username){
        for (UserAccount ua : UserAccountList){
            if (ua.getUsername().equals(username))
                return ua;
        }
        return null;
    }
}

