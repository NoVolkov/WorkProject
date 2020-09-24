package HW;
/*
        Town a=new Town("A",null);
        Town b=new Town("B",null);
        Town c=new Town("C",null);
        Town d=new Town("D",null);
        Town e=new Town("E",null);
        Town f=new Town("F",null);
        Path ab=new Path(b,5);
        Path af=new Path(f,1);
        Path ad=new Path(d,6);
        Path ba=new Path(a,5);
        Path bc=new Path(c,3);
        Path cb=new Path(b,3);
        Path cd=new Path(d,4);
        Path dc=new Path(c,4);
        Path de=new Path(e,2);
        Path da=new Path(a,6);
        Path ef=new Path(f,2);
        Path fe=new Path(e,2);
        Path fb=new Path(b,1);
        a.path=new Path[]{ab,af,ad};
        b.path=new Path[]{ba,bc};
        c.path=new Path[]{cb,cd};
        d.path=new Path[]{dc,de,da};
        e.path=new Path[]{ef};
        f.path=new Path[]{fb,fe};
 */
public class Town {
    String name;
    public Path[]path;
    public Town(String name){
        this.name=name;
    }
    public String toString(){
        String s="";
        for(Path p:path){
            s+=p+" ";
        }
        return name+": {"+s+"}";
    }
}
