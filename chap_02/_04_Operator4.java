package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음);//하나라도 참
        System.out.println(김치찌개 && 계란말이 && 제육볶음 );//모두 참

        System.out.println((5>3) && (3>1));//5는 3보다 크고 3은 1보다 크다 true
        System.out.println((5>3) && (3<1));//5는 3보다 크고 3은 1보다 작다 false

        System.out.println((5>3) || (3>1)); //5는 3보다 크거나 3은 1보다 크다 true
        System.out.println((5>3) || (3<1)); //true
        System.out.println((5<3) || (3<1)); // false

        //System.out.println(1<3<5);//불가능

        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5==5));//false
        System.out.println(!(5==3));//true
    }
}
