package com.Recursion;

public class StairCase {
    public static int staircase(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        int x=staircase(n-3);
        int y=staircase(n-2);
        int z=staircase(n-1);
        return x+y+z;
    }
}
