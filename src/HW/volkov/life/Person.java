package HW.volkov.life;

//4.6,6.8
/*
        Person p1=new Person(new Name("Чудов", "Иван", null), 185, null);
        Person p2=new Person(new Name("Чудов", "Пётр", null), 190, p1);
        Person p3=new Person(new Name(null, "Борис", null), 180, p2);
*/
public class Person {
    Name name;
    int height;
    final Person father;

    public Person(String name,int h){
        this(name,h,null);
    }
    public Person(String name,int h,Person father){
        this.name=new Name(father.name.surname,name,father.name.name+"ович");
        if(h<0 && h>500)throw new IllegalArgumentException("Рост должен быть положительным и меньше 500.");
        this.height=h;
        this.father=father;
    }

    public Person(Name name,int h){
        this(name.name,h,null);
    }

    public Person(Name name, int h,Person father){
        this.father=father;
        this.height=h;
    }
    public int getHeight(){
        return height;
    }
    public Person getFather(){
        return father;
    }
    public Name getName(){
        return name;
    }
    public String getNameString(){
        return name.toString();
    }
    public void setHeight(int h){
        height=h;
    }
    public void setName(Name name){
        if (father!=null){
            if(name.patronymic==null){
                this.name.patronymic=father.name.patronymic+"ович";
            }else{
                this.name.patronymic=name.patronymic;
            }
            if(name.surname==null){
                this.name.surname=father.name.surname;///??????4.6
            }else{
                this.name.surname=name.surname;
            }
            this.name.name=name.name;
        }else{
            this.name=name;
        }
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
