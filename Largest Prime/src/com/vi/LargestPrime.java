package com.vi;

public class LargestPrime {
    public static int getLargestPrime(int number){
        int largestPrime=0;
        if(number<0){
            return  -1;
        }else {
            for (int i=1;i<=number/2;i++){
                if(number%i==0){
                    if(isPrime(i)){
                        if(largestPrime<i){
                            largestPrime=i;
                        }
                    }
                }
            }
        }
        return (largestPrime<0)?-1:largestPrime;
    }
    public static boolean isPrime(int number){
        boolean flag =true;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
