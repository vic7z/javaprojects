package com.vi;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new t1());
        Thread thread1 = new Thread(new t2());
        thread.start();
        thread1.start();
        thread.interrupt();
    }
}
