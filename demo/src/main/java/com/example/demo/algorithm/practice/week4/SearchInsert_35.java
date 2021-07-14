package com.example.demo.algorithm.practice.week4;

/**
 * @author bigwillc
 **/
public class SearchInsert_35 {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high - low) / 2;
        if (target > nums[nums.length - 1]) {
            return nums.length;
        } else if (target < nums[0]) {
            return 0;
        }
        while (low < high) {
            if (nums[mid] == target) {
                break;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = low + (high - low) / 2;
        }
        return nums[mid] >= target ? mid : mid + 1;
    }

    public static void main(String[] args) {
        SearchInsert_35 si = new SearchInsert_35();
        int[] arr = new int[]{1, 3, 5, 6};
        System.out.println(si.searchInsert(arr, 5));
    }
}
