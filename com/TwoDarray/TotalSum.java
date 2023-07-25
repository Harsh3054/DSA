package com.TwoDarray;

public class TotalSum {
    public static void totalSum(int[][] mat) {
//        For a given two-dimensional square matrix of size (N x N).
//        Find the total sum of elements on both the diagonals and at all the four boundaries.
        if(mat.length==0){
            System.out.print(0);
            return;
        }
        int rowstart=0;
        int rowend=mat.length-1;
        int colstart=0;
        int colend=mat[0].length-1;
        int sum=0;
        while(true){
            for(int col=colstart;col<=colend;col++){
                sum+=mat[rowstart][col];
            }
            rowstart++;
            for(int row=rowstart;row<=rowend;row++){
                sum+=mat[row][colend];
            }
            colend--;
            for(int col=colend;col>=colstart;col--){
                sum+=mat[rowend][col];
            }
            rowend--;
            for(int row=rowend;row>=rowstart;row--){
                sum+=mat[row][colstart];
            }


            colstart++;
            for(int i=rowstart,j=colstart;i<=rowend && j<=colend;i++,j++){
                sum+=mat[i][j];
            }
            for(int i=rowstart,j=colend;i<=rowend && j>=rowstart;i++,j--){
                sum+=mat[i][j];
            }
            break;
        }
        if(mat.length % 2 != 0) {
            System.out.println(sum - mat[mat.length / 2][mat[0].length / 2]);
        }
        else{
            System.out.print(sum);
        }
        //Your code goes here
    }
}
