package HW.volkov.geometry;

public class Rectangle extends Figure{
    int a,b;
    public Rectangle(Point start,int a,int b){
        this.start=start;
        this.a=a;
        this.b=b;
    }
    public String toString(){
        return "Rectangle begins at point "+start+", its sides 'a' is "+a+" and 'b' is "+b+".";
    }
    public double getArea(){
        return (double)(a*b);
    }
}
