package com.example.demo.algorithm.hash;

import java.util.HashMap;

/**
 * @author bigwillc
 **/
public class MajorityElement {
    public int MajorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer temp = hashMap.get(nums[i]);
            if (temp == null) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], temp + 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = hashMap.get(nums[i]);
            if (temp > nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }
}
