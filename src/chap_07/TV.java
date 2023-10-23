package chap_07;

public class TV implements Control {
    public void turnOn(){
        System.out.println("tv 전원 On");
    }

    public void turnOff(){
        System.out.println("tv 전원 Off");
    }

    // TV 클래스는 Controllable 인퍼페이스를 구현한 클래스이므로 직접 상수 사용 가능
    void versionPrint(){
        System.out.println(VERSION);

    }
}
