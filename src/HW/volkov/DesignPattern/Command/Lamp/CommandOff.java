package HW.volkov.DesignPattern.Command.Lamp;

public class CommandOff implements Commandable{
    private Lamp lamp;

    public CommandOff(Lamp lamp) {
        this.lamp=lamp;
    }

    @Override // Command
    public void execute() {
        lamp.turnOff();
    }
}
