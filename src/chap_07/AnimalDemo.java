package chap_07;
interface Animal{
    void makeSound();
}

class Dog implements Animal{
   public void makeSound(){
        System.out.println("멍멍");
    }
}

class Cat implements Animal{
    public void makeSound(){
        System.out.println("야옹");
    }
}
class Tiger{
    public void makeSound(){
        System.out.println("어흥");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Tiger t = new Tiger();

        makeSound(c);
        makeSound(d);
       // makeSound(t); 오류 발생
    }

    static void makeSound(Animal a)  //Aniamal a = c / d
    {
        a.makeSound();
    }
}
