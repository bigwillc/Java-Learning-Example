package com.example.demo.algorithm.sort;

public class MergeSort4 {
    public void mergeSort(int[] nums, int begin, int end) {
        if (begin < end) {
            int mid = (begin + end) / 2;
            mergeSort(nums, begin, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, begin, mid, end);
        }
    }

    private void merge(int[] nums, int begin, int mid, int end) {
        int l = begin, m = mid + 1, r = end;
        int[] temp = new int[end - begin + 1];
        int k = 0;
        while (l <= mid && m <= end) {
            temp[k++] = nums[l] <= nums[m] ? nums[l++] : nums[m++];
        }
        while (l <= mid) {
            temp[k++] = nums[l++];
        }
        while (m <= end) {
            temp[k++] = nums[m++];
        }
        for (int i = 0; i < end - begin + 1; i++) {
            nums[begin + i] = temp[i];
        }
    }


}
