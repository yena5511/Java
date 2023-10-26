package chap_14;
class Dish{
    private boolean empty = true;

    public boolean isEmpty(){
        return empty;
    }

    public void setEmpty(boolean empty){
        this.empty = empty;
    }
}

class Cook implements Runnable{
    private final Dish dish;

    public Cook(Dish dish){
        this.dish = dish;
    }

    private void cook(int i) throws InterruptedException{
        synchronized (dish){
            while (!dish.isEmpty())
                dish.wait();
            dish.setEmpty(false);
            System.out.println(i + "번쨰 음식이 준비되었습니다.");
            dish.notify();
        }
    }

    public void run(){
        for (int i = 0; i < 5; i++){
            try {
                cook(i);
                Thread.sleep(500);
            }catch (InterruptedException e){

            }
        }
    }
}

class Customer implements Runnable{
    private final Dish dish;

    public Customer(Dish dish){
        this.dish = dish;
    }

    private void eat(int i) throws InterruptedException{
        synchronized (dish){
            while (dish.isEmpty())
                dish.wait();
            dish.setEmpty(true);
            System.out.println(i + "번쩨 음식을 만들었습니다.");
            dish.notify();
        }
    }

    public void run(){
        for(int i = 0; i < 5; i++){
            try {
                eat(i);
                Thread.sleep(500);
            }catch (InterruptedException e){

            }
        }
    }
}


public class DishDemo {
    public static void main(String[] args) {
        final Dish d = new Dish();
        new Thread(new Customer(d)).start();
        new Thread(new Cook(d)).start();
    }
}
