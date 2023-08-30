package DesignPattern.State;

public interface ModeState {
    public void toggle (ModeStitch modeStitch);
}

class ModeStateLight implements ModeState {
    public void toggle (ModeStitch modeStitch){
        System.out.println("FORM LIGHT TO DARK");
        // 화면을 어둡게하는 코드
        // ..
        // ..
        modeStitch.setState(new ModeStateDark());
    }
}

class ModeStateDark implements ModeState {
    public void toggle (ModeStitch modeStitch){
        System.out.println("FROM DARK TO LIGHT");
        // 화면을 밝게 하는 코드
        // ..
        // ..
        modeStitch.setState(new ModeStateLight());
    }
}