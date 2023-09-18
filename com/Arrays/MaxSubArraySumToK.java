package com.Arrays;

import java.util.HashMap;

public class MaxSubArraySumToK {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        HashMap<Long,Integer> map=new HashMap<>();
        long sum=0;
        long maxLength=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==k){
                maxLength=Math.max(i+1,maxLength);
            }
            if(map.containsKey(sum-k)){
                maxLength=Math.max(i-map.get(sum-k),maxLength);
            }
            map.put(sum,i);
        }
        return (int)maxLength;
    }
}
