package com.example.demo.algorithm.array;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = sumOfSubArray(nums, i, j);
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public int sumOfSubArray(int[] nums, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += nums[k];
        }
        return sum;
    }

}
