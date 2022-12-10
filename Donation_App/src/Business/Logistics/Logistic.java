/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logistics;

import Business.UserAccount.UserAccount;

/**
 *
 * @author rohinibalasubramanian
 */
public class Logistic {
    String logisticManager;
    String logisticCompany;
    String status;
    UserAccount ua;
    String location;
    public Logistic(UserAccount ua,String logisticCompany,String logisticManager)
    {
        this.ua = ua;
        this.logisticCompany = logisticCompany;
        this.logisticManager = logisticManager;
    }

    public String getLogisticManager() {
        return logisticManager;
    }

    public void setLogisticManager(String logisticManager) {
        this.logisticManager = logisticManager;
    }

    public String getLogisticCompany() {
        return logisticCompany;
    }

    public void setLogisticCompany(String logisticCompany) {
        this.logisticCompany = logisticCompany;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
