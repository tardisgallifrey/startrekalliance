package com.tardisgallifrey.startrekalliance;

public class DominionShip {
    private String _shipname;
    private int _primaryWeapon;
    private int _agility;
    private int _hullValue;
    private int _shieldValue;
    private String[] _upgrades;
    private String _specialAbility;
    private Actions _shipactions = new Actions();

    DominionShip(String shipname){
        set_shipname(shipname);
        System.out.println("You have created the Domion ship " + get_shipname() + ".\n");
    }

    public String get_specialAbility() {
        return _specialAbility;
    }

    public void set_specialAbility(String _specialAbility) {
        this._specialAbility = _specialAbility;
    }

    public String[] get_upgrades() {
        return _upgrades;
    }

    public void set_upgrades(String[] _upgrades) {
        this._upgrades = _upgrades;
    }

    public int get_shieldValue() {
        return _shieldValue;
    }

    public void set_shieldValue(int _shieldValue) {
        this._shieldValue = _shieldValue;
    }

    public int get_hullValue() {
        return _hullValue;
    }

    public void set_hullValue(int _hullValue) {
        this._hullValue = _hullValue;
    }

    public Actions get_actions(){
        return _shipactions;
    }

    public void set_actions(Boolean[] set_states){
        this._shipactions.set_AllActions(set_states);
    }

    public int get_agility() {
        return _agility;
    }

    public void set_agility(int _agility) {
        this._agility = _agility;
    }

    public int get_primaryWeapon() {
        return _primaryWeapon;
    }

    public void set_primaryWeapon(int _primaryWeapon) {
        this._primaryWeapon = _primaryWeapon;
    }

    public String get_shipname() {
        return _shipname;
    }

    public void set_shipname(String _shipname) {
        this._shipname = _shipname;
    }
   
    
    public void Create(){
        this.set_primaryWeapon(3);
        this.set_agility(2);
        this.set_hullValue(3);
        this.set_shieldValue(2);
        this.set_specialAbility("");
        this._shipactions.set_EvasiveManeuvers(false);
        this._shipactions.set_Scans(false);
        this._shipactions.set_BattleStations(false);
        this._shipactions.set_Cloak(false);
        this._shipactions.set_SensorEcho(false);   
        
    }

    public void Display(){

        if(_shipname.length() < 1){
            //do nothing

        }else{

            System.out.println("***********************************************");
            System.out.println("** Dominion ship - "+ get_shipname());
            System.out.println("** Primary Weapon at: " + get_primaryWeapon());
            System.out.println("** Agility: " + get_agility());
            System.out.println("** Hull: " + get_hullValue());

            if(_specialAbility.length() > 2){
                System.out.println("** Special Abilities: " + get_specialAbility());
            }

            System.out.println("**\t\t Evasive Maneuvers:\t"+this._shipactions.get_EvasiveManeuvers());
            System.out.println("**\t\t Scans:\t\t\t"+this._shipactions.get_Scans());
            System.out.println("**\t\t Battle Stations:\t"+this._shipactions.get_BattleStations());
            System.out.println("**\t\t Fix Damage:\t\t\t"+this._shipactions.get_Cloak());
            System.out.println("**\t\t Remove Aux Power:\t\t"+this._shipactions.get_SensorEcho());
            System.out.println("************************************************");
        }
    }
}
