package com.Strings;

public class Reversewordwise {
    public static String reverseWordWise(String str){

        int n=str.length();
        int end=n;
        String result="";
        int i=n-1;
        while(i>=0){

            if(str.charAt(i)==' '){
                result+=str.substring(i+1,end)+" ";
                end=i;
            }
            i--;
        }
        result+=str.substring(i+1,end);
        return result;

    }
}
