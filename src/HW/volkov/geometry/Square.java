package HW.volkov.geometry;
/*
	Square sq=new Square(new Point(5,3),23);
	BrokenLine bl=sq.line();
	System.out.println(bl.length());
	bl.p[1].x=15;
	bl.p[1].y=25;
	System.out.println(bl.length());
*/
public class Square extends Figure{
    private int a;
    public Square(int x,int y,int a){
        this(new Point(x,y),a);
    }
    public Square(Point start,int a){
        this.start=start;
        setA(a);
    }
    public void setA(int a){
        if(a<=0){
            throw new IllegalArgumentException("Сторона квадрата 'a' должна быть больше нуля: "+a);
        }
        this.a=a;
    }

    public int getA() {
        return a;
    }

    public String toString(){
        return "Квадрат в точке "+start+" со стороной "+a+".";
    }
	public BrokenLine line(){
		ClosedBrokenLine l=new ClosedBrokenLine();
		Point[] m=new Point[]{  (Point)start.clone(),
							    new Point(this.start.x+this.a,this.start.y),
                                new Point(this.start.x+this.a,this.start.y+this.a),
                                new Point(this.start.x,this.start.y+this.a),
                                (Point)start.clone()
							  };
		l.addPoint(m);
		return l;
	}
	public double getArea(){
        return (double)(a*a);
    }
	
}
