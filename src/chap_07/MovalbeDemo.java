package chap_07;
interface Movable{
    void move(int x);
}

class Car implements Movable{
    private int pos = 0;

    public void move(int x){
        pos += x;
    }
    public void show(){
        System.out.println(pos + "m 이동");
    }

}
public class MovalbeDemo {
    public static void main(String[] args) {
        Movable m = new Car();

        m.move(5);

        Car c = (Car)m;
        c.move(10);
        c.show();
    }
}
