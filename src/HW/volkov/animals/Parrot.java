package HW.volkov.animals;

public class Parrot extends Bird{
    String text;
    public Parrot(String text){
        this.text=text;
    }
    public void song(){
        /*int kol=(int)(Math.random()*((text.length())+1));
        int[]*/
        System.out.println(text);
    }
}
