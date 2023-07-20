package com.Arrays;

public class ArrayRotateCheck {
    public static int arrayRotateCheck(int[] arr){

        int start=0;
        int end=arr.length-1;
        // if(arr[start]<=arr[end]){
        //         return ans;
        // }
        if(arr.length==0){
            return 0;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1] && arr[mid]<arr[end]){
                end=mid;
            }
            else{
                start=mid+1;
            }
            //&& arr[mid]<arr[end]
            // else if(arr[mid]>arr[end] && arr[mid]>arr[mid+1]){
            //     start=mid+1;
            // }
            // else if(arr[mid]>arr[end] && arr[mid]<arr[mid+1]){
            //     start=mid+1;
            // }
        }

        return start;//Your code goes here
    }
}
//5 6 1 2 3 4->Input
//2->Output

