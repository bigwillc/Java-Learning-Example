package com.example.demo.algorithm.other;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int[] nextPermutation(int[] nums) {
        //从后面找一个次大的替换
        int i = nums.length - 2;
        for (; i >= 0; i--) {
            int minNum = i;
            int k = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    k = j;
                    minNum = nums[minNum] > nums[k] ? k : minNum;
                }
            }
            if (minNum != i) {
                swap(nums, i, minNum);
                return nums;
            }
        }

        Arrays.sort(nums);
        return nums;
    }

    public static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
