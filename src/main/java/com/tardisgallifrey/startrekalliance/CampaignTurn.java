package com.tardisgallifrey.startrekalliance;

import java.util.Scanner;

public class CampaignTurn {
    
    Scanner s = new Scanner(System.console().reader()); //Establish new Scanner object for keyboard response
    DominionSetup myDomSet = new DominionSetup(1);


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

        int dominionshipnum = 0;
        int playershipnum = 0;
        int federationShip1 = 0;

        System.out.println("We are now in Fleet Setup.");
        System.out.print("How many player Federation ships are there (1 or 2)?  ");
        playershipnum = s.nextInt();
        

        switch(playershipnum){
            case 1: 
                System.out.print("Do you choose 1) Akira Class or 2) Excelsior Class?  ");
                federationShip1 = s.nextInt();
                if(federationShip1 == 1){
                    System.out.print("What name do you wish to give this ship?  ");
                    AkiraClass FedShip1 = new AkiraClass(System.console().readLine());
                    FedShip1.Create();
                }else if(federationShip1 > 1){
                    System.out.print("What name do you wish to give this ship?  ");
                    ExcelsiorClass FedShip1 = new ExcelsiorClass(System.console().readLine());
                    FedShip1.Create();
                }
                System.out.print("How many Dominion ships are there (1 - 4)? ");
                dominionshipnum = s.nextInt();
                myDomSet.set_numShips(dominionshipnum);
                break;
            case 2:
                if(federationShip1 == 1){
                    System.out.print("What do you wish to name the second Federation Ship?  ");
                    ExcelsiorClass FedShip2 = new ExcelsiorClass(System.console().readLine());
                    FedShip2.Create();
                }else{
                    System.out.print("What do you wish to name the second Federation Ship?  ");
                    AkiraClass FedShip2 = new AkiraClass(System.console().readLine());
                    FedShip2.Create();
                }
                System.out.print("How many Dominion ships are there (2 - 8)? ");
                dominionshipnum = s.nextInt();
                myDomSet.set_numShips(dominionshipnum);
            default:
                System.out.println("You did not choose 1 or 2. Setting default which you may change later.");
                AkiraClass myFedship = new AkiraClass(System.console().readLine());
                myFedship.Create();
                myDomSet.set_numShips(1);

        }


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
