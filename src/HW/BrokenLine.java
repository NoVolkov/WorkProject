package HW;
import java.util.Arrays;
/*
    5.7
    BrokenLine b=new BrokenLine(new Point(1,5),new Point(2,8),new Point(5,3));
    System.out.println(b.length());
    b.addPoint(new Point(5,15),new Point(8,10));
    System.out.println(b.length());
 */
public class BrokenLine {
    private Point[] p;
    public BrokenLine(){
        this(new Point[0]);
    }
    public BrokenLine(Point...p){
        this.p=Arrays.copyOf(p,p.length);
    }

    public void addPoint(Point p){
        Point[] newp=Arrays.copyOf(this.p,this.p.length+1);
	    newp[newp.length-1]=p;
	    this.p=Arrays.copyOf(newp,newp.length);
    }
    public void addPoint(Point...p){
        Point[] newp=Arrays.copyOf(this.p,this.p.length+p.length);
	    System.arraycopy(p,0,newp,this.p.length,p.length);
	    this.p=Arrays.copyOf(newp,newp.length);
    }
    public String toString(){
        String s="Линия [";
        for(Point i:this.p){
            s+=i.toString();
            if(i!=this.p[this.p.length-1]){
                s+=",";
            }
        }
        return s+"]";
    }
    public double length(){
        double l=0,l1=0,l2=0;
        for(int i=0;i<this.p.length-1;i++){
            l1=(double)((p[i+1].x-p[i].x)*(p[i+1].x-p[i].x));
            l2=(double)((p[i+1].y-p[i].y)*(p[i+1].y-p[i].y));
            l+=Math.sqrt(l1+l2);
        }
        return l;
    }


}
