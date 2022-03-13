package com.tardisgallifrey.startrekalliance;

public class DominionSquadron {
    private String _squadronName;
    private DominionShip _squadron[];
    
    DominionSquadron(String squadronName){
            this.set_squadronName(_squadronName);
            System.out.println("You created Dominion Squadron " + get_squadronName() + ".\n");
    }

    public DominionShip[] get_squadron() {
        return _squadron;
    }

    public void set_squadron(DominionShip _squadron[]) {
        this._squadron = _squadron;
    }

    public String get_squadronName() {
        return _squadronName;
    }

    public void set_squadronName(String _squadronName) {
        this._squadronName = _squadronName;
    }

    public void Create(){
        
    }
}
