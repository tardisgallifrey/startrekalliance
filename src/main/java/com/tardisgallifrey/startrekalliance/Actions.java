package com.tardisgallifrey.startrekalliance;

public class Actions {

    private Boolean _EvasiveManeuvers;
    private Boolean _Scans;
    private Boolean _BattleStations;
    private Boolean _Cloak;
    private Boolean _SensorEcho;
    

    public Boolean get_SensorEcho() {
        return _SensorEcho;
    }

    public void set_SensorEcho(Boolean _SensorEcho) {
        this._SensorEcho = _SensorEcho;
    }

    public Boolean get_Cloak() {
        return _Cloak;
    }

    public void set_Cloak(Boolean _Cloak) {
        this._Cloak = _Cloak;
    }

    public Boolean get_BattleStations() {
        return _BattleStations;
    }

    public void set_BattleStations(Boolean _BattleStations) {
        this._BattleStations = _BattleStations;
    }

    public Boolean get_Scans() {
        return _Scans;
    }

    public void set_Scans(Boolean _Scans) {
        this._Scans = _Scans;
    }

    public Boolean get_EvasiveManeuvers() {
        return _EvasiveManeuvers;
    }

    public void set_EvasiveManeuvers(Boolean _EvasiveManeuvers) {
        this._EvasiveManeuvers = _EvasiveManeuvers;
    }

    public void set_AllActions(Boolean[] actionstates){
        this.set_EvasiveManeuvers(actionstates[0]);
        this.set_Scans(actionstates[1]);
        this.set_BattleStations(actionstates[2]);
        this.set_Cloak(actionstates[3]);
        this.set_SensorEcho(actionstates[4]);
    }

    
}
