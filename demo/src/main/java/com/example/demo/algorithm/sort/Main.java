package com.example.demo.algorithm.sort;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 8, 9, 5, 7, 1, 16, 25, 487, 63};
        new HeapSort4().heapSort(arr);
        //new QuickSort7().quickSort(arr, 0, arr.length - 1);
        //new MergeSort5().mergeSort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int n : arr) {
            System.out.println(n);
        }
    }
}
