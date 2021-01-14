package HW.volkov.exam.Z1;

import java.util.ArrayList;
import java.util.List;
//паттерн Одиночка
public class Persons {
    private static Persons in;
    private static List<Sitable> p;
    static {
        in=new Persons();
    }
    public Persons(Sitable...s){

        p=new ArrayList<>();
        for(Sitable s1:s){
            addP(s1);
        }
    }

    public static void addP(Sitable s){
        p.add(s);
    }
    public static List<Sitable> getPersons(){
        return p;
    }
}
