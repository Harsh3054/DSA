package com.Recursion;

public class Main {
    public static void main(String[] args) {

        String[] ans=PermutationStrings.permutationOfString("abc");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
