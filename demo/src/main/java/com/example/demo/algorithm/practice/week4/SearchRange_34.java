package com.example.demo.algorithm.practice.week4;

import javax.sound.midi.Soundbank;

/**
 * @author bigwillc
 **/
public class SearchRange_34 {

    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high - low) / 2;
        while (low < high) {
            if (nums[mid] == target) {
                int left = mid, right = mid;
                while (left > 0 && nums[left - 1] == nums[left]) {
                    left--;
                }
                while (right < nums.length - 1 && nums[right + 1] == nums[right]) {
                    right++;
                }
                return new int[]{left, right};
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = low + (high - low) / 2;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        SearchRange_34 sr = new SearchRange_34();
        System.out.println(sr.searchRange(nums, 8));
    }
}
