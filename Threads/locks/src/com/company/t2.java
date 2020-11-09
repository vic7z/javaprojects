package com.company;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class t2 implements Runnable {
    ReentrantLock re;
    List<Integer> num;
    int even = 0;

    public t2(ReentrantLock re, List<Integer> num) {
        this.re = re;
        this.num = num;
    }

    @Override
    public void run() {
        while (even < 10) {

            System.out.println("Adding..." + even);
            re.lock();
            try {
                num.add(even += 2);
            } finally {
                re.unlock();
            }

        }

    }
}
