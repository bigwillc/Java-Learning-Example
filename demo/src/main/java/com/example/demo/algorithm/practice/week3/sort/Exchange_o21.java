package com.example.demo.algorithm.practice.week3.sort;

/**
 * @author bigwillc
 **/
public class Exchange_o21 {
    public int[] exchange(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            while (nums[l] % 2 != 0 && l <= nums.length - 1) {
                l++;
            }
            while (nums[r] % 2 != 1 && r >= 0) {
                r--;
            }
            if (l < r) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }
        return nums;
    }
}
