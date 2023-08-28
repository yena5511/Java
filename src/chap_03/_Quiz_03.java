package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String jumin = "901231-1234567";
        System.out.println(jumin.substring(0,8));//0위치부터 8 위치 직전까지
        System.out.println(jumin.substring(0, jumin.indexOf("-")+2));//0 위치부터 하이픈 위치 +2 직전까지
    }
}
