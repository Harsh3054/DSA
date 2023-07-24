package com.Strings;

public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str){
        String ans="";
        int length=str.length();
//        Input String: "aabbbcc"
//        Expected Output: "abc"
        int startIndex=0;
        while(startIndex<length){
            char uniqueChar=str.charAt(startIndex);
            int nextUniqueCharIndex=startIndex+1;
            while(nextUniqueCharIndex<length && str.charAt(nextUniqueCharIndex)==uniqueChar){
                nextUniqueCharIndex++;
            }
            ans+=uniqueChar;
            startIndex=nextUniqueCharIndex;
        }
        return ans;
    }
}
