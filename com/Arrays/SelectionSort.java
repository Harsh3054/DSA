package com.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int minIndex=i;
            //selecting the minimum element from the
            //array and placing it in its correct position
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            if(minIndex != i){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }

        }
        //Your code goes here
    }
}
