package com.example.demo.algorithm.sort;

public class MergeSort2 {

    public void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int k = 0;
        int[] temp = new int[right - left + 1];

        while (l< mid && r<right) {
            temp[k++] = (nums[l] < nums[r]) ? nums[l++] : nums[r++];
        }

        while (l <= mid) {
            temp[k++] = nums[l++];
        }

        while (r <= right) {
            temp[k++] = nums[r++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[left + i] = temp[i];
        }
    }
}
