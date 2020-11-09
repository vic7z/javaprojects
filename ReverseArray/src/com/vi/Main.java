package com.vi;

import javax.jws.Oneway;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int count = in.nextInt();
        int[] arr = getArr(count);
        int[] rev = reverse(arr);
        printArr(rev);
    }

    public static int[] getArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static int[] reverse(int arr[]) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - i];
        }
        return arr;
    }

    public static void printArr(int[] arr) {
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
