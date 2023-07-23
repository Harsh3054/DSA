package com.Strings;

public class Panlindrome {
    public static boolean isPalindrome(String str) {
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if((str.charAt(start))==(str.charAt(end))){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;//Your code goes here
    }
}
