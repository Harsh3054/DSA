package com.Recursion;

public class Geometricsum {
    public static double findGeometricSum(int k){
        if(k==0){
            return 1;
        }
        double ans=  (1/Math.pow(2.0,k));
        double result=ans+findGeometricSum(k-1);
        return result;
        // 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)

    }
}
