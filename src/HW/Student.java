package HW;

import java.lang.reflect.Array;
import java.util.Arrays;
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

public class Student {
    String name;
    public int[]marks;
    public Student(String name){
        this(name,null);
    }
    public Student(String name, int[]marks){
        for(int i:marks){
            if(i<2 && i>5)throw new IllegalArgumentException("Оценки должны быть в диапазоне от 2 до 5: "+i);
        }
        this.name=name;
        this.marks=marks;
    }
    public int[] getMarks(){
        return marks;
    }
    public String toString(){
        return name+": "+ Arrays.toString(marks);
    }
    public double middleMark(){
        double r=0;
        if(marks.length==0)return 0;
        for(int i:marks){
            r+=(double)i;
        }
        return r/marks.length;
    }
    public void excellent(){
        if(marks.length!=0){
            int j=marks.length;
            for(int i:marks){
                if(i==5)j--;
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
}
