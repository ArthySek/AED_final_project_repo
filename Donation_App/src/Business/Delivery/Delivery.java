/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Delivery;

import Business.UserAccount.UserAccount;
import java.util.HashMap;

/**
 *
 * @author ram.a
 */
public class Delivery {
    String transportName;
    UserAccount userAccount;
    String transportType;
    int cost;

    HashMap<String,Integer> transportTypes;
    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Delivery(String transportName) {
        this.transportName=transportName;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public HashMap<String, Integer> getTransportTypes() {
        return transportTypes;
    }

    public void setTransportTypes(HashMap<String, Integer> transportTypes) {
        this.transportTypes = transportTypes;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public Delivery(UserAccount userAccount, String transportName){
        
        this.transportName=transportName;
        this.userAccount=userAccount;
        transportTypes = new HashMap<String,Integer>();
    }
    
}

    

