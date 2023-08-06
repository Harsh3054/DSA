package com.Arrays;

import java.util.Arrays;

public class PairSum {
    public static int pairSum(int[] arr,int num,int startIndex,int endIndex){
        //Arrays.sort(arr); if only pairSum
        //int startIndex=0;//if only pairSum
        int numPair=0;
        //int endIndex= arr.length-1;//if only pairSum
        while(startIndex<endIndex){
            if(arr[startIndex]+arr[endIndex]<num){
                startIndex++;
            }
            else if(arr[startIndex]+arr[endIndex]>num){
                endIndex--;
            }
            else{
                int elementAtStart=arr[startIndex];
                int elementAtEnd=arr[endIndex];
                if(elementAtStart==elementAtEnd){
                    int totalElementsFromStartToEnd=(endIndex-startIndex)+1;
                    numPair+=(totalElementsFromStartToEnd*(totalElementsFromStartToEnd-1)/2);
                    return numPair;
                }
                int tempStartIndex=startIndex+1;
                int tempEndIndex=endIndex-1;
                while(tempStartIndex<=tempEndIndex && arr[tempStartIndex]==elementAtStart){
                    tempStartIndex++;
                }
                while(tempStartIndex<=tempEndIndex && arr[tempEndIndex]==elementAtEnd){
                    tempEndIndex--;
                }
                int totalElementsFromStart=(tempStartIndex-startIndex);
                int totalElementsFromEnd=(endIndex-tempEndIndex);
                numPair+=(totalElementsFromStart*totalElementsFromEnd);

                startIndex=tempStartIndex;
                endIndex=tempEndIndex;


            }
        }
        return numPair;
    }
}
