package com.Arrays;

public class binarySearch {
    public static int binarySearch(int[] arr, int x) {

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;//Your code goes here
    }
}
