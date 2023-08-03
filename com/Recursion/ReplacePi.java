package com.Recursion;

public class ReplacePi {
    public static String replace1(String input){
        String ans="";
        return replace_ans(input,0,ans);
        // Write your code here

    }
    public static String replace(String input){//another way
        String output="";
        if(input.length()<=1){
            return input;
        }
        String small=replace(input.substring(1));
        if(input.charAt(0)=='p'&& small.charAt(0)=='i'){
            output="3.14"+small.substring(1);
        }
        else{
            output=input.charAt(0)+small;
        }
        return output;
    }
    private static String replace_ans(String input,int startIndex,String ans) {

        if (startIndex >= input.length()-1) {
            if(startIndex==input.length()-1){
                ans=ans+ input.charAt(startIndex);
                return ans;
            }
            return ans;
        }
        if (input.charAt(startIndex) == 'p' && input.charAt(startIndex + 1) == 'i') {
            ans = ans + "3.14";
            return replace_ans(input, startIndex + 2, ans);
        }
        ans = ans + input.charAt(startIndex);
        return replace_ans(input, startIndex + 1, ans);
    }
}
