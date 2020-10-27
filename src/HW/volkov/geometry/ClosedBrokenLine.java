package HW.volkov.geometry;

public class ClosedBrokenLine extends BrokenLine {
    public ClosedBrokenLine(){
        super();
    }
    public ClosedBrokenLine(Point...p){
        super(p);
    }
    public double length(){
        double l=0,l1=0,l2=0;
        for(int i=0;i<p.length-1;i++){
            l1=(double)((p[i+1].x-p[i].x)*(p[i+1].x-p[i].x));
            l2=(double)((p[i+1].y-p[i].y)*(p[i+1].y-p[i].y));
            l+=Math.sqrt(l1+l2);
        }
        l1=(double)((p[0].x-p[p.length].x)*(p[0].x-p[p.length].x));
        l2=(double)((p[0].y-p[p.length].y)*(p[0].y-p[p.length].y));
        l+=Math.sqrt(l1+l2);
        return l;
    }
}
