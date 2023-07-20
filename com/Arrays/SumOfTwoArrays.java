package com.Arrays;

public class SumOfTwoArrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int i=arr1.length-1;
        int j=arr2.length-1;
        int n=output.length-1;
        int sum=0,carry=0;
        while(i>=0 && j>=0){
            sum=arr1[i]+arr2[j]+carry;
            carry=0;
            if(sum<=9){
                output[n]=sum;
            }
            else{
                int rem=sum%10;
                output[n]=rem;
                carry++;
            }
            i--;
            j--;
            n--;
        }
        if(n==0 && carry==1){
            output[n]=carry;
        }
        while(i>=0){
            int sum1=arr1[i]+carry;
            carry=0;
            if(sum1<=9){
                output[n]=sum1;
            }
            else{
                int rem=sum1%10;
                output[n]=rem;
                carry++;
            }
            i--;
            n--;
            // if(n==0 && carry==1){
            //     output[n]=carry;
            // }
        }
        while(j>=0){
            int sum2=arr2[j]+carry;
            carry=0;
            if(sum2<=9){
                output[n]=sum2;
            }
            else{
                int rem1=sum2%10;
                output[n]=rem1;
                carry++;
            }
            j--;
            n--;
            // if(n==0 && carry==1){
            //     output[n]=carry;
            // }
        }
        //Your code goes here
    }

    public static void sumOfTwoArrays1(int[] arr1,int[] arr2,int[] output){

        int i= arr1.length-1;
        int j= arr2.length-1;
        int k=Math.max(arr1.length,arr2.length);
        int carry=0;
        while(i>=0 && j>=0){
            int sum=arr1[i]+arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        while(i>=0){
            int sum=arr1[i]+carry;
            output[k]=sum%10;
            carry=sum/10;
            i--;
            k--;
        }
        while(j>=0){
            int sum=arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;
            j--;
            k--;
        }
        output[0]=carry;
    }

}
//input->9 7 6 9,4 5 9
//output->1 0 2 2 0
