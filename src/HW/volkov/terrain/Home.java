package HW.volkov.terrain;
//6.1
public class Home {
    private int level;
    public Home(int level){
        if(level<1){
            throw new IllegalArgumentException("Level must be greater than 0.");
        }
        
        this.level=level;
    }

    @Override
    public String toString() {
        return "Дом с "+level+" этаж"+((level%10==1)?"ом":"ами")+".";
    }
}
