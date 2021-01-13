package HW.volkov.DesignPattern.Singleton;
/*
* Singleton.getSingleton().name="123";
        System.out.println(Singleton.getSingleton().name);
* */
public class Singleton {
    private static Singleton instance;
    public String name;
    static{
        instance=new Singleton();
    }
    private Singleton(){}
    public static Singleton getSingleton(){
        return instance;
    }
}
