package HW.volkov.math;

public class FractionException extends RuntimeException {
    public FractionException(){
    }
    public FractionException(String mes){
        super(mes);
    }
    public FractionException(String mes, Throwable cause){
        super(mes,cause);
    }
    public FractionException(Throwable cause){
        super(cause);
    }


}
