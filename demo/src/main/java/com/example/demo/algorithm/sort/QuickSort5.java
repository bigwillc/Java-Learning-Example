package com.example.demo.algorithm.sort;

public class QuickSort5 {
    public void quickSort(int[] nums, int begin, int end) {
        if (begin < end) {
            int pivot = partition(nums, begin, end);
            quickSort(nums, begin, pivot - 1);
            quickSort(nums, pivot + 1, end);
        }
    }

    private int partition(int[] nums, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i <= end; i++) {
            if (nums[i] < nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[counter];
                nums[counter] = temp;
                counter++;
            }
        }

        int temp = nums[counter];
        nums[counter] = nums[pivot];
        nums[pivot] = temp;
        return counter;
    }
}
