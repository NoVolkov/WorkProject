package HW.volkov.praktika.Game;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ork implements WarUnit{
    protected int health=100;
    protected int damage=10;
    private State state;
    Supplier<Integer> attackStrategy;


    @Override
    public int attack() {
        //System.out.println("Орк наносит урон "+damage+".");
        return attackStrategy.get();
    }

    @Override
    public boolean defend(int n) {
        health-=n;
        if(health<=0) {
            System.out.println("Орк мёртв.");
            return false;
        }
        System.out.println("Здоровье орка "+health+".");
        return true;
    }


    

}
enum State {
    PREPARING,
    NORMAL,
    ULTIMATE,
    DEAD
}

