package HW.volkov.exam.Z1;

public class Human implements Sitable{
    private String name;
    public Human(String s){
        name=s;
        Persons.addP(this);
    }
    @Override
    public void sit(Boolean b) {
        if(b){
            displayYES();
        }else{
            displayNO();
        }
    }
    public void displayYES(){
        System.out.println("Человек "+name+": 'Ура'");
    }
    public void displayNO(){
        System.out.println("Человек "+name+": 'Нет'");
    }
    public String show(){
        return "human";
    }
}
