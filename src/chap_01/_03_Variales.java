package chap_01;

public class _03_Variales{
    public static void main(String[] args) {
       String name = "yena";

       int hour = 15;

        System.out.println(name +"님 배송이 시작됩니다. "+ hour +"시에 반문 예정입니다");
        System.out.println(name + "님 배송이 완료되었습니다");
        
        double score = 90.5;
        char grade = 'A';
        name = "이예나";
        System.out.println(name + "님의 평균 점수는"+score+"점 입니다");
        System.out.println("학점은"+ grade+ "입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? "+pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;


        System.out.println(d);
        System.out.println(f);

        long l = 100000000000000l;
        l = 1_000_000_000_000l;
        System.out.println(l);

        char c = 'c';
        System.out.println(c);



        //int, long +-l, float + -f, double, String, boolean
    }
}
