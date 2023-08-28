package chap_04;

public class _03_EiseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf
        
        //한라봉 에이드 있으면 +1
        //또는 망고 주스가 있으면 +1
        //또는 아이스 아메리카노 +1
        
        boolean hallabongAde = true; //한라봉 에이드
        boolean mangoJuice = true; //망소 주스
        
        if(hallabongAde){
            System.out.println("한라봉 에이드 +1");
        }
        else if (mangoJuice){
            System.out.println("망고 주스");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
    }
        System.out.println("주문 완료 #1 ");



        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;
        //else if는 여러번 사용 가능
        if(hallabongAde){
            System.out.println("한라봉 에이드 +1");
        }
        else if (mangoJuice){
            System.out.println("망고 주스");
        }
        else if (orangeJuice){
            System.out.println("오렌지 주스 +1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료#2 ");



    //else 는 없어도 가능
    hallabongAde = false;
    mangoJuice = false;
    orangeJuice = false;
        if (hallabongAde){
        System.out.println("한라봉 에이드 +1");
    }
        else if (mangoJuice){
        System.out.println("망고 주스");
    }
        else if (orangeJuice){
        System.out.println("오렌지 주스 +1");
    }
        System.out.println("커피 주문 완료 #3");


}

        }

