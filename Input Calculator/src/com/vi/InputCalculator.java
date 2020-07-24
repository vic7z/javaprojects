package com.vi;

import java.util.Scanner;

public class InputCalculator {
    public static  void inputThenPrintSumAndAverage(){
        Scanner in =new Scanner(System.in);
        int sum=0,count=0,input=0;
        int avg=0;
            do {
            input=in.nextInt();
            sum+=input;
            count++;
        }while (in.hasNextInt());
        avg=Math.abs(sum/count);
        System.out.println("SUM = "+sum+" AVG = "+avg);
    }
}
