package HW.volkov.life.arsenal;

public class Shooter {
    String name;
    public Gun g;
    public Shooter(String name){
        setName(name);
    }
    public String getName(){
        return name;
    }
    public Gun getGun(){
        return g;
    }

    public void setName(String name){
        this.name=new String(name);
    }
    public void setGun(Gun g){//отсутствует инкапсуляция; клонирование?
        this.g=g;
    }
    public void ability(){
        if(g==null){
            System.out.println("Не могу участвовать в перестрелке.");
        }else{
            System.out.println("И тут я начинаю шмалять.");
        }
    }
}
