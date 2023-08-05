package com.Recursion;

public class QuickSort {
    public static void quickSort(int[] input) {
        quick_Sort(input, 0, input.length - 1);
    }
    private static void quick_Sort(int[] input,int startIndex,int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int pivotPos=partition(input,startIndex,endIndex);
        quick_Sort(input,startIndex,pivotPos-1);
        quick_Sort(input,pivotPos+1,endIndex);
    }
    private static int partition(int[] input,int startIndex,int endIndex){

        int pivot=input[startIndex];//find pivot
        int count=0;
        for(int i=startIndex+1;i<=endIndex;i++){
            if(input[i]<=pivot){
                count++;
            }
        }
        int pivotPos=startIndex+count;
        int temp=input[pivotPos];
        input[pivotPos]=pivot;//placed pivot at its correct position in final array
        input[startIndex]=temp;
        int start=startIndex;
        int end=endIndex;
        while(start<pivotPos && end>pivotPos){
            if(input[start]<=pivot){
                start++;
            }
            else if(input[end]>pivot){
                end--;

            }
            else{
                int tempnew=input[end];
                input[end]=input[start];
                input[start]=tempnew;
                start++;
                end--;
            }   //ensure all the left elements are smaller than pivot and all right elements are greater than pivot
        }

        return pivotPos;
    }
}
