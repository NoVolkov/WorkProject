package HW.volkov.DesignPattern.Strategy.Duck;

import HW.volkov.DesignPattern.Strategy.Duck.Fly.FlyWithWings;
import HW.volkov.DesignPattern.Strategy.Duck.Fly.Flyable;
import HW.volkov.DesignPattern.Strategy.Duck.Quack.Quackable;
import HW.volkov.DesignPattern.Strategy.Duck.Quack.SimpleQuack;
/*
* List<DuckBase>ducks=new ArrayList<>();
        ducks.add(new ExoticDuck());
        ducks.add(new SimpleDuck());
        ducks.add(new RubberDuck());
        for(DuckBase d:ducks){
            d.display();
            d.fly();
            d.quack();
            d.swim();
            System.out.println("");
        }
* */
public abstract class DuckBase {
    protected Quackable quackBehaviour;
    protected Flyable flyBehaviour;
    public DuckBase(){
        quackBehaviour=new SimpleQuack();
        flyBehaviour=new FlyWithWings();
    }
    public void SetFlyBehaviour(Flyable nFlyBehaviour){
        flyBehaviour=nFlyBehaviour;
    }
    public void SetQuackBehaviour(Quackable nQuackBehaviour){
        quackBehaviour=nQuackBehaviour;
    }

    public void display(){}
    public void fly(){
        flyBehaviour.fly();
    }
    public void swim(){
        System.out.println("I`m swimming.");
    }
    public void quack(){
        quackBehaviour.quack();
    }
}
