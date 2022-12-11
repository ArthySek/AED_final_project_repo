/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Company;

import Business.NGO.NGO;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *


=======
 * @author balajis

 */
public class Company {
    public String companyName;
    String companyManager;
    UserAccount UserAccount;
    NGO ngo;
    String CompanyStatus;

    public String getcompanyName() {
        return companyName;
    }
    
    public Company(UserAccount ua,String companyName)
    {
        this.UserAccount = ua;
        this.companyName = companyName;
        this.CompanyStatus = "Requested";
       
    }

    public String getcompanyManager() {
        return companyManager;
    }

    public void setcompanyManager(String companyManager) {
        this.companyManager = companyManager;
    }

    public UserAccount getUserAccount() {
        return UserAccount;
    }

    public void setUserAccount(UserAccount UserAccount) {
        this.UserAccount = UserAccount;
    }

    public String getCompanyStatus() {
        return CompanyStatus;
    }

    public void setCompanyStatus(String CompanyStatus) {
        this.CompanyStatus = CompanyStatus;
    }
    
    public int budget;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setcompanyName(String companyName) {
        this.companyName = companyName;
    }

//    public ArrayList<Player> getTeamPlayers() {
//        return teamPlayers;
//    }
//
//    public void setTeamPlayers(ArrayList<Player> teamPlayers) {
//        this.teamPlayers = teamPlayers;
//    }
//    public ArrayList<Player> teamPlayers = new ArrayList<Player>();
//    public Company(String companyName)
//    {
//        this.companyName = companyName;
//    }
//    
//    public void addPlayer(Player player)
//    {
//        teamPlayers.add(player);
//    }
//    
//    public Player getPlayer(String playerName)
//    {
//        for(Player player: teamPlayers)
//        {
//            if(player.getPlayerName().equals(playerName))
//                return player;
//        }
//        return null;
//    }
    
    int donationsdone;

    public int getDonationsdone() {
        return donationsdone;
    }

    public void setDonationsdone(int donationsdone) {
        this.donationsdone = donationsdone;
    }
    
    
    public void updateDonationsDone()
    {
        donationsdone++;
    }
    
    public void addBudget(int budget)
    {
      this.budget = this.budget + budget;
    }
    
}
