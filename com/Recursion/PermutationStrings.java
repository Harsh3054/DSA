package com.Recursion;

public class PermutationStrings {
    public static String[] permutationOfString(String input){
        //Write your code here
        int n=factorial(input.length());
        String[] ans=new String[n];
        permutation(0,input.toCharArray(),ans);
        return ans;
    }

    private static void permutation(int index,char[] chars,String[] ans){

        if(index==chars.length-1){
            String ans1="";
            for(int i=0;i<=chars.length-1;i++){
                ans1=ans1+chars[i];
            }
            for(int i=0;i< ans.length;i++){
                if(ans[i]==null){
                    ans[i]=ans1;
                    break;
                }
            }
            return;
        }

        for(int i=index;i<chars.length;i++){
            swap(i,index,chars);
            permutation(index+1,chars,ans);
            swap(i,index,chars);
        }


    }
    private static void swap(int i,int j,char[] chars){
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }


    private static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
