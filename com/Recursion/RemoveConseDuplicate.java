package com.Recursion;

public class RemoveConseDuplicate {
    public static String removeConsecutiveDuplicates(String input){
        //input=aabccba
        //output=abcba
        if(input.length()==1){
            return input;
        }
        String smallOutput=removeConsecutiveDuplicates(input.substring(1));
        if( input.charAt(0)==smallOutput.charAt(0)){
            return (input.charAt(0)+smallOutput.substring(1));
        }else{
            return (input.charAt(0)+smallOutput);
        }
    }
    public static String removeConsecutiveDuplicates1(String s) {
        // Write your code here
        String ans="";
        return remove_Conse(s,ans,0,1);

    }
    private static String remove_Conse(String input,String ans,int startIndex,int Traversal){
        if(Traversal==startIndex+1) {
            ans = ans + input.charAt(startIndex);
        }
        if(Traversal==input.length()){
            return ans;
        }
        if (input.charAt(startIndex) == input.charAt(Traversal)) {

            return remove_Conse(input,ans,startIndex,Traversal+1);
        }
        else{
            startIndex=Traversal;
            return remove_Conse(input, ans, startIndex, Traversal+1);
        }
    }
}
