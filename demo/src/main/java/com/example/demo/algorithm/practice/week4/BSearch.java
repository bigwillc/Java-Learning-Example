package com.example.demo.algorithm.practice.week4;

/**
 * @author bigwillc
 **/
public class BSearch {

    public int bSearch(int[] arr, int n, int value) {
        int low = 0;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        BSearch bs = new BSearch();
        System.out.println(bs.bSearch(arr, 9, 5));
    }
}
