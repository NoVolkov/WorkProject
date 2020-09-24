package HW;
/*
        Album a1=new Album("Кукловод","Металлов");
        Album a2=new Album("Шоссе к ООП","Асид");
        Treck t1=new Treck("Состояние объектов","Янг", a2);
        Treck t2=new Treck("Шоссе к ОПП",null, a2);
        Treck t3=new Treck("Одноразовый программист","Бертон", a1);
 */
public class Treck {
    String name;
    String author;
    Album alb;
    public Treck(String name, String author, Album alb){
        this.name = name;
        this.author = author;
        this.alb = alb;
    }
    public String toString(){
        if(alb.author==null){
            return name+" "+author+" "+alb.name;
        }else{
            return name+" "+author+"|"+alb.author+" "+alb.name;
        }
    }
}
