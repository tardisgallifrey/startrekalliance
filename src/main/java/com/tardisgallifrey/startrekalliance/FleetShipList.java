package com.tardisgallifrey.startrekalliance;

public class FleetShipList {
    

    private int _playershipnum;
    private String _AkiraClassname;
    private String _ExcelsiorClassname;
    public AkiraClass Akira = new AkiraClass("");
    public ExcelsiorClass Excelsior = new ExcelsiorClass("");

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

        if(_ExcelsiorClassname.length() < 1 ){
            System.out.println("No Excelsior Class ship present.");
        }else{
            ExcelsiorClass fleetExcelsior = new ExcelsiorClass(get_ExcelsiorClassname());
            fleetExcelsior.Create();
            fleetExcelsior.Display();
        }

        if(_AkiraClassname.length() < 1){
            System.out.println("No Akira Class ship present.");
        }else{
            AkiraClass fleetAkira = new AkiraClass(get_AkiraClassname());
            fleetAkira.Create();
            fleetAkira.Display();

        }
    }
}
