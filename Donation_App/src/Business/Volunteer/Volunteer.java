/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import Business.Company.Company;
import Business.UserAccount.UserAccount;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rohinibalasubramanian
 */
public class Volunteer {
     String volunteerName;
    UserAccount ua;
    Date date;
    HashMap<Date,Map<Date,Boolean>> volunteerAvailability ;
    HashMap<Company,HashMap<Date,List<Date>>> companyMapping;

    public HashMap<Date, Map<Date, Boolean>> getvolunteerAvailability() {
        return volunteerAvailability;
    }

    public void setvolunteerAvailability(HashMap<Date, Map<Date, Boolean>> volunteerAvailability) {
        this.volunteerAvailability = volunteerAvailability;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public String getvolunteerName() {
        return volunteerName;
    }

    public void setvolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws ParseException {
        this.date = date;
        if(!volunteerAvailability.containsKey(date))
        volunteerAvailability.put(date, this.timeMap());
    }



    public String getvolunteerDesignation() {
        return volunteerDesignation;
    }

    public void setvolunteerDesignation(String volunteerDesignation) {
        this.volunteerDesignation = volunteerDesignation;
    }
    int volunteerId;

    public HashMap<Company, HashMap<Date, List<Date>>> getCompanyMapping() {
        return companyMapping;
    }

    public void setCompanyMapping(HashMap<Company, HashMap<Date, List<Date>>> companyMapping) {
        this.companyMapping = companyMapping;
    }

    public int getVolunteerId() {
        return volunteerId;
    }

    public void setvolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }
    String volunteerDesignation;
    public Volunteer(UserAccount ua,String volunteerName,String volunteerDesignation) throws ParseException
    {
        this.volunteerName = volunteerName;
        this.volunteerDesignation = volunteerDesignation;
        this.ua = ua;
        if(volunteerAvailability == null)
           volunteerAvailability = new  HashMap<Date,Map<Date,Boolean>> ();
        if(companyMapping == null)
            companyMapping = new HashMap<Company,HashMap<Date,List<Date>>>();
                
        //doctorAvailability.put(new Date(), this.timeMap());
    }
    public Volunteer(UserAccount ua,String volunteerName)
    {
        this.volunteerName = volunteerName;
        //this.doctorDesignation = doctorDesignation;
        this.ua = ua;
    }
    
    public final  Map<Date,Boolean> timeMap() throws ParseException
    {
        Map<Date,Boolean> map = new HashMap<Date,Boolean>();
        SimpleDateFormat sdf = new SimpleDateFormat ("HH:mm");
        map.put(sdf.parse("09:00"), Boolean.TRUE);
        map.put(sdf.parse("10:00"), Boolean.TRUE);
        map.put(sdf.parse("11:00"), Boolean.TRUE);
        map.put(sdf.parse("12:00"), Boolean.TRUE);
        map.put(sdf.parse("13:00"), Boolean.TRUE);
        map.put(sdf.parse("14:00"), Boolean.TRUE);
        map.put(sdf.parse("15:00"), Boolean.TRUE);
        map.put(sdf.parse("16:00"), Boolean.TRUE);
        map.put(sdf.parse("17:00"), Boolean.TRUE);
        return map;
    }
    
}
