package com.TwoDarray;

public class PrintSpiral {
    public static void spiralPrint(int matrix[][]){
        if(matrix.length==0){
            return;
        }
        int rowstart=0;
        int rowend= matrix.length-1;
        int colstart=0;
        int colend=matrix[0].length-1;
        while(rowstart<=rowend && colstart<=colend){
            //for printing first row i am traversing column wise
            for(int col=colstart;col<=colend;col++){
                System.out.print(matrix[rowstart][col]+" ");
            }
            rowstart++;
            //for printing last column i am traversing row wise
            for(int row=rowstart;row<=rowend;row++){
                System.out.print(matrix[row][colend]+" ");
            }
            colend--;
            if(colend<0){
                break;
            }
            //for printing last row from right to left i am traversing column wise
            for(int col=colend;col>=colstart;col--){
                System.out.print(matrix[rowend][col]+" ");
            }
            rowend--;
            //for printing first column from bottom to top approach
            for(int row=rowend;row>=rowstart;row--){
                System.out.print(matrix[row][colstart]+" ");
            }
            colstart++;
        }
        //Your code goes here
    }
}
