package chap_07;

public class ControlDemo {
    public static void main(String[] args) {
        TV t = new TV();
        t.turnOn();
        t.turnOff();
        t.repair();
        Control.reset();

        Computer com = new Computer();
        com.turnOn();
        com.turnOff();
        com.repair();
        Control.reset();

        Notebook N = new Notebook();
        N.turnOn();
        N.turnOff();
        N.inMyBag();
        N.repair();
    }
}
