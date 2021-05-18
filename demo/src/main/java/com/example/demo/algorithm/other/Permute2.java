package com.example.demo.algorithm.other;

/**
 * @author bigwillc
 **/
public class Permute2 {

    public void permute(int[] nums) {
        if (nums.length == 0) {
            System.out.println(nums);
        }
        perm(nums, 0);
    }

    public void perm(int[] nums, int start) {
        if (start == nums.length - 1) {
            System.out.println(nums);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            perm(nums, start + 1);
            swap(nums, i, start);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
