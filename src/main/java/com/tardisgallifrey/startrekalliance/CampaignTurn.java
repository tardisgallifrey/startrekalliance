package com.tardisgallifrey.startrekalliance;

import java.util.Scanner;

public class CampaignTurn {
    
    Scanner s = new Scanner(System.in); //Establish new Scanner object for keyboard response

    //Method to check if each phase is complete
    private void AreWeDone(String phasename){

        System.out.print("Are you complete with " + phasename + "(y or n)?  ");

        char answer = s.next().charAt(0);  //Get next character from array at index 0

        if(answer == 'y' || answer == 'Y'){
            System.out.println(phasename + " is complete.  Moving on.\n");
        }else{
            System.out.println("Not ready.  Star Trek Alliance returning to " + phasename + "\n");
            
            switch(phasename) {
                case "Fleet Setup" :
                   this.fleetsetup();
                   break;
                
                case "Federation planning phase" :
                   this.planningphase();
                   break; 
                
                case "Activation" :
                    this.activationphase();
                    break;

                case "Combat phase" :
                    this.combatphase();
                    break;

                case "End phase" :
                    this.endphase();
                    break;

                default : 
                   System.out.println("Don't know which phase we are in.  Exiting.");
                   System.exit(0);
             }
        }

    }

    public void fleetsetup(){

        System.out.println("We are now in Fleet Setup.");

        
        AreWeDone("Fleet Setup");        

    }

    public void planningphase(){

        System.out.println("We are in the Federation player planning phase.");

        AreWeDone("Federation planning phase");  
    }

    public void activationphase(){
        System.out.println("We are in the Activation phase.");

        FedMove();

        AreWeDone("Activation");  
    }

    static void FedMove(){
        System.out.println("Federation movement phase.");
    }

    static void DominionMove(){
        System.out.println("Dominion movement phase.");
    }

    static void FedAction(){
        System.out.println("Federation action phase.");
    }

    static void DominionAction(){
        System.out.println("Dominion action phase.");
    }


    public void combatphase(){
        System.out.println("We are in the Combat phase.");

        AreWeDone("Combat phase");
    }

    public void endphase(){
        System.out.println("We are in the End Phase");

        AreWeDone("End Phase");
    }

    
}
