package com.example.demo.algorithm.other;

public class NextPermutation2 {

    // 未写完
    public int[] nextPermutation(int[] nums) {
        // 从后面找一个大于自己的最小的数交换
        int i = nums.length - 2;
        while (i >= 0) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                boolean flag = false;
                if (nums[j] >= nums[i]) {
                    index = nums[j] < nums[index] ? j : index;
                }
            }

            i--;
        }
        return null;

    }

    public void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
