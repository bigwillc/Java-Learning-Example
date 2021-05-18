package com.example.demo.algorithm.practice.week1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author bigwillc
 **/
public class TwoSum {

    // Solution 1
    // 暴力
    // 时间复杂度:O(n^2)
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // Solution 2
    // 使用hashmap优化
    // 时间复杂度: O(n)
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && i != map.get(temp)) {
                return new int[]{i, map.get(temp)};
            }
        }
        return null;
    }
}
