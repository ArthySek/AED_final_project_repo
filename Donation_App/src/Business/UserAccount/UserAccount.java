/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.WorkQueue.WorkQueue;
import Business.Role.Role;
//import javax.management.relation.Role;

/**
 *
 * @author rohinibalasubramanian
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    String passcode;
    String email;
    String accountStatus;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public UserAccount() {
        workQueue = new WorkQueue();
        this.accountStatus = "Access requested";
    }
     public WorkQueue getWorkQueue() {
        return workQueue;
    }
     
    @Override
    public String toString() {
        return username;
    }   
}
