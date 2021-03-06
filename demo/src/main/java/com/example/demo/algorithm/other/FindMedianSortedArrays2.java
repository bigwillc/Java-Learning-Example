package com.example.demo.algorithm.other;

public class FindMedianSortedArrays2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // merge array
        int[] arr = mergeArrays(nums1, nums2);
        // find the res
        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        } else {
            double res;
            res = arr[arr.length / 2 - 1] + arr[arr.length / 2];
            return res;
        }
    }

    public int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length - 1];
        int l1 = 0, l2 = 0;
        int i = 0;
        while (l1 < nums1.length && l2 < nums2.length) {
            nums[i++] = nums1[l1] < nums2[l2] ? nums1[l1++] : nums2[l2++];
        }
        while (l1 < nums1.length) {
            nums[i++] = nums1[l1++];
        }
        while (l2 < nums2.length) {
            nums[i++] = nums2[l2++];
        }
        return nums;
    }
}
