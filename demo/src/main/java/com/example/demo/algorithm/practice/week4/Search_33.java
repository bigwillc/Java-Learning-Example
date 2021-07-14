package com.example.demo.algorithm.practice.week4;

/**
 * @author bigwillc
 **/
public class Search_33 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 首先判断哪一边是有序的
            if (nums[0] <= nums[mid]) {
                if (nums[mid] > target && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // 这里为什么要‘=’， 可以在思考一下
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,1};
        Search_33 s = new Search_33();
        System.out.println(s.search(arr, 1));
    }
}
