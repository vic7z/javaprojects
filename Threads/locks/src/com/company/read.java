package com.company;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class read implements Runnable {
    ReentrantLock re;
    List<Integer> num;

    public read(ReentrantLock re, List<Integer> num) {
        this.re = re;
        this.num = num;
    }

    @Override
    public void run() {
        if (re.tryLock()) {
            try {
                System.out.println("printing");
                num.forEach(integer -> System.out.println(integer));
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("intrupted");
            } finally {
                re.unlock();
            }
        } else {
            System.out.println("read busy");
        }
    }
}
