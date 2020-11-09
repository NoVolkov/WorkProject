package HW.volkov.praktika;

//praktika 09.11.2020
public class Door {
    private String name;
    public static final Door ONE= new Door("ONE");
    public static final Door TWO= new Door("TWO");
    public static final Door THREE= new Door("THREE");

    private Door(String name){this.name=name;}

    public String open(){
        if(this==ONE)return "Автомобиль.";
        if(this==TWO)return "Nothing.";
        if(this==THREE)return Prise.randomPrise();
        return null;
    }

    @Override
    public String toString() {
        return "Name: "+name;
    }
}
