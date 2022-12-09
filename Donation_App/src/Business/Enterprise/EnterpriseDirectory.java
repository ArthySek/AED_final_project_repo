/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.NGO.NGODirectory;
import Business.Organization.DonationSupplierOrganization;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.SponsorsOrganization;
import Business.Organization.VenueOrganization;
import Business.Organization.VolunteerOrganization;
import Business.Sponsor.SponsorDirectory;
import Business.Supplier.SupplierDirectory;
import Business.Venue.VenueDirectory;
import Business.Volunteer.VolunteerDirectory;
import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class EnterpriseDirectory {
    
     public static  ArrayList<Enterprise> enterpriseList;
   


    public  ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public  void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise AddNewEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
      
        
        if(type==Enterprise.EnterpriseType.NGO){
            enterprise=new NGOEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Volunteer){
            enterprise=new VolunteerEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.EquipmentSupplier){
            enterprise=new DonationSupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Venue){
            enterprise=new VenueEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Sponsors){
            enterprise=new SponsorsEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public NGODirectory getNGODirectory()
    {
         NGODirectory sd;
         NGOOrganization so;
        for(Enterprise e: enterpriseList)
        {
            OrganizationDirectory od = e.getOrganizationDirectory();
            ArrayList<Organization> orgList = od.getOrganizationList();
            for(Organization o :orgList)
            {
                if(o.getName().equals("NGO Organization"))
                {
                     so = (NGOOrganization) o;
                     sd  =  so.getNgoDirectory();
                     return sd;
                }
            }
        }
        return null;
    }
    
    
    public VenueDirectory getVenueDirectory()
    {
         VenueDirectory vd;
         VenueOrganization vo;
        for(Enterprise e: enterpriseList)
        {
            OrganizationDirectory od = e.getOrganizationDirectory();
            ArrayList<Organization> orgList = od.getOrganizationList();
            for(Organization o :orgList)
            {
                if(o.getName().equals("Venue Organization"))
                {
                     vo = (VenueOrganization) o;
                     vd  =  vo.getVd();
                     return vd;
                }
            }
        }
        return null;
    }
    
    
    public VolunteerDirectory getVolunteerDirectory()
    {
        VolunteerDirectory vd;
        VolunteerOrganization volO;
        for(Enterprise e: enterpriseList)
        {
            OrganizationDirectory od = e.getOrganizationDirectory();
            ArrayList<Organization> orgList = od.getOrganizationList();
            for(Organization o :orgList)
            {
                if(o.getName().equals("Volunteer Organization"))
                {
                     volO = (VolunteerOrganization) o;
                     vd  =  volO.getVd();
                     return vd;
                }
            }
        }
        return null;
        
    }
    
    public SponsorDirectory getSponsorDirectory()
    {
        SponsorDirectory sponsorD;
        SponsorsOrganization sponsorO;
        for(Enterprise e: enterpriseList)
        {
            OrganizationDirectory od = e.getOrganizationDirectory();
            ArrayList<Organization> orgList = od.getOrganizationList();
            for(Organization o :orgList)
            {
                if(o.getName().equals("Sponsors Organization"))
                {
                     sponsorO = (SponsorsOrganization) o;
                     if(sponsorO.getSponsorDirectory()== null) sponsorO.setSponsorDirectory(new SponsorDirectory());
                     sponsorD  =  sponsorO.getSponsorDirectory();
                     
                     return sponsorD;
                }
            }
        }
        return null;
        
    }
    
    
    public SupplierDirectory getSupplierDirectory()
    {
        SupplierDirectory supplierD;
        DonationSupplierOrganization eo;
        for(Enterprise e: enterpriseList)
        {
            OrganizationDirectory od = e.getOrganizationDirectory();
            ArrayList<Organization> orgList = od.getOrganizationList();
            for(Organization o :orgList)
            {
                if(o.getName().equals("Equipment supplier Organization"))
                {
                     eo = (DonationSupplierOrganization) o;
                     if(eo.getSupplierDirectory() == null) eo.setSupplierDirectory(new SupplierDirectory());
                     supplierD  =  eo.getSupplierDirectory();
                     return supplierD;
                }
            }
        }
        return null;
        
    }
    
}
