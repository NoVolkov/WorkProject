package HW;

public class Home {
    final int level;
    public Home(int level){
        
        this.level=level;
    }

    @Override
    public String toString() {
        return "Дом с "+level+" этаж"+((level%10==1)?"ом":"ами")+".";
    }
}
