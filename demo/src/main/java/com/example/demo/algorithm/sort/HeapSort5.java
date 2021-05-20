package com.example.demo.algorithm.sort;

public class HeapSort5 {

    public void heapSort(int[] nums) {
        /*
        * 首先要创建一个大顶堆
        * 参数：nums
        * largest
        * length
        * */
        if (nums.length <= 0) {
            return;
        }
        // First, you have to make big heap before process this nums;
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
        int left = 2 * i + 1, right = 2 * i + 2;
        int largest = i;
        if (left < length && nums[left] > nums[largest]) {
            largest = left;
        }
        if (right < length && nums[right] > nums[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = nums[i];
            nums[i] = nums[largest];
            nums[largest] = temp;
            heapify(nums, length, largest);
        }
    }


}
