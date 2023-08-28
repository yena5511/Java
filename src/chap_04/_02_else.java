package chap_04;

public class _02_else {
    public static void main(String[] args) {
        //조건문 if else
        int hour = 10;
        if(hour < 14){ //오후 2시 이전이면
            System.out.println("아이스 아메리카노 +1");
        }
        else{//그 외의 경우라면
            System.out.println("아이스 아메리카노 (디카페인)");
        }

        System.out.println("커피 주문 완료 #1");


        //오후 2시 이후 이거나 모닝커피 마신 경우
        hour = 15;
        boolean morningCoffee = true;
        if(hour >= 14 || morningCoffee == true){
            System.out.println("아이스 아메리카노 (디카페인)+1");
        }
        else {
            System.out.println("아이스 아메리카노");
        }
        System.out.println("커피 주문 완료 #2");
    }
}
