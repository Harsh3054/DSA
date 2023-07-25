package com.Arrays;

public class LeadersInAnArray {
    public static void leaders(int[] input) {
        if(input.length==0){
            return;
        }
        for (int i = 0; i < input.length; i++)
        {
            int j;
            for (j = i + 1; j < input.length; j++)
            {

                if (input[i] <input[j])
                    break;
                else{
                    continue;
                }
            }
            if (j == input.length) {// the loop didn't break
                System.out.print(input[i] + " ");
            }
        }
    }
}
