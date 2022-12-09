/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Venue;

import Business.NGO.Donation;
import Business.UserAccount.UserAccount;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author sarveshzeke
 */
public class VenueDirectory {
    
    ArrayList<Venue> venueList;
    
    

    public ArrayList<Venue> getVenueList() {
        return venueList;
    }

    public void setVenueList(ArrayList<Venue> venueList) {
        this.venueList = venueList;
    }
    
    public void addVenue(Venue venue)
    {
        if(venueList == null) venueList = new ArrayList<Venue>();
        venueList.add(venue);
    }
    
    public Venue getVenue(String venueName)
    {
        for(Venue v: venueList)
        {
            if(v.getVenueName().equals(venueName))
                return v;
        }
        return null;
    }
    
    public Venue getVenueUser(UserAccount ua)
    {
        for(Venue v: venueList)
        {
            if(v.getUserAccount().equals(ua))
                return v;
        }
        return null;
    }
    

    public void assignVenue(Venue venue,Date date,Donation donation)
    {
             HashMap<Date,Boolean> venueStatus;
             donation.setVenue(venue);
                donation.setDate(date);
                donation.setVenueStatus("Registered");
                venueStatus = venue.getVenueAvailability();
                venueStatus.put(date, false);
                
                //return v;
       // return null;
    }		
	
    
    public void requestVenue(String venueName,Donation match,Date date)
    {
        HashMap<Donation,Date> venueRequests;
        for(Venue v: venueList)
        {
            if(v.getVenueName().equals(venueName))
            {
                if(v.getDonationRequests()== null) v.setMatchRequests(new HashMap<Donation,Date>());
                venueRequests = v.getDonationRequests();
                venueRequests.put(match, date);
                
            }
        }
    }
    
    
    public boolean checkAvailability(String venueName, Date date)
    {
        boolean status = true;
        boolean dateExists = false;
        HashMap<Date,Boolean> venueStatus;
        for(Venue v: venueList)
        {
            if(v.getVenueName().equals(venueName))
            {
                venueStatus = v.getVenueAvailability();
                Set<Date> dates = venueStatus.keySet();
                for(Date d:dates)
                {
                    if(d.equals(date)) dateExists = true;
                }
                if(dateExists == false) venueStatus.put(date, true);
                status = venueStatus.get(date);
            }
        }
        return status;
    }
    
    
    
    
    public ArrayList<Venue> getAvailbleVenues(Date date) throws ParseException
    {
        ArrayList<Venue> availbleVenues = new ArrayList<Venue>();
        for(Venue v: venueList)
        {
            if(v.checkAvailability(date))
            {
                availbleVenues.add(v);
            }
        }
        
        return availbleVenues;
    }
}

    

