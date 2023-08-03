package com.Recursion;

public class StringToInteger {
    public static int convertStringToInt(String input){
        if(input.length()==1){
            int ans=input.charAt(0);
            return ans-48;
        }
        int result=input.charAt(0);
        return (int) ((result-48)*Math.pow(10,input.length()-1))+convertStringToInt(input.substring(1));
        // Write your code here

    }
}
