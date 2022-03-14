package com.tardisgallifrey.startrekalliance;

import java.util.Scanner;

public class CampaignTurn {
    
    Scanner s = new Scanner(System.console().reader()); //Establish new Scanner object for keyboard response
    DominionSetup myDomSet = new DominionSetup(1);
    FleetShipList myFleet = new FleetShipList(0, "", "");


    //Method to check if each phase is complete
    //If the answer is no, we will rerun the method
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

    //Actual Fleet Setup
    //First determine how many Federation player ships there are.
    //From that, we create the correct ships and types plus create
    //The Dominion Squadrons.
    //Even if there is just one ship, it will run as a Dominion Squadron
    public void fleetsetup(){        

        int dominionshipnum = 0;  //Initialize how many Dominion Ships
        int playershipnum = 0;      //Initialize how many Federation player ships
        int federationShip1 = 0;    //Initialize which class number will be the one player
                                    //Federation ship, Akira or Excelsior

        System.out.println("We are now in Fleet Setup.");
        System.out.print("How many player Federation ships are there (1 or 2)?  ");
        playershipnum = s.nextInt();
        

        //Yes, this switch is complicated, but if you'ver ever done compiler programming,
        //you'll understand it is legal, I think.
        //We use the switch to determine are we building a single Federation Ship game or
        //a two Federation Ship game, name our ships, determine the quantity of Dominion Ships
        //And create and display each one.
        switch(playershipnum){
            case 1: 
                System.out.print("Do you choose 1) Akira Class or 2) Excelsior Class?  ");
                federationShip1 = s.nextInt();
                if(federationShip1 == 1){
                    System.out.print("What name do you wish to give this ship?  ");
                    
                    String shipname = System.console().readLine();
                    myFleet.set_playershipnum(1);
                    myFleet.set_AkiraClassname(shipname);
                    myFleet.set_ExcelsiorClassname("");
                    myFleet.CreateShipObjects();

                }else if(federationShip1 > 1){
                    System.out.print("What name do you wish to give this ship?  ");
                    String shipname = System.console().readLine();
                    myFleet.set_ExcelsiorClassname(shipname);
                    myFleet.set_AkiraClassname("");
                    myFleet.CreateShipObjects();
                    
                }
                System.out.print("How many Dominion ships are there (1 - 4)? ");
                dominionshipnum = s.nextInt();
                myDomSet.set_numShips(dominionshipnum);
                myDomSet.CreateDomSquadrons();
                break;

            case 2:
                System.out.print("Choose a name for the Excelsior Class ship.  ");
                String FedShip1 = System.console().readLine();

                System.out.print("Choose a name for the Akira Class ship.  ");
                String FedShip2 = System.console().readLine();
                myFleet.set_playershipnum(2);
                myFleet.set_AkiraClassname(FedShip2);
                myFleet.set_ExcelsiorClassname(FedShip1);
                myFleet.CreateShipObjects();

                System.out.print("How many Dominion ships are there (2 - 8)? ");
                dominionshipnum = s.nextInt();
                myDomSet.set_numShips(dominionshipnum);
                myDomSet.CreateDomSquadrons();
                break;

            default:
                System.out.println("You did not choose 1 or 2. Setting default which you may change later.");
                myFleet.set_playershipnum(1);
                myFleet.set_AkiraClassname("Dauntless");
                myFleet.set_ExcelsiorClassname("");
                myFleet.CreateShipObjects();
                myDomSet.set_numShips(1);
                myDomSet.CreateDomSquadrons();

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
