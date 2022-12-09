/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGO;

import Business.Company.Company;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class NGODirectory {
    ArrayList<NGO> ngolist = new ArrayList<NGO>();

    public ArrayList<NGO> getNgolist() {
        return ngolist;
    }

    public void setNgolist(ArrayList<NGO> ngolist) {
        this.ngolist = ngolist;
    }
    
    

    public boolean checkCompanyNameUnique(String companyName)
    {
        for(NGO s: ngolist)
        {
            ArrayList<Company> comp = s.getCompanyofNGo();
            for(Company t: comp)
            {
                if(t.getCompanyName().equals(companyName))
                    return true;
            }
        }
        return false;
    }
    
    
    public void addNGO(NGO ngo)
    {
        ngolist.add(ngo);
    }
    
    
    public NGO getNGO(String ngoname)
    {
        for(NGO s: ngolist)
        {
            if(s.getNGOName().equals(ngoname))
                return s;
        }
        return null;
    }
    
    
        public NGO getNGO(UserAccount ua)
    {
        ArrayList<Company> comp;
        for(NGO s: ngolist)
        {
            comp = s.getCompanyofNGo();
            for(Company t: comp)
            {
                if(t.getUserAccount().equals(ua))
                    return s;
            }
        }
        return null;
    }
    
    
    public NGO getNGo(String compName,String ngoName)
    {
        for(NGO s: ngolist)
        {
            if(s.getNGOName().equals(ngoName)){
            ArrayList<Company> comp = s.getCompanyofNGo();
            for(Company t: comp)
            {
                if(t.getCompanyName().equals(compName))
                    return s;
            }
            }
        }
        return null;
    }
    
    public void addCompToNGO(String ngoName,Company comp)
    {
        for(NGO s: ngolist)
        {
            if(s.getNGOName().equals(ngoName))
            {
                s.addCompanyRequest(comp);
            }
        }
    }
    
    public Donation getDonation(String donationName,String ngoName)
    {
        for(NGO s: ngolist)
        {
            if(s.getNGOName().equals(ngoName))
            {
            ArrayList<Donation> donations = s.getDonations();
            for(Donation m: donations)
            {
                if(String.valueOf(m.getDonation_no()).equals(donationName))
                    return m;
            }
            }
        }
        return null;
    }
    
    public Company getCompany(UserAccount ua)
    {
        ArrayList<Company> comp;
        for(NGO s: ngolist)
        {
            comp = s.getCompanyofNGo();
            for(Company t: comp)
            {
                if(t.getUserAccount().equals(ua))
                    return t;
            }
        }
        return null;
    }
    
    public Company getCompany(String compName,String ngoName)
    {
        for(NGO n: ngolist)
        {
            if(n.getNGOName().equals(ngoName)){
            ArrayList<Company> companies = n.getCompanyofNGo();
            for(Company c: companies)
            {
                if(c.getCompanyName().equals(compName))
                    return c;
            }
            }
        }
        return null;
    }
    
    public void sponsorBudgetToCompany(int budget,String compName,String ngoName)
    {
        ArrayList<Company> comp;
        for(NGO s: ngolist)
        {
            if(s.getNGOName().equals(ngoName)){
            comp = s.getCompanyofNGo();
            for(Company t: comp)
            {
                if(t.getUserAccount().equals(compName))
                {
                    int compBudget = t.getBudget();
                    t.setBudget(compBudget + budget);
                }
            }}
        }
    }
}
