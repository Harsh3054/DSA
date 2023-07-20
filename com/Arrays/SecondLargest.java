package com.Arrays;

public class SecondLargest {
    public static int secondLargestElement(int[] arr) {
    int largest=Integer.MIN_VALUE;
    int secondlarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secondlarge=largest;
            largest=arr[i];
        }
        else if(largest==arr[i]){
            continue;
        }
        else{
            if(arr[i]>secondlarge){
                secondlarge=arr[i];
            }
        }
    }
        return secondlarge;
}

}
