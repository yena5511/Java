package DesignPattern.State;

public class MyProgram {

    public static void main(final String[] args) {
        final ModeStitch modeStitch = new ModeStitch();

        modeSwitch.onSwitch();  // "FROM LIGHT TO DARK" 출력
        modeSwitch.onSwitch();  // "FROM DARK TO LIGHT" 츨력
        modeSwitch.onSwitch();  // "FROM LIGHT TO DARK" 출력
        modeSwitch.onSwitch();  // "FROM DARK TO LIGHT" 츨력
    }
}
