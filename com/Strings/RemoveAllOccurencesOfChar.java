package com.Strings;

public class RemoveAllOccurencesOfChar {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ch){
                ans+=str.charAt(i);
            }
        }
        return ans;// Your code goes here
    }
//    aabccbaa
//    a
// Output->bccb
}
