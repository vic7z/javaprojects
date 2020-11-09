package com.vi;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(b)) {
            int la = a % 10;
            int lb = b % 10;
            int lc = c % 10;
            if (la == lb || la == lc || lb == lc) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int a) {
        return a >= 10 && a <= 1000;
    }
}
