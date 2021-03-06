package com.example.demo.algorithm.microsoft;

import java.util.Arrays;

public class FindLHS {
    public int findLHS(int[] nums) {

        int maxLen = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == 1) {
                    count = j - i + 1;
                }
            }
            maxLen = maxLen < count ? count : maxLen;
        }
        return maxLen;
    }
}
