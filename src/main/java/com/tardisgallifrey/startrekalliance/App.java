package com.tardisgallifrey.startrekalliance;

import java.util.Scanner;

public class App{
    public static void main(String args[]){
        System.out.println("Welcome to Star Trek Alliance.");

        CampaignTurn mySetup = new CampaignTurn();

        System.out.print("How many campaign turns are in this mission?  ");
        Scanner keyboard = new Scanner(System.in);
        int answer = keyboard.nextInt();
        
        mySetup.fleetsetup();

        if(answer > 0 && answer < 20){

            for (int index = 0; index < answer; index++) {
                
                mySetup.planningphase();

                mySetup.activationphase();

                mySetup.combatphase();

                mySetup.endphase();
            }

        }

        keyboard.close();
        System.out.println("");

    }
}