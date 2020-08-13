package com.vi;


import java.util.Stack;

public class Solution {
    public static int[] rank(int[] arr,int N){
        Stack<Integer> stack=new Stack<>();
        stack.push(arr[N-1]);
        int[] rank=new int[N];
        for(int i=N-2;i>=0;i--){
            if ( arr[i] >= stack.peek() ) {
                while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                    stack.pop();
                }
            }
            stack.push(arr[i]);
            rank[i]=stack.size()-1;
        }
        return rank;
    }
}
