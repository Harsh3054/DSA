package com.Strings;

public class LongestPalindromeSubstring {
    public static boolean isPalindrome(String str){
        if(str.length()==2 && str.charAt(0)==str.charAt(1)) return true;
        else if(str.length()==2 && str.charAt(0)!=str.charAt(1)) return false;
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        int n=s.length();
        int i=0;
        while(i<n){
            int j=n;
            while(j>i){
                String small=s.substring(i,j);
                if(isPalindrome(small)) return small;
                j--;
            }
            i++;
        }
        return null;
    }
}
