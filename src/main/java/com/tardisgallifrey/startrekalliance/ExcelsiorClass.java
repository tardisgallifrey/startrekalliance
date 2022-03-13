package com.tardisgallifrey.startrekalliance;

public class ExcelsiorClass {
    private String _shipname;
    
    ExcelsiorClass(String shipname){
        set_shipname(shipname);
        System.out.println("You just created the Excelsior Class ship " + shipname + ".\n");
    }

    public String get_shipname() {
        return _shipname;
    }

    public void set_shipname(String _shipname) {
        this._shipname = _shipname;
    }
    
}
