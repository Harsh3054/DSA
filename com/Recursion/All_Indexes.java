package com.Recursion;

public class All_Indexes {
    public static int[] allIndexes(int input[], int x) {
        return all_Indexes(input, 0, x);
    }
    private static int[] all_Indexes(int[] input,int startIndex,int x) {

        if (startIndex == input.length) {
            return new int[0];
        }

        int[] output= all_Indexes(input,startIndex+1,x);
        if(input[startIndex]==x){
            int[] ans=new int[output.length+1];
            for(int i=0;i< output.length;i++){
                ans[i+1]=output[i];
            }
            ans[0]=startIndex;
            return ans;
        }
        else{
            return output;
        }
    }
}
