package com.Recursion;

public class Last_Index {
    public static int lastIndex(int input[], int x) {
        int[] ans = new int[1];
        ans[0] = -1;
        return last_Index(input, 0, x, ans);
    }
    private static int last_Index(int[] input,int startIndex,int x,int[] ans){
        if(startIndex==input.length-1){
            if(input[startIndex]==x){
                ans[0]=startIndex;
                return ans[0];
            }
            else{
                return ans[0];
            }
        }
        if(input[startIndex]==x){
            ans[0]=startIndex;
        }
        return last_Index(input,startIndex+1,x,ans);

    }
}
