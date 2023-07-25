package com.TwoDarray;

public class PrintLikeWave {
    public static void wavePrint(int mat[][]){
        if(mat.length==0){
            return;
        }
        int n= mat.length-1;
        for(int i=0;i<mat[0].length;i++){
            if(i%2==0){
                for(int j=0;j<mat.length;j++){
                    System.out.print(mat[j][i]+" ");
                }
            }
            else{
                for(int k=n;k>=0;k--){
                    System.out.print(mat[k][i]+" ");
                }
            }
        }
        //Your code goes here
    }
}
