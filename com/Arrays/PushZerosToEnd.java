package com.Arrays;

public class PushZerosToEnd {
    public static void pushZerosAtEnd(int[] arr)
    {
        int nonZero = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[nonZero];
                arr[nonZero] = temp;
                nonZero++;
            }
        }
    }
}
//1
//7
//2 0 0 1 3 0 0->Input
//2 1 3 0 0 0 0->Output

