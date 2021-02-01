package com.example.demo.algorithm.sort;

public class QuickSort2 {
//    public static void quickSort(int[] arr, int begin, int end) {
//        if (begin < end) {
//            return;
//        }
//        int pivot = partition(arr, begin, end);
//        quickSort(arr, begin, pivot - 1);
//        quickSort(arr, pivot + 1, end);
//    }
//
//    private static int partition(int[] arr, int begin, int end) {
//        int pivot = end, counter = begin;
//        for (int i = begin; i < end; i++) {
//            if (arr[i] < arr[pivot]) {
//                int temp = arr[counter];
//                arr[counter] = arr[i];
//                arr[i] = temp;
//                counter++;
//            }
//        }
//        int temp = arr[pivot];
//        arr[pivot] = arr[counter];
//        arr[counter] = temp;
//        return counter;
//    }

    public static void QuickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int pivot = partition(arr, begin, end);
            QuickSort(arr, begin, pivot - 1);
            QuickSort(arr, pivot + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = end;
        int counter = begin;
        /*
        * 1. counter始终指向第一个大于arr[pivot]的下标
        * */
        for (int i = begin; i < end; i++) {
            if (arr[i] < arr[pivot]) {
                int temp = arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;
                counter++;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[counter];
        arr[counter] = temp;
        return counter;
    }
}
