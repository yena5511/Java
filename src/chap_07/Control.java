package chap_07;

public interface Control {

    // 추상메서드
    public abstract void turnOn();
    void turnOff();

    // 상수
    public static final int VERSION = 3;
    int VERSION2 = 5;

    // 디폴트 메서드 --> 오버라이딩 가능
    default void repair(){
        System.out.println("장비 수리");
    }

    // 정적 메서드 --> 오버라이딩 불가능
    static void reset(){
        System.out.println("장비 초기화");
    }

}
