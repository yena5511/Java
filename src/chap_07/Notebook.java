package chap_07;

public class Notebook extends Computer implements Portable{

    public void inMyBag(){
        System.out.println("노트북은 가방에 있다");
    }

    public void turnOn(){
        System.out.println("노트북 전원 On");
    }

    public void turnOff(){
        System.out.println("노트북 전원 Off");
    }

    public void repair(){
        System.out.println("노트북 수리");
    }
}
