package HW.volkov.praktika.Game;

public abstract class WarUnitDecorator implements WarUnit{
    protected WarUnit warUnit;
    public WarUnitDecorator(WarUnit unit){
        warUnit=unit;
    }
}
