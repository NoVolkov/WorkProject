package HW;

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
}
