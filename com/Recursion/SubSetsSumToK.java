package com.Recursion;

public class SubSetsSumToK {
    public static int[][] subsetsSumK(int input[], int k) {
        return sub_setssum(input,0,k);
        // Write your code here

    }
    private static int[][] sub_setssum(int[] input,int startIndex, int k){

        if(input.length==startIndex) {
            if (k == 0) {
                int[][] ans=new int[1][0];
                return ans;
            }
            else{
                int[][] ans=new int[0][0];
                return ans;
            }
        }


        int[][] output2=sub_setssum(input,startIndex+1,k-input[startIndex]);
        int[][] output1= sub_setssum(input,startIndex+1,k);
        int x= output2.length;
        int y= output1.length;
        int[][] ans=new int[x+y][0];
        int l=0;
        for(int i=0;i< output1.length;i++){
            ans[l]=new int[output1[i].length];
            for(int j=0;j<output1[i].length;j++){
                ans[l][j]=output1[i][j];
            }
            l++;
        }

        for(int i=0;i< output2.length;i++){
            ans[l]=new int[output2[i].length+1];
            ans[l][0]=input[startIndex];
            for(int j=1;j<= output2[i].length;j++){
                ans[l][j]=output2[i][j-1];
            }
            l++;
        }
        return ans;

    }
}
