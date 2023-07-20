package com.Arrays;

public class rotateArray {
    public static void rotate(int[] arr, int d) {
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
//1
// 7
// 1 2 3 4 5 6 7 => Input
//2->d
//Output ->3 4 5 6 7 1 2

