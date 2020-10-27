package HW.volkov.main;

import HW.volkov.animals.Bird;
import HW.volkov.animals.Meowable;
import HW.volkov.geometry.Lengthable;
import HW.volkov.geometry.TotalArea;
import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;


//11.1,11.2,11.3,11.4,11.5
//  System.out.println(S.sum(1.2,new Fraction(1,2),3,new BigInteger("123123123123123123")));
//  System.out.println(S.sum(7,new Fraction(11,3),3.21,new BigInteger("12345678912345678912")));
public class S {
    public static double sum(Number... num){//абстрактный класс
        double res=0;
        for(Number n:num){
            res+=n.doubleValue();
        }
        return res;
    }
    public static void sing(Bird...birds){//абстрактный класс
        for(Bird b:birds){
            b.song();
        }
    }
    public static double sumAreas(TotalArea...figures){//интерфейс
        double sum=0;
        for(TotalArea t:figures){
            sum+=t.getArea();
        }
        return sum;
    }
    public static void meow(Meowable...cats){//интерфейс
        for(Meowable m:cats){
            m.meow();
        }
    }
    public static double length(Lengthable...lines){//интерфейс
        double res=0;
        for(Lengthable l:lines){
            res+=l.length();
        }
        return res;
    }
    public static int myPow(String[]str){
        double X=parseInt(str[0]);
        double Y=parseInt(str[1]);
        return  (int)pow(X,Y);
    }

}
