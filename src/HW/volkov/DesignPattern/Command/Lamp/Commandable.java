package HW.volkov.DesignPattern.Command.Lamp;
/*
* Lamp lamp = new Lamp();

        Commandable switchOn = new CommandOn(lamp);
        Commandable switchOff = new CommandOff(lamp);

        Invoker mySwitch = new Invoker();
        mySwitch.addCommand("on", switchOn);
        mySwitch.addCommand("off", switchOff);

        mySwitch.execute("on");
        mySwitch.execute("off");
*/
public interface Commandable {
    public void execute();
}
