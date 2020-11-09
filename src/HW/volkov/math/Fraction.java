package HW.volkov.math;
import java.lang.Number;
//5.5,6.4,9.1
/*
        Fraction f1=new Fraction(4,3);
        Fraction f2=new Fraction(1,2);
        Fraction f3=new Fraction(2);
        Fraction f4=new Fraction(6,5);
        System.out.println(f1.sum(f2).div(f3).multi(f4));
 */
final public class Fraction extends Number{
    private int numerator;
    private int denomination;
    public Fraction(int I){
        this(I,1);
    }
    public Fraction(int numerator,int denomination){
        if((numerator<0 && denomination<0) || denomination<0){
            this.numerator=(-1);
            this.denomination=(-1);
        }else{
            this.numerator=1;
            this.denomination=1;
        }
        this.numerator*=numerator;
        this.denomination*=denomination;

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

    public int intValue(){
        if(denomination==0){
            throw new FractionException("Denomination==0");
        }
        return numerator/denomination;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    public double doubleValue(){
        return (double)numerator/denomination;
    }
    public float floatValue(){
        return (float)numerator/denomination;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null)return false;
        if(obj.getClass()!=this.getClass())return false;

        Fraction f=(Fraction)obj;
        return denomination==f.denomination && numerator==f.numerator;
    }
    public int hashCode(){
        return intValue()+numerator+denomination;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
