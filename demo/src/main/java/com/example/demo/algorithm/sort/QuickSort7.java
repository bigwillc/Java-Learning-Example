package com.example.demo.algorithm.sort;

public class QuickSort7 {
    public void quickSort(int[] nums, int begin, int end) {
        if (begin < end) {
            int pivot = partition(nums, begin, end);
            quickSort(nums, begin, pivot - 1);
            quickSort(nums, pivot + 1, end);
        }
    }

    private int partition(int[] nums, int begin, int end) {
        int pivot = end;
        int l = begin, r = end;
        int counter = begin;
        for (int i = begin; i < end - 1; i++) {
            if (nums[i] < nums[pivot]) {
                int temp = nums[counter];
                nums[counter] = nums[i];
                nums[i] = temp;
                counter++;
            }
        }
        int temp = nums[pivot];
        nums[pivot] = nums[counter];
        nums[counter] = temp;
        return counter;
    }
}
