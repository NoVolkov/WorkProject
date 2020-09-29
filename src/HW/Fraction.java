package HW;
//5.5
/*
        Fraction f1=new Fraction(4,3);
        Fraction f2=new Fraction(1,2);
        Fraction f3=new Fraction(2);
        Fraction f4=new Fraction(6,5);
        System.out.println(f1.sum(f2).div(f3).multi(f4));
 */
public class Fraction {
    public int numerator;
    public int denomination;
    public Fraction(int I){
        this(I,1);
    }
    public Fraction(int numerator,int denomination){
        this.numerator=numerator;
        this.denomination=denomination;
    }
    public String toString(){
        return numerator+"/"+denomination;
    }
    //++++++++++
    public Fraction sum(Fraction f){
        int t1=numerator*f.denomination+f.numerator*denomination;
        int t2=denomination*f.denomination;
        return new Fraction(t1,t2);
    }
    public Fraction sum(int n){
        int t1=numerator+n*denomination;
        int t2=denomination;
        return new Fraction(t1,t2);
    }
    //----------
    public Fraction minus(Fraction f){
        int t1=numerator*f.denomination-f.numerator*denomination;
        int t2=denomination*f.denomination;
        return new Fraction(t1,t2);
    }
    public Fraction minus(int n){
        int t1=numerator-n*denomination;
        int t2=denomination;
        return new Fraction(t1,t2);
    }
    //::::::::::
    public Fraction div(Fraction f){
        int t1=numerator*f.denomination;
        int t2=f.numerator*denomination;
        return new Fraction(t1,t2);
    }
    public Fraction div(int n){
        int t1=numerator;
        int t2=n*denomination;
        return new Fraction(t1,t2);
    }
    //**********
    public Fraction multi(Fraction f){
        int t1=numerator*f.numerator;
        int t2=denomination*f.denomination;
        return new Fraction(t1,t2);
    }
    public Fraction multi(int n){
        int t1=numerator*n;
        int t2=denomination;
        return new Fraction(t1,t2);
    }
}
