package com.Recursion;

public class CalculatePower {
    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
