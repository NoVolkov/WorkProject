package HW.volkov.animals;

public class Cuckoo extends Bird{
    public void song(){
        int r=(int)(Math.random()*((10-1)+1)+1);
        for(int i=0;i<r;i++){
            System.out.println("Ку-Ку");
        }
    }
}
