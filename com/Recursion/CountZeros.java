package com.Recursion;

public class CountZeros {
    public static int countZerosRec(int input){
        if(input==0){
            return 1;
        }
        else if(input/10==0){
            return 0;
        }
        int ans=input%10;
        if(ans==0) {
            return 1+countZerosRec(input / 10);
        }
        return countZerosRec(input/10);
        // Write your code here
    }
}
