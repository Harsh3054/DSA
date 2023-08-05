package com.Recursion;

public class PrintUniqueSubsets {
    public static void printSubsets(int input[]) {
        // Write your code here
        int[] ans=new int[0];
        print_Subsets(input,0,ans);

    }
    public static void print_Subsets(int[] input,int startIndex,int[] ans){
        if(input.length==startIndex){
            for(int i=0;i< ans.length;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            return;
        }
        //not included in answer
        print_Subsets(input,startIndex+1,ans);

        int[] temp=new int[ans.length+1];
        int i=0;
        for(;i< ans.length;i++){
            temp[i]=ans[i];
        }
        temp[i]=input[startIndex];
        print_Subsets(input,startIndex+1,temp);
    }

}
