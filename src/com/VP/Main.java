package com.VP;
import HW.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student vas=new Student("VAS", new int[]{3,4,5,4});
        Student pet=new Student("PET", new int[]{5,5,5,5});
        System.out.println(vas.middleMark()+"//"+pet.middleMark());
        vas.excellent();
        pet.excellent();

    }
}
