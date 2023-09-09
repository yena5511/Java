package DesignPattern.Decorator;

public abstract class FighterDecorator implements Fighter{

    private Fighter decoratedFighter;
    public FighterDecorator(Fighter _decoratedFighter) {
        decoratedFighter = _decoratedFighter;
    }

    @Override
    private void attack () {
        decoratedFighter.attack();
    }
}
