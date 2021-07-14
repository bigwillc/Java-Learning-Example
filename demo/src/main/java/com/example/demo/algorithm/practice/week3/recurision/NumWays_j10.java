package com.example.demo.algorithm.practice.week3.recurision;

/**
 * @author bigwillc
 **/
public class NumWays_j10 {
    public int numWays(int n) {
        if(n == 0) return 1;
        if(n <= 2) return n;
        /*int[] nums = new int[n+1];
        nums[1] = 1;
        nums[2] = 2;
        for(int i = 3; i <= n; i++){
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];*/
        return numWays(n - 1) + numWays(n - 2);
    }

    public int numWays2(int n) {
        if(n == 0) return 1;
        if(n <= 2) return n;
        int[] nums = new int[n+1];
        nums[1] = 1;
        nums[2] = 2;
        for(int i = 3; i <= n; i++){
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }

    public static void main(String[] args) {
        NumWays_j10 numWays_j10 = new NumWays_j10();
        System.out.println(numWays_j10.numWays(44));
        System.out.println(numWays_j10.numWays2(44));
    }
    //134903163
}
