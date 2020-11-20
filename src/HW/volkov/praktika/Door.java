package HW.volkov.praktika;

//praktika 09.11.2020, 17.11.2020
public abstract class Door {
    private String name;
    //1
    public static final Door ONE= new Door(){
        @Override
        public String open(){
            return "Автомобиль.";
        }
    };
    //2
    public static final Door TWO= new Door(){
        @Override
        public String open(){
            return "Nothing";
        }
    };
    //3
    public static final Door THREE= new Door(){
        @Override
        public String open(){
            return Prise.randomPrise();
        }
    };
    private Door(){}
    private Door(String name){this.name=name;}

    public abstract String open();

    @Override
    public String toString() {
        return "Name: "+name;
    }
}

