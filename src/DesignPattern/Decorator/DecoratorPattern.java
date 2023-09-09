package DesignPattern.Decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        new XWinFighter().attack();
        // 탄환 발사

        new LaserDecorator(new XWinFighter()).attack();
        // 탄환 발사
        // 레이저 발사

        new PlasmaDecorator(
                new MissileDecorator(
                        new LaserDecorator(
                                new XWinFighter()
                        ))).attack();
        // 탄원 발사
        // 레이저 발사
        // 미사일 발사
        // 플라즈마 발사
    }
}
