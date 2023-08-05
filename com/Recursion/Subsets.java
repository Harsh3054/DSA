package com.Recursion;

public class Subsets {
    public static int[][] subsets(int input[]) {
        return sub_sets(input,0);
        // Write your code here

    }
    public static int[][] sub_sets(int[] input,int startIndex){

        if(startIndex==input.length){
            int[][] ans=new int[1][0];
            return ans;
        }

        int[][] small=sub_sets(input,startIndex+1);
        int[][] result= new int[2*small.length][];
        int k=0;
        for(int i=0;i<small.length;i++){
            result[k]=new int[small[i].length];
            for(int j=0;j<small[i].length;j++){
                result[k][j]=small[i][j];
            }
            k++;
        }

        for(int i=0;i<small.length;i++){
            result[k]=new int[small[i].length+1];
            result[k][0]=input[startIndex];
            for(int j=1;j<=small[i].length;j++){
                result[k][j]=small[i][j-1];
            }
            k++;
        }

        return result;

    }
}
