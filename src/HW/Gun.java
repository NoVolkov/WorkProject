package HW;
//5.1
public class Gun {
    int ammo;
    public Gun(){
        this(5);
    }
    public Gun(int begAmmo){
        this.ammo=begAmmo;
    }
    public void shoot(){
        if(ammo>0){
            System.out.println("Bang");
            ammo--;
        }else{
            System.out.println("Click");
        }
    }


}
