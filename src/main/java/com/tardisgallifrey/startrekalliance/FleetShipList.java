package com.tardisgallifrey.startrekalliance;

public class FleetShipList {
    

    private int _playershipnum;
    private String _AkiraClassname;
    private String _ExcelsiorClassname;

    FleetShipList(int playershipnum, String AkiraClassName, String ExcelsiorClassName){
        set_playershipnum(playershipnum);
        set_AkiraClassname(AkiraClassName);
        set_ExcelsiorClassname(ExcelsiorClassName);
    }

    public String get_ExcelsiorClassname() {
        return _ExcelsiorClassname;
    }

    public void set_ExcelsiorClassname(String _ExcelsiorClassname) {
        this._ExcelsiorClassname = _ExcelsiorClassname;
    }

    public String get_AkiraClassname() {
        return _AkiraClassname;
    }

    public void set_AkiraClassname(String _AkiraClassname) {
        this._AkiraClassname = _AkiraClassname;
    }

    public int get_playershipnum() {
        return _playershipnum;
    }

    public void set_playershipnum(int _playershipnum) {
        this._playershipnum = _playershipnum;
    }

    public void CreateShipObjects(){

    }
}
