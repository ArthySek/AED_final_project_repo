/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sponsor;

import Business.Company.Company;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ram.a
 */
public class SponsorDirectory {
    ArrayList<Sponsor> sponsorsList = new ArrayList<Sponsor>();

    public ArrayList<Sponsor> getSponsorsDirectory() {
        return sponsorsList;
    }

    public void setSponsorsDirectory(ArrayList<Sponsor> sponsorsDirectory) {
        this.sponsorsList = sponsorsDirectory;
    }
    
    public Sponsor getSponsor(UserAccount ua)
    {
        for(Sponsor s: sponsorsList)
        {
            if(s.getUserAccount().equals(ua))
                return s;
        }
        return null;
    }
    
       public Sponsor getSponsor(String spName)
    {
        for(Sponsor s: sponsorsList)
        {
            if(s.getSponsorName().equals(spName))
                return s;
        }
        return null;
    }
    
       
    public void sponsorToCompany(String sponsorName,int budget,Company comp)
    {
        Sponsor sponsor = getSponsor(sponsorName);
        sponsor.setSponsorship(comp, budget);
        
    }
       
    public void addCompanyToSponsored(String  CompanyName,String sponsorName)
    {
        
        for(Sponsor s: sponsorsList)
        {
            if(s.getSponsorName().equals(sponsorName))
            {
                s.getSponsoredCompanies().add(CompanyName);
            }
        }
    }
    
    public void offerToCompany(Sponsor sponsor,Company comp,int budget)
    {
        HashMap<Company,Integer> offer;
        HashMap<Company,String> offerStatus;
        
        for(Sponsor s: sponsorsList)
        {
            if(s.equals(sponsor))
            {
                if(s.getSponsoredRequests() == null) s.setSponsoredRequests(new HashMap<Company,Integer>());
                offer = s.getSponsoredRequests();
                offer.put(comp, budget);
                if(s.getOfferStatus() == null) s.setOfferStatus(new HashMap<Company,String>());
                offerStatus = s.getOfferStatus();
                offerStatus.put(comp,"Requested");
                
                
            }
        }
        
    }

    
    
    public void addSponsor(Sponsor sponsor)
    {
        sponsorsList.add(sponsor);
    }
}
