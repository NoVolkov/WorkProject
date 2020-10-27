package HW.volkov.life.arsenal;

abstract public class Weapon {
    protected int ammo;
    public Weapon(int ammo){
        if(ammo<0)throw new RuntimeException();
        this.ammo=ammo;
    }

    abstract void shoot();
    public int ammo(){return ammo;}
    public int recharge(int ammo){
        if(ammo<0)throw new RuntimeException();
        this.ammo+=ammo;
        return 0;
    }

}
