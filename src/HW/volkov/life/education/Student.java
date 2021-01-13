package HW.volkov.life.education;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
5.6,6.9
        Student s1=new Student("Вася",new int[]{3,4,5});
        Student s2=new Student("Петя",null);
        Student s3=new Student("Андрей",null);
        s2.marks=s1.marks;
        s3.marks= Arrays.copyOf(s1.marks,s1.marks.length);
        s2.marks[0]=5;
        5.6
        Student vas=new Student("VAS", new int[]{3,4,5,4});
        Student pet=new Student("PET", new int[]{5,5,5,5});
        System.out.println(vas.middleMark()+"//"+pet.middleMark());
        vas.excellent();
        pet.excellent();
 */

public class Student<T> {
    String name;
    Predicate<T> border;
    public List<T> marks=new ArrayList<>();
    public Student(String name, Predicate<T>border){
        this(name,border,null);
    }
    public Student(String name,Predicate<T> border, T...marks){
        for(T i:marks){
            addMark(i);
        }
        this.name=name;
        this.border=border;
        if(marks!=null){
            for(T i:marks){
                this.marks.add(i);
            }
        }
    }
    public List<T> getMarks(){
        return new ArrayList<T>(marks);
    }
    public String toString()
    {
        String str="[";
        for(int i=0;i<marks.size();i++){
            str+=marks.get(i)+", ";
        }
        str+="]";
        return name+": "+ str;//---------------------
    }
    public double middleMark(){
        double r=0;
        if(marks.size()==0)return 0;
        for(T i:marks){
            r+=(double)i;
        }
        return r/marks.size();
    }
    public void excellent(){
        if(marks.size()!=0){
            int j=marks.size();
            for(T i:marks){
                if((int)i==5)j--;
            }
            if(j==0){
                System.out.println("Student is pretty good!");
            }else{
                System.out.println("No good.");
            }
        }else{
            System.out.println("Student haven`t marks.");
        }
    }
    public void addMark(T n){
        if(border.test(n))marks.add(n);
    }
}
