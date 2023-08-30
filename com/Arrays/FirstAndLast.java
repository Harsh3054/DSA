package com.Arrays;

import java.util.ArrayList;

public class FirstAndLast {
    //First and Last Position of an Element In Sorted Array
    public static int[] firstAndLastPosition(ArrayList<Integer> nums, int n, int target) {
        // Write your code here.
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(ArrayList<Integer> nums,int target,boolean firstindex){
        int ans=-1;
        int start=0;
        int end=nums.size()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums.get(mid)){
                end=mid-1;
            }
            else if(target>nums.get(mid)){
                start=mid+1;
            }
            else{
                ans=mid;
                if(firstindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
