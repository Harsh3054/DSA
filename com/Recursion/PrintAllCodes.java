package com.Recursion;

public class PrintAllCodes {
    public static void printAllPossibleCodes(String input) {
        // Write your code here
        String ans="";
        printAllPossibleCodes(input,ans);

    }
    public static void printAllPossibleCodes(String input,String ans){

        if(input.length()==0){
            System.out.println(ans);
            return;
        }

        int first=input.charAt(0)-'0';
        char ch=getchar(first);
        printAllPossibleCodes(input.substring(1),ans+ch);
        if(input.length()>=2) {
            int two = first * 10 + (input.charAt(1) - '0');
            if(two>=10 && two<=26){
                char ch1 = getchar(two);
                printAllPossibleCodes(input.substring(2), ans + ch1);
            }
        }
    }
    public static char getchar(int n){
        return (char) (n+96);
    }
}
