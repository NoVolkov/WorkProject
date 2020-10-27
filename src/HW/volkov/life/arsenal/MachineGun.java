package HW.volkov.life.arsenal;

public class MachineGun extends Gun{
    private int rate;
    public MachineGun(){
        super(30);
    }
    public MachineGun(int maxAmmo){
        super(maxAmmo);
        this.rate=maxAmmo/2;
        if(this.rate==0){
            this.rate=1;
        }
    }
    public MachineGun(int maxAmmo,int rate){
        super(maxAmmo);
        this.rate=rate;
        if(rate<1)throw new IllegalArgumentException("Скорострельность не может быть равной 0 или отрицательной.");
    }
    public void shoot(){
        for(int i=0;i<this.rate;i++){
            super.shoot();
        }
    }
    public void shoot(int n){
        for(int i=0;i<rate*n;i++){
            super.shoot();
        }
    }
}
