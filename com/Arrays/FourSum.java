package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] arr, int k) {
        int n=arr.length;
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                int low=j+1,hi=n-1;
                while(low<hi){
                    long four_sum=arr[low];
                    four_sum+=arr[hi];
                    four_sum+=arr[i];
                    four_sum+=arr[j];

                    if(four_sum>k){
                        hi--;
                    }
                    else if (four_sum<k){
                        low++;
                    }
                    else{
                        List<Integer> res=new ArrayList<>();
                        res.add(arr[i]);
                        res.add(arr[j]);
                        res.add(arr[low]);
                        res.add(arr[hi]);
                        ans.add(res);
                        while(low<hi && arr[low]==res.get(2)) ++low;
                        while(low<hi && arr[hi]==res.get(3)) --hi;
                    }
                }

            }

        }
        if(ans==null){
            return new ArrayList();
        }
        return ans;

    }

}
