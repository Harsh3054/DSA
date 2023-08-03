package com.Recursion;

public class Sum {
    public static int sum(int input[]) {
        return helper(input,0);
    }
    public static int helper(int[] input,int startIndex){
        if(startIndex==input.length){
            return 0;
        }
        return input[startIndex]+helper(input,startIndex+1);
    }
}
