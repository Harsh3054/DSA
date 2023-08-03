package com.Recursion;

public class checkNumber {
    public static boolean checkNumber(int input[], int x) {
        return helper(input,x,0);
    }
    public static boolean helper(int[] input,int x,int startIndex){
        if(startIndex>=input.length){
            return false;
        }
        if(input[startIndex]==x){
            return true;
        }
        return helper(input,x,startIndex+1);
    }
}
