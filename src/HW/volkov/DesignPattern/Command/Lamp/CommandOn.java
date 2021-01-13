package HW.volkov.DesignPattern.Command.Lamp;

public class CommandOn implements Commandable{
    private Lamp lamp;

    public CommandOn(Lamp lamp) {
        this.lamp=lamp;
    }

    @Override // Command
    public void execute() {
        lamp.turnOn();
    }
}
