package HW.volkov.praktika;

import HW.volkov.geometry.Line;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//praktika 07.11.2020, 09.11.2020

//шаблон Builder, Singletone, флейвей

public class Name {
    private String name,surname,patronymic;
    private static NameBuilder nameBuilder;
    private static List<Name> arr=new ArrayList<>();


    private Name(String surname,String name,String patronymic){
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
    }
    public static NBuildable getBuilder(){
        if(nameBuilder==null){
            nameBuilder=new NameBuilder();
        }
        return nameBuilder;
    }

    @Override
    public String toString() {
        return surname+" "+name+" "+patronymic;
    }

    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null)return false;
        if(obj.getClass()!=this.getClass())return false;
        Name n=(Name)obj;
        return name==n.name&&surname==n.surname&&patronymic==n.patronymic;
    }
    public int hashCode(){
        return name.hashCode()+surname.hashCode()+patronymic.hashCode();
    }


    private static class NameBuilder implements NBuildable{
        String name,surname,patronymic;
        public NameBuilder setN(String name){
            this.name=name;
            return this;
        }
        public NameBuilder setS(String surname){
            this.surname=surname;
            return this;
        }
        public NameBuilder setP(String patronymic){
            this.patronymic=patronymic;
            return this;
        }
       // public Name get(){            return new Name(surname,name,patronymic);        }

        public Name get(){
            Name n=new Name(surname,name,patronymic);
            if(arr.contains(n)){
                return arr.get(arr.indexOf(n));
            }else{
                arr.add(n);
                return n;
            }
        }
    }

}

