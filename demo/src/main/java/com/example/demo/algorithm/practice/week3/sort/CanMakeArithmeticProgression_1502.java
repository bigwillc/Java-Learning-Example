package com.example.demo.algorithm.practice.week3.sort;

/**
 * @author bigwillc
 **/
public class CanMakeArithmeticProgression_1502 {

    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length <= 2) {
            return true;
        }
        quickSort(arr, 0, arr.length - 1);
        int dif = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != dif) {
                return false;
            }
        }
        return true;
    }

    public void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int index = partition(arr, l, r);
            quickSort(arr, l, index);
            quickSort(arr, index + 1, r);
        }
    }

    public int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int temp;
        int cur = l;
        for (int i = l; i < r; i++) {
            if (arr[i] > pivot) {
                temp = arr[i];
                arr[i] = arr[cur];
                arr[cur] = temp;
                cur++;
            }
        }
        temp = arr[cur];
        arr[cur] = pivot;
        arr[r] = temp;
        return cur;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 8, 5, 3, 4, 6, 9};
        CanMakeArithmeticProgression_1502 c = new CanMakeArithmeticProgression_1502();
        c.quickSort(nums, 0, nums.length - 1);
        c.print(nums);

    }

    public void print(int[] nums) {
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
