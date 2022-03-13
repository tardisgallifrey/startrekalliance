package com.tardisgallifrey.startrekalliance;

public class App{
    public static void main(String args[]){
        System.out.println("Welcome to Star Trek Alliance.");

        CampaignTurn mySetup = new CampaignTurn();

        mySetup.fleetsetup();
        
        mySetup.planningphase();

        mySetup.activationphase();

        mySetup.combatphase();

        mySetup.endphase();

    }
}