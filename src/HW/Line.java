/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

/**
 *
 * @author волков_ва
 */
/*
        Line l=new Line(new Point(0,0),new Point(5,5));
        Line l2=new Line(new Point(5,5),new Point(10,5));
        Line l3=new Line(l.start,l2.end);
        l.start=new Point(1,1);
*/
public class Line {
    public Point start,end;
    public Line(Point p1,Point p2){
        this.start=p1;
        this.end=p2;
    }
    public Line(int x1,int y1,int x2,int y2){
        start=new Point(x1,y1);
        end=new Point(x2,y2);
    }
    public String toString(){
        return "Линия от "+start+" до "+end;
    }
}
