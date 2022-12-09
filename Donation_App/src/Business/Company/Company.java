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
 * @author ram.a
 */
public class Company {
    public String CompanyName;
    String CompanyManager;
    UserAccount userAccount;
    NGO ngo;
    String CompanyStatus;

    public String getCompanyName() {
        return CompanyName;
    }
    
    public Company(UserAccount ua,String CompanyName)
    {
        this.userAccount = ua;
        this.CompanyName = CompanyName;
        this.CompanyStatus = "Requested";
       
    }

    public String getCompanyManager() {
        return CompanyManager;
    }

    public void setCompanyManager(String CompanyManager) {
        this.CompanyManager = CompanyManager;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
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

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

//    public ArrayList<Player> getTeamPlayers() {
//        return teamPlayers;
//    }
//
//    public void setTeamPlayers(ArrayList<Player> teamPlayers) {
//        this.teamPlayers = teamPlayers;
//    }
//    public ArrayList<Player> teamPlayers = new ArrayList<Player>();
//    public Company(String CompanyName)
//    {
//        this.CompanyName = CompanyName;
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
