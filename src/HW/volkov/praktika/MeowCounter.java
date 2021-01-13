package HW.volkov.praktika;

import HW.volkov.animals.Meowable;

public class MeowCounter implements Meowable {
    Meowable obj;
    int n=0;
    public MeowCounter(Meowable o){
        obj=o;
    }
    @Override
    public void meow(){
        n++;
        obj.meow();
    }
    public int getMeow(){
        return n;
    }
}
