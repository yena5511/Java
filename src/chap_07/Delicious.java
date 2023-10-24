package chap_07;

public interface Delicious extends Edible, Sweetable{
}

interface Edible{
    void eat();
}

interface Sweetable {
    void sweet();
}