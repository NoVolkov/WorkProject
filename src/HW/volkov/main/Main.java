package HW.volkov.main;

import HW.volkov.life.arsenal.Gun;
import HW.volkov.life.arsenal.Shooter;
import HW.volkov.math.Fraction;
import java.math.BigInteger;
import static java.lang.Integer.parseInt;
import java.awt.Point;
import HW.volkov.geometry.*;

public class Main {

    public static void main(String[] args) {

    }

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
