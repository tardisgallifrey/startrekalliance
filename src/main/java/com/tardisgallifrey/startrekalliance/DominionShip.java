package com.tardisgallifrey.startrekalliance;

public class DominionShip {
    private String _shipname;

    DominionShip(String shipname){
        set_shipname(shipname);
        System.out.println("You have created the Domion ship " + get_shipname() + ".\n");
    }

    public String get_shipname() {
        return _shipname;
    }

    public void set_shipname(String _shipname) {
        this._shipname = _shipname;
    }
    
}
