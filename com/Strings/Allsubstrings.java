package com.Strings;

public class Allsubstrings {
    public static void printSubstrings(String str) {
        int i=0;
        while(i<str.length()){
            int j=i;
            //Character at index start
            while(j<str.length()){
                System.out.println(str.substring(i,j+1));
                j++;
            }
            i++;
        }
    }
}
