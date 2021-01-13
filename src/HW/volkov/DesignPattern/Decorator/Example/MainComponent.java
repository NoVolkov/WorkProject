package HW.volkov.DesignPattern.Decorator.Example;

public class MainComponent implements InterfaceComponent{
    @Override
    public void doOperation() {
        System.out.print("World!");
    }
}
