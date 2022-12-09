/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGO;

import Business.Company.Company;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ram.a
 */
public class NGO {
    ArrayList<Company> CompanyofNGo = new ArrayList<Company>();
    
    ArrayList<Company> requestCompanyAccess = new ArrayList<Company>();
    
    
    String[][] schedule;
    int noOfDonations;
    ArrayList<Donation> donations;
    boolean donationScheduled;
    UserAccount userAccount;
    String scheduleType ;
    
//    public int getNoofCompanies()
//    {
//        return CompanyofNGo.size();
//    }
   
    
    public NGO(String NGOName)
    {
       // this.userAccount = ua;
        this.NGOName = NGOName;
        this.scheduleType = "Not Selected";

        donationScheduled = false;
    }

    public ArrayList<Donation> getDonations() {
        return donations;
    }

    public void setDonations(ArrayList<Donation> donations) {
        this.donations = donations;
    }
    
    

//    public ArrayList<Match> getMatches() {
//        return matches;
//    }
//
//    public void setMatches(ArrayList<Match> matches) {
//        this.matches = matches;
//    }
   
    public String[][] getSchedule() {
        return schedule;
    }

    public ArrayList<Company> getCompanyofNGo() {
        return CompanyofNGo;
    }

    public void setCompanyofNGo(ArrayList<Company> CompanyofNGo) {
        this.CompanyofNGo = CompanyofNGo;
    }
    

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

   

   

    public String getNGOName() {
        return NGOName;
    }

    public void setNGOName(String NGOName) {
        this.NGOName = NGOName;
    }
    
    public int getNoOfcompany()
    {
        return CompanyofNGo.size();
    }
    
    String NGOName;

    
    
        public void generateSchedule()
     {
         
        donations = new ArrayList<Donation>();
        int noOfCompany = CompanyofNGo.size();
        int row = 0,donationNoStatic = 1;
        //int noOfDonation = 1;
   //     schedule = new String[noOfDonations][3];
        scheduleType = "Not Selected";
       // int days = (noOfTeams % 2 == 0) ? noOfTeams -1 : noOfTeams; 
        for (int i=0; i<1; i++) {
            for (int j=0; j<noOfCompany; j++) {
                 int t1 = (j+i) % noOfCompany;
//               int t2 = ((noOfTeams - j -1) + i) % noOfTeams;
                Donation donation = new Donation();
                donation.setDonation_no(donationNoStatic);
            //    System.out.println(noOfDonation);
               // match.setTeam1(teamsOfSport.get(t1));
               donation.setComp(CompanyofNGo.get(t1));
                       //get(t1));
                //donation.setComp(CompanyofNGo.get(row);
               // match.setTeam2(teamsOfSport.get(t2));
                donation.setNgo(NGOName);
                //match.setDay(i+1);
                donations.add(donation);
               // schedule[row][0] = String.valueOf(donationNoStatic);
              //  schedule[row][1] = "Day " + (i+1);
                //schedule[row][1] = "Team "+ CompanyofNGo.get(t1).getCompanyName();
                
                row++;
                donationNoStatic++;
                
              //  System.out.println(noOfDonation);
                System.out.println(NGOName);
            }
        }
     }
        
      //  return schedule;
    //}
    
//    public void generateKnockoutSchedule()
//    {
//                matches = new ArrayList<Match>();
//        int noOfTeams = teamsOfSport.size();
//        schedule = new String[noOfTeams/2][3];
//        scheduleType = "Knockout";
//        noOfMatches = noOfTeams/2;
//        int row = 0,matchNoStatic = 1,team = 0;
//        for(int i = 0; i < noOfTeams/2;i++)
//        {
//            Match match = new Match();
//            match.setMatchNo(matchNoStatic);
//            match.setSport(NGOName);
//            match.setTeam1(teamsOfSport.get(team));
//            match.setTeam2(teamsOfSport.get(team+1));
//            match.setDay(i);
//            matches.add(match);
//          //  schedule[row][0] = String.valueOf(matchNoStatic);
//          //  schedule[row][1] = teamsOfSport.get(team).getTeamName();
//          //  schedule[row][2] = teamsOfSport.get(team+1).getTeamName();
//            row++;matchNoStatic++;  
//            team = team + 2;
//        }
//      //  return schedule;
//    }
    //}
   
    

    
    
    public void addCompanyRequest(Company comp)
    {
        if(CompanyofNGo == null) CompanyofNGo = new ArrayList<Company>();
        CompanyofNGo.add(comp);
    }
    
    public void provideCompanyAccess(String CompanyName)
    {
        for(Company t: CompanyofNGo)
        {
            if(t.getCompanyName().equals(CompanyName))
            {
                t.setCompanyStatus("Playing");
            }
        }
    }
    
    public Company getCompany(String CompanyName)
    {
        for(Company c: CompanyofNGo)
        {
            if(c.getCompanyName().equals(CompanyName))
                return c;
        }
        return null;
    }

    public String getScheduleType() {
        return scheduleType;
    }
    public void setScheduleType(String type)
    {
        this.scheduleType = type;
    }
    
    
     public HashMap<String,Integer> donationByLocation(String Location)
     {
         HashMap<String,Integer> statistics = new HashMap<String,Integer>();
         for(Donation d : donations)
         {
             if(d.getVenue() == null) continue;
             if(d.getVenue().getLocation().equals(Location))
             {
             if(d.getComp().getCompanyName()== null) continue;
             else
             {
                if(statistics.containsKey(d.getComp().getCompanyName())) 
                {
                    statistics.put(d.getComp().getCompanyName(), statistics.get(d.getComp().getCompanyName()) + 1);
                }
                else
                    statistics.put(d.getComp().getCompanyName(),1);
             }
             }
         }
         return statistics;
         
     }
}


