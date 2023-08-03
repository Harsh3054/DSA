package com.Recursion;

public class SumOfDigits {
    public static int sumOfDigitsRecursive(int input){
        // Write your code here
        if(input==0){
            return 0;
        }
        return input%10 + sumOfDigitsRecursive(input/10);
    }
}
