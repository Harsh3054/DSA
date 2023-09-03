package com.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {
//    You are given an array of unique integers that
//    contain numbers in random order.
//    You have to find the longest possible sequence of consecutive numbers using the
//    numbers from given array.
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {

        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int val:arr){
            map.put(val,true);
        }
        for(int val:arr){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
        }

        int maxstart=0;
        int maxlength=0;
        for(int val:arr){
            if(map.get(val)==true){
                int templength=1;
                int tempstart=val;
                while(map.containsKey(tempstart+templength)){
                    templength++;
                }
                if(templength>maxlength){
                    maxlength=templength;
                    maxstart=tempstart;
                }
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(maxstart);
        ans.add(maxstart+maxlength-1);
        return ans;
    }
}
