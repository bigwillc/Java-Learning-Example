package com.example.demo.algorithm.sort;

public class HeapSort3 {

    public static void heapSort(int[] arr) {
        if(arr.length == 0) return;
        int len = arr.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(arr, len, i);
        }
        for (int i = len - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int len, int i) {
        int left = 2 * i + 1, right = 2 * i + 2;
        int largest = i;
        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, len, largest);
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
