package com.TwoDarray;

public class Print2Darray {
    public static void print2DArray(int input[][]) {
        // Write your code here

        for(int i = 0;i<input.length;i++){
            int t = 0;
            while(t < input.length-i){
                for(int j = 0;j<input[i].length;j++){
                    System.out.print(input[i][j]+" ");
                }
                t++;
                System.out.println();
            }

        }

    }
}
