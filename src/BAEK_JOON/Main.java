ackage BAEK_JOON;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


//      10818(최소, 최대)
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int max = -1000000;
//        int min = 1000000;
//
//        for (int i = 0; i < N; i++) {
//            int x = sc.nextInt();
//            if(x >= max) max = x;
//            if(x <= min) min = x;
//        }
//        System.out.println(min + " " + max);




//        10871(X 보다 작은 수)
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int X = sc.nextInt();
//        int arr[] = new int[N];
//
//        for (int  i = 0;  i < N;  i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < N; i++) {
//            if(arr[i] < X){
//                System.out.print(arr[i]+" ");
//            }
//        }



//        25314(코딩은 체육과목 입니다)
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        for (int i = 1; i <= x/4; i++) {
//            System.out.print("long " );
//        }
//        System.out.println("int");
        



//        8393(합)
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= num; i++) {
//            sum += i;
//        }
//        System.out.println(sum);



//        10950(A+B - 3)
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for (int i = 0; i < num; i++) {
//            int A = sc.nextInt();
//            int B = sc.nextInt();
//            System.out.println(A+B);
//        }



//        2739(구구단)
//        Scanner sc = new Scanner(System.in);
//        int gu = sc.nextInt();
//        for (int i = 1; i < 10; i++) {
//            System.out.println(gu + (" * ")+ i + (" = ") + gu*i);
//        }



//        2480(주사위 세개)
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int C = sc.nextInt();
//        int X=0;
//        int max;
//        if((A==B)&&(B==C))
//            X = 10000+A*1000;
//        else if (A != B && B != C && C != A ){
//            max = A > B ? A : B;
//            max = max > C ? max : C;
//            X = max * 100;
//        }
//        else{
//            if(A == B && A != C)
//                X = 1000+100*A;
//            else if(A == C && A != B)
//                X = 1000+100*A;
//            else if(B == C && B != A)
//                X = 1000+100*B;
//        }
//        System.out.println(X);



//        2525(오븐 시계)
//        Scanner sc = new Scanner(System.in);
//        int H = sc.nextInt();
//        int M = sc.nextInt();
//        int time = sc.nextInt();
//        M+=time;
//        H+=M/60;
//        M-=60*(M/60);
//        System.out.println((H%24)+" "+M);



//        2884(알람 시계)
//        Scanner sc = new Scanner(System.in);
//        int H = sc.nextInt();
//        int M = sc.nextInt();
//        if (M < 45) {
//            H--;
//            M+=15;
//        }
//        else {
//            M-=45;
//        }
//        if(H == -1) {
//            H= 23;
//        }
//        System.out.println(H+" "+M);



//        14681(사분면 고르기)
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        if(x>0 && y>0)
//            System.out.println("1");
//        else if (x<0 && y>0)
//            System.out.println("2");
//        else if (x<0 && y<0)
//            System.out.println("3");
//        else if (x>0 && y<0)
//            System.out.println("4");



//        2753(윤년)
//        Scanner sc = new Scanner(System.in);
//        int y = sc.nextInt();
//        if((y % 4 ==0 && y % 100!=0)||(y % 400 == 0))
//            System.out.println("1");
//        else
//            System.out.println("0");



//        9498(시험 성적)
//        Scanner sc = new Scanner(System.in);
//        int test = sc.nextInt();
//
//        if(test<=100 && test >=90)
//            System.out.println("A");
//       else if(test<90 && test >=80)
//            System.out.println("B");
//        else if(test<80 && test >=70)
//            System.out.println("C");
//        else if(test<70 && test >=60)
//            System.out.println("D");
//        else
//            System.out.println("F");



//            1330(두 수 비교하기)
//            Scanner sc = new Scanner (System.in);
//            int A = sc.nextInt();
//            int B = sc.nextInt();
//
//            if(A>B)
//                System.out.println(">");
//            else if(A<B)
//                System.out.println("<");
//            else
//                System.out.println("==");


    }
}
