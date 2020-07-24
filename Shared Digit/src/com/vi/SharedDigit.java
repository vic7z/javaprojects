package com.vi;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber,int secondNumber){
        boolean b = (firstNumber > 10 || firstNumber < 100) || (secondNumber > 10 || secondNumber < 100);
        if(b){
            int fa=firstNumber/10;
            int fb=firstNumber%10;
            int sa=secondNumber/10;
            int sb=secondNumber%10;
            if(fa==sa||fa==sb || fb==sa || fb==sb){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
