package HW;

import java.lang.reflect.Array;
import java.util.Arrays;
/*
        Student s1=new Student("Вася",new int[]{3,4,5});
        Student s2=new Student("Петя",null);
        Student s3=new Student("Андрей",null);
        s2.marks=s1.marks;
        s3.marks= Arrays.copyOf(s1.marks,s1.marks.length);
        s2.marks[0]=5;
 */
public class Student {
    String name;
    public int[]marks;
    public Student(String name){
        this(name,null);
    }
    public Student(String name, int[]marks){
        this.name=name;
        this.marks=marks;
    }
    public String toString(){
        return name+": "+ Arrays.toString(marks);
    }
}
