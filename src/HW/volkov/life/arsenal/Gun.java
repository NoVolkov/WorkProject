package HW.volkov.life.arsenal;
//5.1,6.5
public class Gun extends Weapon {
    int ammo;
    private int maxAmmo;
    public Gun(){
        this(5,5);
    }
    public Gun(int maxAmmo){
        this(0,maxAmmo);
    }
    public Gun(int begAmmo,int maxAmmo){
        super(begAmmo);
        this.maxAmmo=maxAmmo;
    }
    public int getMaxAmmo(){
        return maxAmmo;
    }
    public int getAmmo(){
        return this.ammo;
    }
    public boolean state(){
        if(this.ammo>0)return true;
        return false;
    }
    public void shoot(){
        if(ammo>0){
            System.out.println("Bang");
            ammo--;
        }else{
            System.out.println("Click");
        }
    }
    public int recharge(int ammo){
        if(ammo<0){
            throw new IllegalArgumentException("Пополняемые патроны не могут быть меньше 0: "+ammo);
        }
        int res=0,tmp=this.ammo + ammo;
        if (tmp > maxAmmo) {
            res=tmp-maxAmmo;
            tmp = maxAmmo;
        }
        this.ammo = tmp;
        return res;
    }
    public int discharge(){
        int tmp=this.ammo;
        this.ammo=0;
        return tmp;
    }


}
