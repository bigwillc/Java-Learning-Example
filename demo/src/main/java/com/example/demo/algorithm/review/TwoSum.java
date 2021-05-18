package com.example.demo.algorithm.review;

import java.util.Arrays;

/**
 * @author bigwillc
 **/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int l = 0, r = nums.length - 1;
        Arrays.sort(nums);
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                res[0] = nums[l];
                res[1] = nums[r];
                return res;
            } else if(sum > target) {
                r--;
            }else {
                l++;
            }
        }
        return res;
    }
}
