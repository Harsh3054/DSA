package com.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
            for(int j=0; j<n-i; j++){
                //In each iteration biggest element is going
                //at the end of an array.So array is sorted from the end
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //Your code goes here
    }
}
