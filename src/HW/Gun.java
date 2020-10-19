package HW;
//5.1
public class Gun {
    int ammo;
    private int maxAmmo;
    public Gun(){
        this(5,5);
    }
    public Gun(int begAmmo,int maxAmmo){
        this.ammo=begAmmo;
        this.maxAmmo=maxAmmo;
    }
    public int getMaxAmmo(){
        return maxAmmo;
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
        
    }


}
