package HW;

public class Time {
    final int sec;
    private int min,hr,s;
    public Time(int sec){
        this.sec=sec;
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
}
