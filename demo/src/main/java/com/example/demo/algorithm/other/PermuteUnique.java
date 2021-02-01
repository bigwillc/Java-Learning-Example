package com.example.demo.algorithm.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bigwillc
 **/
public class PermuteUnique {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        permuteSub(nums, 0);
        return res;
    }

    private void permuteSub(int[] nums, int start) {

        if (start == nums.length - 1) {
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                arr.add(nums[i]);
            }
            res.add(arr);
        }

        for (int i = start; i < nums.length; i++) {
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
            swap(nums, i, start);
//            while (nums[start] == nums[start + 1] && start < nums.length - 1) {
//                start++;
//            }
            permuteSub(nums, start);
            swap(nums, i, start);
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
