package HW.volkov.animals;

public class Cat implements Meowable{
    String name;
    public Cat(String name){
        this.name=name;
    }
    public String toString(){
        return "кот:"+name;
    }
    public void meow(){
        System.out.println(name+": мяу!");
    }
    public void meow(int n){
        String s=name+": ";
        for(int i=0;i<n;i++){
            if(i!=n-1){
                s+="мяу-";
            }else{
                s+="мяу!";
            }
        }
        System.out.println(s);
    }
}
