package com.Arrays;

import java.util.Arrays;

public class TripletSum {
    public static int tripletSum(int[] arr, int num) {
        Arrays.sort(arr);
        int n = arr.length;

        int numTriplets = 0;

        for (int i=0; i<n; i++) {
            int pairSumFor = num - arr[i];

            int numPairs=PairSum.pairSum(arr,pairSumFor,i+1,n-1);
            numTriplets+=numPairs;

        }
        return numTriplets;
    }
}
