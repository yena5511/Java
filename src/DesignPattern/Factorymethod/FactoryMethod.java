package DesignPattern.Factorymethod;

class FactoryMethod {

    public static void main(String[] args) {
        new Console().withoutFactory();
        new Console().withFactory();
    }
}
