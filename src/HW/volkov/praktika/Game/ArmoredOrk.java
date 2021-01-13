package HW.volkov.praktika.Game;

public class ArmoredOrk extends Ork{
    private int armor=50;
    private int damageArmor=10;


    @Override
    public boolean defend(int n) {
        if(armor<=0){
            super.defend(n);
            return false;
        }
        armor-=damageArmor;
        return true;
    }
}
