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
final public class Fraction<E extends Number> extends Number{
    private Number numerator;
    private Number denomination;
    public Fraction(E I){
        numerator=I;
        denomination=1;
    }

    public Fraction(E numerator,E denomination){
        Number n1=numerator;
        Number n2=denomination;
        if((n1.doubleValue()<0 && n2.doubleValue()<0) || n2.doubleValue()<0){
            this.numerator=(-1);
            this.denomination=(-1);
        }else{
            this.numerator=1;
            this.denomination=1;
        }
        this.numerator=n1.doubleValue()*this.numerator.doubleValue();
        this.denomination=n2.doubleValue()*this.denomination.doubleValue();
    }



    public String toString(){
        return numerator+"/"+denomination;
    }
    //++++++++++
    public Fraction sum(Fraction<E> f){
        Number n1=f.numerator;
        Number n2=f.denomination;
        double t1=numerator.doubleValue()*n2.doubleValue()+n1.doubleValue()*denomination.doubleValue();
        double t2=denomination.doubleValue()*n2.doubleValue();
        return new Fraction(t1,t2);
    }
    public Fraction sum(E n){
        Number n1=n;
        Number t1=numerator.doubleValue()+n1.doubleValue()*denomination.doubleValue();
        Number t2=denomination.doubleValue();
        return new Fraction(t1,t2);
    }
    //----------
    public Fraction minus(Fraction<E> f){
        Number n1=f.numerator;
        Number n2=f.denomination;
        double t1=numerator.doubleValue()* n2.doubleValue()- n1.doubleValue()*denomination.doubleValue();
        double t2=denomination.doubleValue()* n2.doubleValue();
        return new Fraction(t1,t2);
    }
    public Fraction minus(E n){
        Number n1=n;
        double t1=numerator.doubleValue()-n.doubleValue()*denomination.doubleValue();
        double t2=denomination.doubleValue();
        return new Fraction(t1,t2);
    }
    //::::::::::
    public Fraction div(Fraction<E> f){
        Number n1=f.numerator;
        Number n2=f.denomination;
        double t1=numerator.doubleValue()* n2.doubleValue();
        double t2=n1.doubleValue()*denomination.doubleValue();
        return new Fraction(t1,t2);
    }
    public Fraction div(E n){
        Number n1=n;
        double t1=numerator.doubleValue();
        double t2=n.doubleValue()*denomination.doubleValue();
        return new Fraction(t1,t2);
    }
    //**********
    public Fraction multi(Fraction<E> f){
        Number n1=f.numerator;
        Number n2=f.denomination;
        double t1=numerator.doubleValue()*n1.doubleValue();
        double t2=denomination.doubleValue()* n2.doubleValue();
        return new Fraction(t1,t2);
    }
    public Fraction multi(E n){
        Number n1=n;
        double t1=numerator.doubleValue()*n.doubleValue();
        double t2=denomination.doubleValue();
        return new Fraction(t1,t2);
    }

    //Override
    @Override
    public int intValue(){
        if(denomination.intValue()==0){
            throw new FractionException("Denomination==0");
        }
        return (int)(numerator.doubleValue()/denomination.doubleValue());
    }
    @Override
    public long longValue() {
        if(denomination.intValue()==0){
            throw new FractionException("Denomination==0");
        }
        return numerator.longValue()/denomination.longValue();
    }
    @Override
    public double doubleValue(){
        if(denomination.intValue()==0){
            throw new FractionException("Denomination==0");
        }
        return numerator.doubleValue()/denomination.doubleValue();
    }
    @Override
    public float floatValue(){
        if(denomination.intValue()==0){
            throw new FractionException("Denomination==0");
        }
        return numerator.floatValue()/denomination.floatValue();
    }

    public Number getNumerator(){
        return numerator;
    }
    public Number getDenomination(){
        return denomination;
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
        return intValue()+numerator.intValue()+denomination.intValue();
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
