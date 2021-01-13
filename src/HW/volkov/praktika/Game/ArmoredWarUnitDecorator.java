package HW.volkov.praktika.Game;

public class ArmoredWarUnitDecorator extends WarUnitDecorator{
    public ArmoredWarUnitDecorator(WarUnit unit){
        super(unit);
    }
    public int attack(){
        return warUnit.attack()+5;
    }
    public boolean defend(int n){
        return warUnit.defend(n);
    }
}
