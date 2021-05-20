package com.example.demo.algorithm.sort;

public class QuickSort6 {
    public void quickSort(int[] nums, int begin, int end) {
        // 终止条件
        if (begin < end) {
            int pivot = partition(nums, begin, end);
            quickSort(nums, begin, pivot - 1);
            quickSort(nums, pivot + 1, end);
        }
    }

    private int partition(int[] nums, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (nums[i] < nums[pivot]) {
                int temp = nums[counter];
                nums[counter] = nums[i];
                nums[i] = temp;
                counter++;
            }
        }

        int temp = nums[counter];
        nums[counter] = nums[pivot];
        nums[pivot] = temp;
        return counter;
//
//        int pivot = end;
//        // count point the first number of greater than pivot
//        int count = begin;
//        for (int i = begin; i < end; i++) {
//            if (nums[i] < nums[pivot]) {
//                int temp = nums[i];
//                nums[i] = nums[count];
//                nums[count] = temp;
//                count++;
//            }
//        }
//
//        int temp = nums[pivot];
//        nums[pivot] = nums[count];
//        nums[count] = temp;
//        return count;
    }


}
