package com.example.demo.algorithm.sort;

public class HeapSort4 {

    /*
    * 堆排序
    *
    * 1. 构建一次堆
    * 2. 遍历
    * */

    public void heapSort(int[] nums) {
        if (nums.length <= 0) {
            return;
        }

        for (int i = nums.length / 2; i >= 0; i--) {
            heapify(nums, nums.length, i);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            heapify(nums, i, 0);
        }
    }

    public void heapify(int[] nums, int length, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < length && nums[left] > nums[largest]) {
            largest = left;
        }
        if (right < length && nums[right] > nums[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = nums[largest];
            nums[largest] = nums[i];
            nums[i] = temp;
            heapify(nums, length, largest);
        }
    }

}
