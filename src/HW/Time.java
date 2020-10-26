package HW;
//4.4,5.4,6.2,9.4
public class Time {
    int sec;
    private int min,hr,s;

    public Time(int sec){
        this(0,0,sec);
    }
    public Time(int hr,int min,int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }



    @Override
    public String toString() {
        hr=sec/3600;
        min=(sec%3600)/60;
        s=sec%60;
        if(hr>23)hr%=24;
        return ""+((hr<10)? ("0"+hr):hr)+":"+((min<10)? ("0"+min):min)+":"+((s<10)? ("0"+s):s);
    }
    public int getHr(){
        return hr;
    }
    public int getMin(){
        return min;
    }
    public int getSec(){
        return s;
    }
}
