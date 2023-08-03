package com.Recursion;

public class CheckPalindrome {
    public static boolean isStringPalindrome(String input) {
        return is_Palindrome_Recursive(input,0,input.length()-1);
        // Write your code here

    }
    private static boolean is_Palindrome_Recursive(String input, int startIndex, int endIndex){
        if(startIndex>endIndex){
            return true;
        }

        if(input.charAt(startIndex)==input.charAt(endIndex)){
            return is_Palindrome_Recursive(input,startIndex+1,endIndex-1);
        }
        else{
            return false;
        }
    }
}
