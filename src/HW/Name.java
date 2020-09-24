package HW;

public class Name {
    String surname,name,patronymic;
    public Name(String surname, String name, String patronymic){
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
    }

    @Override
    public String toString() {
        String s="";
        if(surname!=null)s+=surname;
        if(name!=null)s+=" "+name;
        if(patronymic!=null)s+=" "+patronymic;
        return s;
    }
}
