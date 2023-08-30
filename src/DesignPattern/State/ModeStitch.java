package DesignPattern.State;

public class ModeStitch {
    private ModeState modeState = new ModeStateLight();

    public void setState (ModeState _modeState){
        modeState = _modeState;
    }

    public void onSwitch(){
        ModeState.toggle(this);
    }
}
