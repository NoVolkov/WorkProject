package HW.volkov.DesignPattern.Command.Lamp;

import java.util.HashMap;
import java.util.List;

public class Invoker {
    private HashMap<String, Commandable> commands=new HashMap<>();
    public void addCommand(String comName,Commandable command){
        commands.put(comName,command);
    }
    public void execute(String comName){
        Commandable com=commands.get(comName);
        if(com==null)throw new IllegalStateException("No command registered for"+comName);
        com.execute();
    }
}
