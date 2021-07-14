package com.example.demo.algorithm.practice.week3.recurision;

import sun.nio.cs.ISO_8859_2;

/**
 * @author bigwillc
 **/
public class Fib_j10 {
    public int fib(int n) {
        if( n<= 1) return n;
//        int[] nums = new int[n + 1];
//        nums[0] = 0;
//        nums[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            nums[i] = nums[i - 1] + nums[i - 2];
//        }
//        return nums[n];

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Fib_j10 f = new Fib_j10();
        System.out.println(f.fib(45));
    }
}
