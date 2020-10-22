package com.vi;

public class t1 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("hello");
        } catch (InterruptedException e) {
            System.out.println("thread intrupted");
        }
    }
}
