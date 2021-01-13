package HW.volkov.DesignPattern.Strategy.Duck.Fly;

public class FlyWithWings implements Flyable{
    @Override
    public void fly() {
        System.out.println("I`m flying with wings.");
    }
}
