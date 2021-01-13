package HW.volkov.praktika.Game;

public class Man  implements WarUnit{
    private int health=100;
    @Override
    public int attack() {
        System.out.println("Человек наносит урон 5.");
        return 5;
    }

    @Override
    public boolean defend(int n) {
        health-=n;
        if(health<=0) {
            System.out.println("Человек мёртв.");
            return false;
        }
        System.out.println("Здоровье человека "+health+".");
        return true;
    }
}
