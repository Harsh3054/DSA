package com.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {

        for(int i=0;i<arr.length-1;i++){

            //In this algo we are taking one number
            //from unsorted array and placing it in its correct position
            //in sorted array
            int n=arr[i+1];
            int j=i;
            while(j>=0 && arr[j]>n ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=n;


        }
        //Your code goes here
    }
}
