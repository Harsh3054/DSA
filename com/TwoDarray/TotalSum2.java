package com.TwoDarray;

public class TotalSum2 {

        //another way to solve total sum problem
        public static int getFirstDiagonalSum(int[][] mat,int dimension){
            int currRow=0;
            int currCol=0;
            int diagonalSum=0;
            while(currRow<dimension && currCol<dimension){
                diagonalSum+=mat[currRow][currCol];
                currRow++;
                currCol++;
            }
            return diagonalSum;
        }
        public static int getSecondDiagonalSum(int[][] mat,int dimension){
            int currRow=0;
            int currCol=dimension-1;
            int diagonalSum=0;
            while(currRow<dimension && currCol>=0){
                diagonalSum+=mat[currRow][currCol];
                currRow++;
                currCol--;

            }
            return diagonalSum;
        }
        public static int getBoundarySum(int[][] mat,int dimension){
            int sum=0;
            for(int i=1;i<dimension-1;i++){
                sum+=mat[0][i];//For upper side
                sum+=mat[i][dimension-1];//For right side
                sum+=mat[dimension-1][i];//For lower side
                sum+=mat[i][0];//for left side
            }
            return sum;
        }
        public static void totalsum(int[][] mat){
            int n= mat.length;;
            if(n==0){
                System.out.println(0);
                return;
            }
            int totalsum=getBoundarySum(mat,n)+getFirstDiagonalSum(mat,n)+getSecondDiagonalSum(mat,n);
            if(n%2!=0){
                totalsum-=mat[n/2][n/2];
            }
            System.out.println(totalsum);
        }

}
