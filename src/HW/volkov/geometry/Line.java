/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW.volkov.geometry;

import HW.volkov.math.Fraction;

/**
 *
 * @author волков_ва
 */
/*
5.3,6,6
        Line l=new Line(new Point(0,0),new Point(5,5));
        Line l2=new Line(new Point(5,5),new Point(10,5));
        Line l3=new Line(l.start,l2.end);
        l.start=new Point(1,1);
*/
public class Line implements Lengthable {
    private Point start,end;
    public Line(Point p1,Point p2){
        this(p1.x,p1.y,p2.x,p2.y);
    }
    public Line(int x1,int y1,int x2,int y2){
        this.start=new Point(x1, y1);
        this.end=new Point(x2, y2);
    }
    public void setStart(int x,int y){
        this.start.x=x;
        this.start.y=y;
    }
    public void setEnd(int x,int y){
        this.end.x=x;
        this.end.y=y;
    }
    public int getStX(){
        return this.start.x;
    }
    public int getStY(){
        return this.start.y;
    }
    public int getEnX(){
        return this.end.x;
    }
    public int getEnY(){
        return this.end.y;
    }

    public String toString(){
        return "Линия от "+start+" до "+end;
    }
    public double length(){
        double r1=(double)((end.x-start.x)*(end.x-start.x));
        double r2=(double)((end.y-start.y)*(end.y-start.y));
        return Math.sqrt(r1+r2);
    }
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null)return false;
        if(obj.getClass()!=this.getClass())return false;

        Line l=(Line)obj;
        return start.equals(l.start) && end.equals(l.end);
    }
    public Object clone(){
        return new Line((Point)start.clone(),(Point)end.clone());
    }
}
