package HW.volkov.DesignPattern.Strategy.Duck.Quack;

public class SimpleQuack implements Quackable{
    @Override
    public void quack() {
        System.out.println("I`m quacking.");
    }
}
