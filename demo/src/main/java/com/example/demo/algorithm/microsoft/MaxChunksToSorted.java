package com.example.demo.algorithm.microsoft;

public class MaxChunksToSorted {

    public int maxChunksToSorted(int[] arr) {
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            max = max < arr[i] ? arr[i] : max;
            if(arr[i] == max) count++;
        }
        return count;
    }


}
