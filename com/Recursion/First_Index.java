package com.Recursion;

public class First_Index {
    public static int firstIndex(int input[], int x) {
        return first_Index(input, 0, x);
    }
    private static int first_Index(int input[],int startIndex,int x){

        if(startIndex==input.length-1){
            if(input[startIndex]==x){
                return startIndex;
            }
            else{
                return -1;
            }
        }
        if(input[startIndex]==x){
            return startIndex;
        }
        return first_Index(input,startIndex+1,x);

    }
}
