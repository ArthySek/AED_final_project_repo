/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import Business.Company.Company;
import Business.UserAccount.UserAccount;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rohinibalasubramanian
 */
public class VolunteerDirectory {
    ArrayList<Volunteer> volunteers;
   int volunteerId = 100;
   String status;

    public ArrayList<Volunteer> getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(ArrayList<Volunteer> volunteers) {
        this.volunteers = volunteers;
    }
   
    
    public void addVolunteer(Volunteer volunteer)
    {
        if(volunteers == null) volunteers= new ArrayList<Volunteer>();
        volunteer.setvolunteerId(volunteerId);
        volunteers.add(volunteer);
        volunteerId++;
    }
    
    public Volunteer getVolunteer(String volunteerName)
    {
        for(Volunteer v: volunteers)
        {
            if(v.getvolunteerName().equals(volunteerName))
                return v;
        }
        return null;
            
    }
    
    public Volunteer getVolunteer(UserAccount ua)
    {
        for(Volunteer v: volunteers)
        {
            if(v.getUa().equals(ua))
                return v;
        }
        return null;
    }
    
    public ArrayList<Volunteer> getvolunteersByDesignation(String designation)
    {
        ArrayList<Volunteer> volunteersWithDesination = new ArrayList<Volunteer>();
        for(Volunteer v: volunteers)
        {
            if(v.getvolunteerDesignation().equals(designation))
              volunteersWithDesination.add(v);
        }
        return volunteersWithDesination;        
    }
    
    public ArrayList<Date> getAvailbleSlots(Date date,String volunteerName) throws ParseException
    {
        ArrayList<Date> availbleSlots = new ArrayList<Date>();
        Volunteer v=null;
        for(Volunteer vc : volunteers)
        {
            if(vc.getvolunteerName().equals(volunteerName))
                v=vc;
        }
        Map<Date,Boolean> timeMap = v.getvolunteerAvailability().get(date);
        for(Date dt : timeMap.keySet()){
            if(timeMap.get(dt) == Boolean.TRUE)
                availbleSlots.add(dt);
        }
        return availbleSlots;
    }
    
     public void requestVolunteer(Date date,Date time,Volunteer volunteer,Company c) throws ParseException{
 
         for(Volunteer v: volunteers)
        {
            if(v.getvolunteerName().equals(volunteer.getvolunteerName()))
            {       
                if(v.getvolunteerAvailability().containsKey(date))
                    v.getvolunteerAvailability().get(date).put(time,Boolean.FALSE);
                else{
                    v.getvolunteerAvailability().put(date, v.timeMap());
                    v.getvolunteerAvailability().get(date).put(time,Boolean.FALSE);
                }
                if(v.getCompanyMapping().containsKey(c)){
                 if(v.getCompanyMapping().get(c).containsKey(date))
                       v.getCompanyMapping().get(c).get(date).add(time);
                 else{
                     v.getCompanyMapping().get(c).put(date, new ArrayList<Date>());
                     v.getCompanyMapping().get(c).get(date).add(time);
                 }
                 
                     }
          else{
              v.getCompanyMapping().put(c, new HashMap<Date,List<Date>>());
               v.getCompanyMapping().get(c).put(date, new ArrayList<Date>());
               v.getCompanyMapping().get(c).get(date).add(time);
          }
            }
          
        }
     } 
     
     public void updateStatusDoctor(Date date,Date time,Volunteer volunteer) throws ParseException{
 
         for(Volunteer v: volunteers)
        {
            if(v.getUa().equals(volunteer.getUa()))
            {    
              //  if(availbility.equals("Unavailable")){
                if(v.getvolunteerAvailability().containsKey(date))
                    v.getvolunteerAvailability().get(date).put(time,Boolean.FALSE);
                else{
                    v.getvolunteerAvailability().put(date, v.timeMap());
                    v.getvolunteerAvailability().get(date).put(time,Boolean.FALSE);
                }
            //}
                
               
               /* if(availbility.equals("Available")){
                if(d.getDoctorAvailability().containsKey(date))
                    d.getDoctorAvailability().get(date).put(time,Boolean.TRUE);
                else{
                    d.getDoctorAvailability().put(date, d.timeMap());
                    d.getDoctorAvailability().get(date).put(time,Boolean.TRUE);
                }} */
                    
            }
            }
          
        }
}
