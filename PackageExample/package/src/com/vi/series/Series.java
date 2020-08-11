package com.vi.series;

public class Series {
    public static long nSum(int n){

        return (n*(n+1))/2;
    }
    public static long factorial(int n){

        long fact=1;
        if(n==0){
            return 1;
        }
        while (n>0){
            fact*=n;
        }
        return fact;
    }
    public static long fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }


}
