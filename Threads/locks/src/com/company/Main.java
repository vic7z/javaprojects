package com.company;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        ReentrantLock re = new ReentrantLock();

        new Thread(new t2(re, num)).start();
        new Thread(new read(re, num)).start();
    }
}
