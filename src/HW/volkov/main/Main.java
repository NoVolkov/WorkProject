package HW.volkov.main;

import HW.volkov.praktika.Student.Observer;
import HW.volkov.DesignPattern.Decorator.Example.*;
import HW.volkov.DesignPattern.Memento.Example.*;
import HW.volkov.DesignPattern.Observer.WeatherStation.*;
import HW.volkov.DesignPattern.Command.Lamp.*;
import HW.volkov.DesignPattern.Singleton.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static java.lang.Integer.parseInt;

public class Main extends Object{
    public static void main(String[] args) {
































        /*Parent p1=new Parent();
        Parent p2=new Parent();
        List<Observer>l1=new ArrayList<>();
        l1.add(p1);
        l1.add(p2);
        Student s1=new Student("Pete",l1,2,3,4,5);*/
        //Student s2=new


        /*
        //Шаблон Обёртка Адаптер
        Line l1=new Line(new Point(1,1),new Point(5,5));
        Line l2=new Line(new Point(1,1),new Point(3,3));
        StringL s=new StringL("123");
        System.out.println(S.length(l1,l2, s, ()->"s123".length(), "432"::length));

        Circle c1=new Circle(new Point(0,0),2);
        Rectangle r1=new Rectangle(new Point(0,0),1,2);
        StringL s1=new StringL("123");
        System.out.println(S.sumAreas(c1,r1,s1));
*/
        //Шаблон обёртка...
        /*Cat c1=new Cat("P");
        c1.meow(10);
        MeowCounter m1=new MeowCounter(c1);
        //прокси
        //c1.meow(10);
        System.out.println(m1.getMeow());*/

        /*Шаблон декаратор???-типа
        StringL s1=new StringL("123456йцу");
        System.out.println(s1.getArea());
        */




        /*Function<String, String>f = x ->{
            //return x.intValue();
            return x.toUpperCase();
        };

        List<String> r=new ArrayList<>();
        r.add("hello");
        r.add("there");

        List<String> n=something(r,f);
        String str="";
        for(int i=0;i<n.size();i++){
            str+=n.get(i)+" ";
        }
        System.out.println(str);*/

    }
    public static <T,R> List<R> something(List<T> arr, Function<T, R> f){
        List<R> res=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            res.add(f.apply(arr.get(i)));
        }
        return res;
    }



/*Predicate<String> stringPredicate=s->s.equals("Зачёт")||s.equals("Незачёт");
        Predicate<Integer> integerPredicate=s->(s>=2)&&(s<=5);
        Student<String> stringStudent=new Student<String>(
                "S",
                stringPredicate,
                "Зачёт","Незачёт","Отлиячно","Зачёт"
        );

        Student<Integer>integerStudent=new Student<Integer>(
                "I",
                integerPredicate,
                1,2,3,4,5,6,7
        );

        System.out.println(stringStudent);
        System.out.println(integerStudent);*/


        /*Fraction d=new Fraction<Integer>(1,1);
        Fraction d1=new Fraction<Integer>(5,1);
        System.out.println(d1.compareTo(d1));*/
       /*
       20.10.2020

        */

        /*int n=parseInt(args[0]);
        int s=parseInt(args[1]);
        System.out.println(pow(n,s));


        ////System.out.println(S.sum(1,5/2,new BigInteger("123123123123123123"),new Fraction(1,2)));
        //System.out.println(length(new Line(1,1,5,5),new BrokenLine(new Point[]{new Point(2,2),new Point(4,4)})));
    }
    public static double sum(Number... num){
        double res=0;
        for(Number n:num){
            res+=n.doubleValue();
        }
        return res;
    }
    public static double length(Lengthable...lines){
        double res=0;
        for(Lengthable l:lines){
            res+=l.length();
        }
        return res;
    }
    */
}

