package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlapping {
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        // Write your code here.
        int n=arr.length;
        Arrays.sort(arr, (a,b)->Integer.compare(a[0], b[0]));
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int[] inner=arr[i];
            if(ans.isEmpty() || inner[1]>ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(inner[0],inner[1]));
            }
            else{
                ans.get(ans.size()-1).set(1,Math.max(inner[1],ans.get(ans.size()-1).get(1)));
            }


        }
        return ans;

    }
}
