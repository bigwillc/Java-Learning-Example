package com.example.demo.algorithm.hash;

import java.util.HashSet;

public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return nums[i];
            }
            hashSet.add(nums[i]);
        }
        return -1;
    }
}
