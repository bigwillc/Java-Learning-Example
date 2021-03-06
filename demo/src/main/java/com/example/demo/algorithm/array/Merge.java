package com.example.demo.algorithm.array;

import java.util.Arrays;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - nums2.length;
        mergeTwoArray(nums1, index, nums2);
        Arrays.sort(nums1);
    }

    public void mergeTwoArray(int[] nums1, int m, int[] nums2) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }
    }

}
