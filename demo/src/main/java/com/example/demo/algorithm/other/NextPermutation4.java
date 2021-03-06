package com.example.demo.algorithm.other;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NextPermutation4 {
    /*
    * 排序
    *
    * */
    public int[] nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        for (int i = nums.length - 1; i > 0; i++) {
            if (nums[i] > nums[i - 1]) {
                Arrays.sort(nums, i, nums.length);
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] > nums[i - 1]) {
                        swap(nums, j, i - 1);
                        return nums;
                    }
                }
            }
        }
        Arrays.sort(nums);
        return nums;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
