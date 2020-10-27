package HW.volkov.terrain;
//9.3
import java.util.Arrays;
/*
        BackToTown bt=new BackToTown("BACK");
        Path btd=new Path(d,6);
        bt.setPath(btd);
        System.out.println(bt)
 */
/*
        11.9
        BackToTown a=new BackToTown("A");
        Town b=new Town("B");
        Town c=new Town("C");
        BackToTown d=new BackToTown("D");
        Town e=new Town("E");
        Path bc=new Path(c,0);
        Path ec=new Path(c,0);

        Path ab=new Path(b,0);
        Path ac=new Path(c,0);
        Path db=new Path(b,0);
        Path de=new Path(e,0);

        a.setPath(ab);
        a.setPath(ac);
        d.setPath(db);
        d.setPath(de);
        b.setPath(bc);
        e.setPath(ec);
        System.out.println(e);
 */
public class BackToTown extends Town {
    public BackToTown(String name){
        super(name);
    }
    public void setPath(Path p){
        Path[] n= Arrays.copyOf(this.path,this.path.length+1);
        n[n.length-1]=p;
        this.path=Arrays.copyOf(n,n.length);
        p.name.setPath(new Path(this,p.cost));
    }

}
