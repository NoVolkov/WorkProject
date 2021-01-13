package HW.volkov.DesignPattern.Strategy.Duck;

import HW.volkov.DesignPattern.Strategy.Duck.Fly.NoFly;
import HW.volkov.DesignPattern.Strategy.Duck.Quack.NoQuack;

public class RubberDuck extends DuckBase{
    public RubberDuck(){
        quackBehaviour=new NoQuack();
        flyBehaviour=new NoFly();
    }

    @Override
    public void display() {
        System.out.println("Rubber duck.");
    }
}
