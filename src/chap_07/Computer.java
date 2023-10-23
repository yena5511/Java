package chap_07;

public class Computer implements Control{
    public void turnOn(){
        System.out.println("컴퓨터 전원 On");
    }

    public void turnOff(){
        System.out.println("컴퓨터 전원 Off");
    }

    public void repair(){
        System.out.println("컴퓨터 수리");
    }
}
