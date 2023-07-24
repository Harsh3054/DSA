package com.Strings;

public class ReverseEachWord {
    public static String reverseEachWord(String str) {
        String temp="";
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                ans=ans+temp+' ';
                temp="";
            }
            else{
                temp=str.charAt(i)+temp;
            }
        }
        return ans+temp;
        //Your code goes here
    }
}
