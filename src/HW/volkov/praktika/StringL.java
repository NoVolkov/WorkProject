package HW.volkov.praktika;

import HW.volkov.geometry.Lengthable;
import HW.volkov.geometry.TotalArea;

public class StringL implements Lengthable, TotalArea {
    String str;
    public StringL(String s){
        str=s;
    }

    @Override
    public double length() {
        int n=0;
        for(char c:str.toCharArray()){
            n++;
        }
        return n;
    }
    @Override
    public double getArea(){
        return length();
    }
}