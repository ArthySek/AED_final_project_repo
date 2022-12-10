/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Logistics.Logistic;
import Business.Delivery.Request;
import Business.Delivery.Delivery;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author chara
 */
public class SupplierDirectory {
    ArrayList<Supplier> supplierList = new ArrayList<Supplier>();

    ArrayList<Logistic> logistics;
    
    ArrayList<Delivery> travelTransport;

    public ArrayList<Delivery> getTravelTransport() {
        return travelTransport;
    }

    public void setTravelTransport(ArrayList<Delivery> travelTransport) {
        this.travelTransport = travelTransport;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Logistic> getLogistics() {
        return logistics;
    }

    public void setLogistics(ArrayList<Logistic> logistics) {
        this.logistics = logistics;
    }
   int orderId;
  
    
    public SupplierDirectory()
    {
        supplierList = new ArrayList<Supplier>();
        orders = new ArrayList<Order>();
        travelTransport = new ArrayList<Delivery>();
        logistics = new ArrayList<Logistic>();
    }
    
    public void addSupplier(Supplier supplier)
    {
        supplierList.add(supplier);
    }
    
    public Supplier getSupplier(String supplierName)
    {
        for(Supplier s: supplierList)
        {
            if(s.getSupplierName().equals(supplierName))
            {
                return s;
            }
        }
        return null;
    }
    
    public Supplier getSupplier(UserAccount ua)
    {
        for(Supplier s: supplierList)
        {
            if(s.getUa().equals(ua))
            {
                return s;
            }
        }
        return null;
    }
    
    public Delivery getTravelTransport(UserAccount ua)
    {
        for(Delivery t: travelTransport)
        {
            if(t.getUserAccount().equals(ua))
            {
                return t;
            }
        }
        return null;
    }
    
     public Delivery getTravelTransport(String travelTransportName)
    {
        for(Delivery t: travelTransport)
        {
            if(t.getTransportName().equals(travelTransportName))
            {
                return t;
            }
        }
        return null;
    }
    
    ArrayList<Order> orders;
    public void addOrder(Order o)
    {
        o.setOrderId(orderId);
        orders.add(o);
        orderId++;
    }
    
    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
    public Order getOrder(String orderId)
    {
        int orderNo = Integer.parseInt(orderId);
        for(Order o: orders)
        {
            if(o.getOrderId() == orderNo)
                return o;
        }
        return null;
    }
    
        public Request getRequest(String companyName,String transName,String destination)
    {
        for(Request r: travelRequests)
        {
            if(r.getTravelTeam().equals(companyName) && r.getTravelTransport().equals(transName) && r.getLocation().equals(destination))
                return r;
        }
        return null;
        
    }
    
    ArrayList<Request> travelRequests;
    
    public void addTravelRequest(Request r)
    {
        if(travelRequests == null) setTravelRequests(new ArrayList<Request>());
        travelRequests.add(r);
    }

    public ArrayList<Request> getTravelRequests() {
        return travelRequests;
    }

    public void setTravelRequests(ArrayList<Request> travelRequests) {
        this.travelRequests = travelRequests;
    }
    public Logistic getLogistic(UserAccount usac)
    {
        for(Logistic l: logistics)
        {
            if(l.getUa().equals(usac))
                    return l;
        }
        return null;
    }
    public void addLogist(Logistic l)
    {
        if(logistics == null) setLogistics(new ArrayList<Logistic>());
        this.logistics.add(l);
    }
    public void addTravelTransport(Delivery t)
    {
        if(travelTransport == null) setTravelTransport(new ArrayList<Delivery>());
        travelTransport.add(t);
    }
    
}
