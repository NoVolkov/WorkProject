package HW.volkov.exam.Z1;

public class Alien implements Sitable{
    private String name;
    public Alien(String s){
        name=s;
        Persons.addP(this);
    }
    @Override
    public void sit(Boolean b) {
        if(!b){
            displayYES();
        }else{
            displayNO();
        }

    }
    public void displayYES(){
        System.out.println("Пришелец "+name+": 'Ура'");
    }
    public void displayNO(){
        System.out.println("Пришелец "+name+": 'Нет'");
    }
    public String show(){
        return "alien";
    }
}
