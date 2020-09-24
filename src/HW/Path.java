package HW;

public class Path {
    Town name;
    int cost;
    public Path(Town name,int cost){
        this.name=name;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return name.name+":"+cost;
    }
}
