/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Delivery;

import java.util.Date;

/**
 *
 * @author ram.a
 */
public class Request {
    String travelTransport;
    String travelTeam;
    String status;
    Date date;
    int travelAmount;
    String location;

    public String getTravelTransport() {
        return travelTransport;
    }

    public void setTravelTransport(String travelTransport) {
        this.travelTransport = travelTransport;
    }

    public String getTravelTeam() {
        return travelTeam;
    }

    public void setTravelTeam(String travelTeam) {
        this.travelTeam = travelTeam;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTravelAmount() {
        return travelAmount;
    }

    public void setTravelAmount(int travelAmount) {
        this.travelAmount = travelAmount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public Request(String travelTeam,String travelTransport)
    {
        this.travelTeam = travelTeam;
        this.travelTransport = travelTransport;
        this.status = "Requested";
    }
}
