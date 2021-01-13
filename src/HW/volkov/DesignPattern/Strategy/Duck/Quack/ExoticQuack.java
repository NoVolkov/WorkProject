package HW.volkov.DesignPattern.Strategy.Duck.Quack;

public class ExoticQuack implements Quackable{
    @Override
    public void quack() {
        System.out.println("Meow. Meow.");
    }
}
