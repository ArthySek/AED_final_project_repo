/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGO;

import Business.Company.Company;
import Business.Venue.Venue;
import java.util.Date;

/**
 *
 * @author sarveshzeke
 */
public class Donation {
    int donation_no;
    Company comp;
    Venue venue;
    Date date;
    int day;
    String venueStatus;
    String ngo;

    public String getNgo() {
        return ngo;
    }

    public void setNgo(String ngo) {
        this.ngo = ngo;
    }

    
    
    public Donation()
    {
        this.venueStatus = "Not Selected";
    }

    public String getVenueStatus() {
        return venueStatus;
    }

    public void setVenueStatus(String venueStatus) {
        this.venueStatus = venueStatus;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDonation_no() {
        return donation_no;
    }

    public void setDonation_no(int donation_no) {
        this.donation_no = donation_no;
    }

    public Company getComp() {
        return comp;
    }

    public void setComp(Company comp) {
        this.comp = comp;
    }
}
