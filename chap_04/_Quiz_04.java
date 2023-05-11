package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10;//주차 시간
        boolean isSmallCar = false;
        boolean withDisabledPerson = true;//장애인 차량 여부

        int fee = hour * 4000;
        if(fee>30000){
            fee=30000;
        }

        if(isSmallCar || withDisabledPerson){
            fee /= 2;
        }

        System.out.println("주차 요금은 "+fee+"원 입니단");
    }
}
