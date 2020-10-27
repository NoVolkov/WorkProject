package HW.volkov.geometry;
import HW.volkov.geometry.Figure;
import HW.volkov.geometry.Point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Triangle extends Figure {
    Point a1,b1;
    public Triangle(Point start,Point a,Point b){
        this.start=start;
        this.a1=a;
        this.b1=b;
    }
    public String toString(){
        return "Triangle`s points: "+start+", "+a1+", "+b1+".";
    }
    public double getArea(){
        double a=sqrt(pow((double)(a1.x-start.x),2)+pow((double)(a1.y-start.y),2));
        double b=sqrt(pow((double)(b1.x-a1.x),2)+pow((double)(b1.y-a1.y),2));
        double c=sqrt(pow((double)(start.x-b1.x),2)+pow((double)(start.y-b1.y),2));
        double p=(a+b+c)/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
