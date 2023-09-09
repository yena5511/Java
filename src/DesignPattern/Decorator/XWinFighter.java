package DesignPattern.Decorator;

public class XWinFighter implements Fighter{
    @Override
    public void attack () {
        System.out.println("탄환 발사");
    }

}
