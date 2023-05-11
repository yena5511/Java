package chap_02;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class _03_Operator {
    public static void main(String[] args) {
        //비교 연산자
        System.out.println(5 > 3);//5는 3보다 크다 (참이면 true, 거짓이면 false)
        System.out.println(5 >= 3);//5는 3보다 크거나 같다 true
        System.out.println(5 >= 5);//true
        System.out.println(5>=7);//false

        System.out.println(5<3);//false
        System.out.println(5<=3);//false


        System.out.println(5 == 5);//true
        System.out.println(5 == 3);//false
        System.out.println(5 != 5);//false
        System.out.println(5 != 3);//true

    }
}
