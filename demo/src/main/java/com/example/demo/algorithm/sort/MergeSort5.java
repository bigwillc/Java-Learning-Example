package com.example.demo.algorithm.sort;

public class MergeSort5 {

    public void mergeSort(int[] nums, int begin, int end) {
        if (begin < end) {
            int mid = (end + begin) / 2;
            mergeSort(nums, begin, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, begin, mid, end);
        }

    }

    private void merge(int[] nums, int begin, int mid, int end) {
        int l = begin, m = mid + 1;
        int[] arr = new int[end - begin + 1];
        int index = 0;
        while (l <= mid && m <= end) {
            arr[index++] = nums[l] <= nums[m] ? nums[l++] : nums[m++];
        }
        while (l <= mid) {
            arr[index++] = nums[l++];
        }
        while (m <= end) {
            arr[index++] = nums[m++];
        }
        for (int i = 0; i < end - begin + 1; i++) {
            nums[begin + i] = arr[i];
        }
    }
}
