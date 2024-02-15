package com.Jittipon.songtrai.helpers;

public class Calculator {
    public static String getDivisibleOutput(int numerator){
        String output="Denominator : "; //สร้างตัวแปร

        for(int i =2; i<numerator; i++){ //ลูป 2-เลขที่ป้อนไป
            if(numerator % i==0){  //เชคว่าหารอะไรลงตัวบ้าง
                output += i+ ", ";
            }

        }

        return output;

    }
}
