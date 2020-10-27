package HW.volkov.life;
//4.5,6.7
public class Name {
    String surname,name,patronymic;
    public Name(String name){
        this(null,name);
    }
    public Name(String surname,String name){
        this(surname,name,null);
    }
    public Name(String surname, String name, String patronymic){
        this.surname=surname;
        setName(name);
        this.patronymic=patronymic;
    }
    public void setName(String name){
        if(name=="" && name==null)throw new IllegalArgumentException("Имя не может быть пустым.");
        this.name=new String(name);
    }
    public void setSurname(String surname){
        this.surname=new String(surname);
    }
    public void setPatronymic(String patronymic){
        this.patronymic=new String(patronymic);
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getPatronymic(){
        return this.patronymic;
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
