package com.vi;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[] = getArray();
        int min = minArr(arr);
        System.out.println(min);
    }

    public static int[] getArray() {
        int[] arr = new int[4];
        while (in.hasNextInt()) {
            int c = 0;
            arr[c] = in.nextInt();
            c++;
        }
        return arr;
    }

    public static int minArr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i <= arr.length; i++) {
            if (min > arr[i]) {
                min = arr[1];
            }
        }
        return min;
    }
}
