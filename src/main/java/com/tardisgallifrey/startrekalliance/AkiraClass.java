package com.tardisgallifrey.startrekalliance;

public class AkiraClass {

    private String _shipname;

    AkiraClass(String shipname){
            set_shipname(shipname);
            System.out.println("You just created the Akira Class ship " + get_shipname() + ".\n");
    }

    public String get_shipname() {
        return _shipname;
    }

    public void set_shipname(String _shipname) {
        this._shipname = _shipname;
    }

    public void Create(){
        
    }

    public void Display(){
        if(_shipname == null){
            System.out.println("No Akira Class ship present.\n");
        }else{
            System.out.println("Your Akira Class ship " + _shipname + " is ready for service.\n");
        }
    }
}
