package com.Recursion;

public class PrintSubsetSumToK {

    public static void printSubsetsSumTok(int input[], int k) {
        // Write your code here
        int[] output= new int[0];
        print_SubsetsSumTok(input,0,k,output);
    }
    private static void print_SubsetsSumTok(int[] input,int startIndex,int k,int[] output){

        if(startIndex==input.length){
            if(k==0){
                for(int i= output.length-1;i>=0;i--){
                    System.out.print(output[i]+" ");
                }
                System.out.println();
                return;
            }
            else{
                return;
            }
        }
        print_SubsetsSumTok(input,startIndex+1,k,output);

        int[] temp=new int[output.length+1];
        temp[0]=input[startIndex];
        for(int i=0;i< output.length;i++){
            temp[i+1]=output[i];
        }
        print_SubsetsSumTok(input,startIndex+1,k-input[startIndex],temp);
    }
}
