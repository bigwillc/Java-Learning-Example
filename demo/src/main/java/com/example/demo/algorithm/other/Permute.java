package com.example.demo.algorithm.other;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bigwillc
 **/
public class Permute {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permuteSub(nums, 0);
        return res;
    }

    public void permuteSub(int[] nums, int start) {
        if (start == nums.length - 1) {
            Integer[] arr = new Integer[nums.length];
            for (int i = 0; i < nums.length; i++) {
                arr[i] = nums[i];
            }
            res.add(Arrays.asList(arr));
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            permuteSub(nums, start + 1);
            swap(nums, i, start);
        }

    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
