package com.vi;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) {
	// write your code here
        int[] arr=getArray(5);

       int[] sort= sortArray(arr);
        printArray(sort);
        printArray(arr);
    }




    public static int[] getArray(int number){
        Scanner in=new Scanner(System.in);
        int[] arr=new int[number];
        for (int i=0;i<number;i++){
            arr[i]=in.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] sortArray(int[] arr){
        int[] sort=arr;
        for (int i=0;i<sort.length;i++){
            for (int j=i+1;j<sort.length;j++){
                if(sort[i]<sort[j]){
                    int a = sort[i];
                    sort[i]=sort[j];
                    sort[j]=a;
                }
            }
        }
        return sort;
    }


}
