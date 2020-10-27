package HW.volkov.geometry;

public class Circle extends Figure {
    int radius;
    public Circle(Point start, int radius){
        this.start=start;
        this.radius=radius;
    }
    public String toString(){
        return "Circle begins at point "+start+", its radius is "+radius+".";
    }
    public double getArea(){
        return (double)(Math.PI*radius*radius);
    }
}
