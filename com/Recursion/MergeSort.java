package com.Recursion;

public class MergeSort {

    public static void mergesort(int[] input) {
        MergeSort(input, 0, input.length - 1);
    }
    public static void MergeSort(int[] input,int sI,int eI ){
        if(sI>=eI){
            return;
        }
        int mid=sI+(eI-sI)/2;
        MergeSort(input,sI,mid);
        MergeSort(input,mid+1,eI);
        Merge(input,sI,eI);
    }
    public static void Merge(int[] input,int sI,int eI){
        int mid=sI+(eI-sI)/2;
        int[] ans=new int[eI-sI+1];
        int i=sI;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=eI){
            if(input[i]<input[j]){
                ans[k]=input[i];
                i++;
                k++;
            }
            else{
                ans[k]=input[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            ans[k]=input[i];
            i++;
            k++;
        }
        while(j<=eI){
            ans[k]=input[j];
            j++;
            k++;
        }
        for(int index=0;index<ans.length;index++){
            input[sI+index]=ans[index];
        }
    }
}
