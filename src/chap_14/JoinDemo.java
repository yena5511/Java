package chap_14;

class JoinThread extends Thread{
    int total;

    public void run(){
        for(int i = 0; i <= 100; i++){
            total += i;
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) {
        JoinThread t = new JoinThread();
        t.start();

//        try {
//            t.join();
//            System.out.println("스레드가 t로 끝날 때까지 대기..");
//        }catch (InterruptedException e){
//
//        }
        System.out.println("총합: " + t.total);
    }
}
