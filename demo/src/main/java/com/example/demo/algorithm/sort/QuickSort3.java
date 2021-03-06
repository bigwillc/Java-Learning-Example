package com.example.demo.algorithm.sort;

import java.util.zip.CheckedOutputStream;

public class QuickSort3 {

    private void quickSort(int[] nums, int begin, int end) {
        if (begin < end) {
            int pivot = partition(nums, begin, end);
            quickSort(nums, begin, pivot - 1);
            quickSort(nums, pivot + 1, end);
        }
    }

    private int partition(int[] nums, int begin, int end) {
       int pivot = end;
       // counter 指向第一个大于nums[pivot]的值
       int counter = begin;
//        for (int i = begin; i < end; i++) {
//            if (nums[i] < nums[pivot]) {
//                int temp = nums[i];
//                nums[i] = nums[counter];
//                nums[counter] = temp;
//                counter++;
//            }
//        }

        for (int i = begin; i < end; i++) {
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
