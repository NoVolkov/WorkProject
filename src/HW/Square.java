package HW;

public class Square {
    private Point start;
    private int a;
    public Square(int x,int y,int a){
        this(new Point(x,y),a);
    }
    public Square(Point start,int a){
        this.start=start;
        this.a=a;
    }
    public String toString(){
        return "Квадрат в точке "+start+" со стороной "+a+".";
    }
}
