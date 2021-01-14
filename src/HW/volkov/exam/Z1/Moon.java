package HW.volkov.exam.Z1;

import java.util.ArrayList;
import java.util.List;
//паттерн Наблюдатель
public class Moon implements Observable{
    private List<Sitable> persons;

    public Moon(List<Sitable> s){
        persons=s;
    }

    @Override
    public void addPerson(Sitable s) {
        persons.add(s);
    }

    @Override
    public void delPerson(Sitable s) {
        persons.remove(s);
    }

    @Override
    public void notifyPerson(Boolean b) {
        for(Sitable s: persons){
            s.sit(b);
        }
    }
    public void sitPersone(Sitable s){
        if(s.show()=="human"){
            notifyPerson(true);
        }else{
            if(s.show()=="alien"){
                notifyPerson(false);
            }
        }
    }
}
