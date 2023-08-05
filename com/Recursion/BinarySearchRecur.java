package com.Recursion;

public class BinarySearchRecur {
    public static int binarySearch(int input[], int element) {
        // Write your code here
        return binary_Search(input, 0, input.length - 1, element);
    }
    private static int binary_Search(int[] input, int startIndex, int endIndex, int element) {

        if (startIndex > endIndex) {
            return -1;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;

        if (input[mid] == element) {
            return mid;
        } else if (input[mid] > element) {
            return binary_Search(input, startIndex, mid - 1, element);
        }
        return binary_Search(input, mid + 1, endIndex, element);

    }
}
