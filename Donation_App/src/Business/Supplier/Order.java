/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author rohinibalasubramanian
 */
public class Order {
    int count = 100;
    int orderId;
    String orderStatus;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public Order(String item,int quantity,String supplierName,String companyName)
    {
        this.orderId = count;
        count++;
        this.item = item;
        this.quantity = quantity;
        this.status = "Ordered";
        this.supplierName = supplierName;
        this.companyName = companyName;
        this.logistics = "TBD";
        this.review = "";
        this.location = "";
        
    }
    String supplierName;
    String item;
    int quantity;
    String deliveryMan;
    String companyName;
    String status;
    String review;
    String logistics;

    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }

    public LocalDateTime getLocaldatetime() {
        return localdatetime;
    }

    public void setLocaldatetime(LocalDateTime localdatetime) {
        this.localdatetime = localdatetime;
    }
    Date date;
    LocalDateTime localdatetime;

}
