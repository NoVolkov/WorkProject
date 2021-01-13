package HW.volkov.praktika.Student;

import java.util.ArrayList;
import java.util.List;

public class Student extends Object{
    private String name;
    private List<Integer> marks=new ArrayList<>();
    private List<Observer> list=new ArrayList<>();
    public Student(String name,List<Integer>marks){
        this.name=name;
        for(int t:marks){
            addMark(t);
        }
    }
    public Student(String name,List<Observer>list,int...marks){
        this.name=name;
        for(int t:marks){
            addMark(t);
        }
        this.list=list;
    }

    public List<Integer> getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
    public void addMark(int t){
        marks.add(t);
        for(Observer i:list){
            i.notIfy(t);
        }
    }
    public void delMark(int n){
        marks.remove(n);
    }
    public void editMark(int n,int m){
        marks.set(n,m);
    }
}
