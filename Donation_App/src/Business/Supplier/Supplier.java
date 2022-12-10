/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author rohinibalasubramanian
 */
public class Supplier {
    
     String supplierName;
    UserAccount ua;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }
    public Supplier(UserAccount ua,String supplierName)
    {
        this.ua = ua;
        this.supplierName = supplierName;
        equipment = new HashMap<String,Integer>();
        orders = new ArrayList<Order>();
    }
    
    ArrayList<Order> orders;

    public HashMap<String, Integer> getEquipment() {
        return equipment;
    }

    public void setEquipment(HashMap<String, Integer> equipment) {
        this.equipment = equipment;
    }
    
    HashMap<String,Integer> equipment;
}


