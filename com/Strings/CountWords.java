package com.Strings;

public class CountWords {
    public static int countWords(String str) {
        if(str.length()==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') {
                count++;
            }

        }
        return count+1;//Your code goes here
    }
}
