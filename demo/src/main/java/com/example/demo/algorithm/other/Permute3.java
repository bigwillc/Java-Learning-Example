package com.example.demo.algorithm.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bigwillc
 **/
public class Permute3 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        perm(nums, 0);
        return res;
    }

    private void perm(int[] nums, int start) {
        if (start == nums.length - 1) {
            Integer[] arr = new Integer[nums.length];
            for (int i = 0; i < nums.length; i++) {
                arr[i] = nums[i];
            }
            res.add(Arrays.asList(arr));
        }

        for (int i = 0; i < nums.length; i++) {
            swap(nums, i, start);
            perm(nums, start + 1);
            swap(nums, i, start);
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

}
