package chap_07;

public abstract class Countable {

    protected String name;
    protected int num;

    Countable(String name, int  num){
        this.name = name;
        this.num = num;
    }
   abstract void count();
}
