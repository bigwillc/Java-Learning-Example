package com.example.demo.algorithm.sort;

import java.util.Arrays;

public class HeapSort2 {

    public static void heapSort(int[] nums) {
        if(nums.length == 0) return;
        int len = nums.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(nums, len, i);
        }
        for (int i = len - 1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            heapify(nums, i, 0);
        }
    }

    public static void heapify(int[] arr, int length, int i) {
        int left = 2 * i + 1, right = 2 * i + 2;
        int largest = i;
        if (left < length && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < length && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, length, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 5, 7, 8, 9, 5, 7, 5, 1, 7, 16, 5, 25, 487, 4, 63};
        heapSort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int n : arr) {
            System.out.println(n);
        }

    }
}
