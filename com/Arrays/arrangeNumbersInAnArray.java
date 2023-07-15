package com.Arrays;

public class arrangeNumbersInAnArray {
    public static void arrange(int[] arr, int n) {
        int value = 1;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            arr[start] = value;
            if (start == end) {
                break;
            }
            value++;
            arr[end] = value;
            value++;
            start++;
            end--;
        }
    }
}