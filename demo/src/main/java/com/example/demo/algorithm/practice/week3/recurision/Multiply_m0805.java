package com.example.demo.algorithm.practice.week3.recurision;

/**
 * @author bigwillc
 **/
public class Multiply_m0805 {

    public int multiply(int A, int B) {
        int[] nums = new int[B + 1];
        nums[0] = 0;
        nums[1] = A;
        for (int i = 2; i <= B; i++) {
            nums[i] = nums[i - 1] + A;
        }
        return nums[B];
    }
}
