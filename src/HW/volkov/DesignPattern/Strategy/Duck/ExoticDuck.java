package HW.volkov.DesignPattern.Strategy.Duck;

import HW.volkov.DesignPattern.Strategy.Duck.Quack.ExoticQuack;

public class ExoticDuck extends DuckBase {
    public ExoticDuck(){
        quackBehaviour=new ExoticQuack();
    }

    @Override
    public void display() {
        System.out.println("Exotic duck.");
    }
}
