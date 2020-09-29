package HW;
//4.6
/*
        Person p1=new Person(new Name("Чудов", "Иван", null), 185, null);
        Person p2=new Person(new Name("Чудов", "Пётр", null), 190, p1);
        Person p3=new Person(new Name(null, "Борис", null), 180, p2);
*/
public class Person {
    Name name;
    int height;
    Person father;
    public Person(String name,int h){
        this.name=new Name(name);

    }
    public Person(String name,int h,Person father){
        this.name=new Name(father.name.surname,name,father.name.name+"ович");

    }
    public Person(Name name,int h){

    }

    public Person(Name name, int h,Person father){
        if(name.patronymic==null){
            this.name.patronymic=father.name.patronymic+"ович";
        }
        if(name.surname==null){
            this.name.surname=father.name.surname;///??????4.6
        }
        this.name=name;
        this.height=h;
        this.father=father;
    }
    @Override
    public String toString() {
        String s="";
        if(name.surname==null && father!=null){
            s+=father.name.surname+" "+name.name;
        }else{
            s+=name.surname+" "+name.name;
        }
        if(name.patronymic==null && father!=null && father.name.name!=null){
            s+=" "+father.name.name+"ович";
        }else{
            s+=" "+((name.patronymic!=null)? name.patronymic:"");
        }
        if(height>185){
            return s+" : высокий человек";
        }else{
            if(height<160){
                return s+" : низкий человек";
            }else {
                return s+" : средний человек";
            }
        }
    }
}
