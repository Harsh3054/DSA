package com.Recursion;

public class Subsequences {

    public static String[] subsequences(String str) {
        if (str.length() == 0) {
            String[] ans = {""};
            return ans;
        }
        String[] smallAns = subsequences(str.substring(1));
        String[] ans = new String[smallAns.length * 2];
        for (int i = 0; i < smallAns.length; i++) {
            ans[i] = smallAns[i];
        }
        for (int i = 0; i < smallAns.length; i++) {
            ans[i + smallAns.length] = str.charAt(0) + smallAns[i];
        }
        return ans;
    }
    public static void printSub_Sequences(String str,String outputSoFar){
        if(str.length()==0){
            System.out.println(outputSoFar);
            return;
        }
        printSub_Sequences(str.substring(1),outputSoFar);
        printSub_Sequences(str.substring(1),str.charAt(0)+outputSoFar);
    }
    public static void printSubsequences(String str){
        printSub_Sequences(str,"");
    }
}
