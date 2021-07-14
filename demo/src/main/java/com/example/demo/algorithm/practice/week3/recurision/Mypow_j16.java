package com.example.demo.algorithm.practice.week3.recurision;

/**
 * @author bigwillc
 **/
public class Mypow_j16 {

    // 未写出来
    // 会堆栈内存溢出

    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if (n > 0) {
            if (n % 2 == 1) {
                return myPow(x, n - 1) * x;
            } else {
                return myPow(x * x, n / 2);
            }
        } else {
            return myPow(x, n + 1) * (1 / x);
        }
    }

    public double myPow2(double x, int n) {
        if(n == 0) return 1;
        if (n > 0) {
            double[] nums = new double[n];
            nums[0] = x;
            for (int i = 1; i < n; i++) {
                nums[i] = nums[i - 1] * x;
            }
            return nums[n - 1];
        } else {
            n = -n;
            double[] nums = new double[n];
            nums[0] = 1/x;
            for (int i = 1; i < n; i++) {
                nums[i] = nums[i - 1] * 1 / x;
            }
            return nums[n - 1];
        }
    }
}
