package chap_01;

import java.sql.SQLOutput;

public class _Quiz_01 {
    public static void main(String[] args) {
        String bus_name = "상암08번";
        int minute = 3;
        float km = 1.2f;

        System.out.println(bus_name+" 버스");
        System.out.println("약 "+minute+"분 후 도착");
        System.out.println("남은 거리 "+km+"km");
    }
}
