package HW.volkov.geometry;

import HW.volkov.math.Fraction;

/**
 *
 * @author Алексей
 */
public class Point {
    public int x,y;
    public Point(int X, int Y) {
        this.x=X;
        this.y=Y;
    }
    public String toString(){
        return "{"+x+";"+y+"}";
    }
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null)return false;
        if(obj.getClass()!=this.getClass())return false;

        Point p=(Point)obj;
        return x== p.x && y==p.y;
    }
    public Object clone(){
        return new Point(x,y);
    }
}
