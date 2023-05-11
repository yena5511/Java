package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼항 연산자
        //(결과) = (조건) ? (참의 경우 결과깂) : (거짓의 경우 결과값)
        int x =3;
        int y = 5;
        int max = (x>y) ? x : y;
        System.out.println(max);

        int min = (x<y) ? x : y;
        System.out.println(min);
    }
}
