package com.example.demo.algorithm.other;

/**
 * @author bigwillc
 **/
public class ArraySort {

    static int sum = 0;

    public static void print(int[] arr, int len) {
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];
        }
        System.out.println("{" + temp + "}");
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void permutation(int arr[], int len, int index) {

        if (index == len) {
            ++sum;
            print(arr, len);
        } else {
            for (int i = index; i < len; ++i) {
                swap(arr, index, i);

                permutation(arr, len, index + 1);
                swap(arr, index, i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, 3, 0);

    }
}
