package com.example.demo.algorithm.practice.week3.recurision;

/**
 * @author bigwillc
 **/
public class Merge_1001 {
    public void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1, j = n - 1;
        int len = m + n -1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[len--] = A[i--];
            } else {
                A[len--] = B[j--];
            }
        }
        while (j >= 0) {
            A[len--] = B[j--];
        }
    }
}
