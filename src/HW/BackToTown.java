package HW;
//9.3
import java.util.Arrays;
/*
        BackToTown bt=new BackToTown("BACK");
        Path btd=new Path(d,6);
        bt.setPath(btd);
        System.out.println(bt)
 */
public class BackToTown extends Town {
    public BackToTown(String name){
        super(name);
    }
    public void setPath(Path p){
        Path[] n= Arrays.copyOf(this.path,this.path.length+2);
        n[n.length-2]=p;
        n[n.length-1]=new Path(this,p.cost);
        this.path=Arrays.copyOf(n,n.length);
    }
}
