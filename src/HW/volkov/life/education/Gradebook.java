package HW.volkov.life.education;

/*
        Results r1=new Results("Информатика","Ермаков",5);
        Results r2=new Results("Математика","Петрова",4);
        Results r3=new Results("Физика","Сидоров",5);
        Gradebook g1=new Gradebook(171896,"Вася",new Results[]{r1,r2,r3});
        g1.res[2]=new Results("Английский","Буров",4);
        Gradebook g2=new Gradebook(17364,"Петя",Arrays.copyOf(g1.res,g1.res.length));
        g2.res[1].mark=5;
 */
public class Gradebook {
    int number;
    String name;
    public Results[]res;
    public Gradebook(int number,String name, Results[]res){
        this.number=number;
        this.name=name;
        this.res=res;
    }
    public String toString(){
        String s="";
        for(Results r:res){
            s+=r+"\n";
        }
        return name+", "+number+":\n"+ s;
    }
}
