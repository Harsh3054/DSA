package com.Arrays;

public class LeetCode1283 {
    public static int smallestDivisor(int[] nums, int threshold) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i<min) min=i;
            if(i>max) max=i;
        }
        int ans=-1;
        int start=1;
        int end=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            int small=possible(mid,nums,threshold);
            if(small>threshold) start=mid+1;
            else if(small<=threshold){
                ans=mid;
                end=mid-1;
            }
        }
        return ans;

    }
    public static int possible(int num,int[] arr,int threshold){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)(arr[i])/(double)(num));
        }
        return sum;
    }
}
