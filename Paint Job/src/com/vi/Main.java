package com.vi;

public class Main {

    public static void main(String[] args) {
        int bucket = PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2);
        System.out.println(bucket);
    }
}
