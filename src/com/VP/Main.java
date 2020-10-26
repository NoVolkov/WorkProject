package com.VP;
import HW.*;
import HW.A1.A;

import java.awt.Point;
import java.util.Arrays;
import  java.math.BigInteger;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        Town a=new Town("A");
        Town b=new Town("B");
        Town c=new Town("C");
        Town d=new Town("D");
        Town e=new Town("E");
        Town f=new Town("F");
        Path ab=new Path(b,5);
        Path af=new Path(f,1);
        Path ad=new Path(d,6);
        BackToTown bt=new BackToTown("BACK");
        Path btd=new Path(d,6);
        bt.setPath(btd);
        System.out.println(bt);
    }
       /*
       20.10.2020

        */

        /*int n=parseInt(args[0]);
        int s=parseInt(args[1]);
        System.out.println(pow(n,s));


        //System.out.println(sum(1,5/2,new BigInteger("123123123123123123"),new Fraction(1,2).doubleValue()));
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
