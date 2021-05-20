package com.example.demo.algorithm.other;

public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double res = findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 合并数组
        // 求中位数
        int len = nums1.length + nums2.length;
        int[] arr = new int[len];
        int k = 0;
        int i = 0, j = 0;
        while(i < nums1.length && j< nums2.length){
            arr[k++] = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++];
        }
        while(i<nums1.length){
            arr[k++] = nums1[i++];
        }
        while(j < nums2.length){
            arr[k++] = nums2[j++];
        }

        int mid = 0;
        double l, r;
        if(len%2 == 1){
            mid = len/2;
            return arr[mid];
        }else{
            mid = len/2;
            l = arr[mid-1];
            r = arr[mid];
            return (l + r) / 2;
        }

    }

}
