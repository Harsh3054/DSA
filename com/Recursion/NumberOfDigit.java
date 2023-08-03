package com.Recursion;

public class NumberOfDigit {
    public static int count(int n){

        if(n==0){
            return 0;
        }
        return count(n/10)+1;
    }
}
