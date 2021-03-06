package com.example.demo.algorithm.sort;

public class MergeSort3 {
    public void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int l = left, m = mid + 1, k = 0;
        int[] arr = new int[right - left + 1];
        while (l <= mid && m <= right) {
            arr[k++] = nums[l] < nums[m] ? nums[l++] : nums[m++];
        }
        while (l <= mid) {
            arr[k++] = nums[l++];
        }
        while (m <= right) {
            arr[k++] = nums[m++];
        }
        for (int i = 0; i < arr.length; i++) {
            nums[left + i] = arr[i];
        }
    }

}
