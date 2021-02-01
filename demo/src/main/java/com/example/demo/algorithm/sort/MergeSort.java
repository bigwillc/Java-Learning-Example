package com.example.demo.algorithm.sort;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // 所有这种合并都是这种三段式的
        while (i < mid && j < right) {
            temp[k] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[j++] = arr[j++];
        }

        // arr 赋值
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = arr[p];
        }
    }
}
