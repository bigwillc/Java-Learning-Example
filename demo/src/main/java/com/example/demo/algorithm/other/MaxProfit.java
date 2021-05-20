package com.example.demo.algorithm.other;

public class MaxProfit {

    public static int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        if (prices.length == 2) {
            int compare = prices[1] - prices[0];
            return compare > 0 ? compare : 0;
        }
        int minPrice = prices[0] < prices[1] ? prices[0] : prices[1];
        int maxProfit = prices[1] - prices[0] > 0 ? prices[1] - prices[0] : 0;
        for (int i = 2; i < prices.length; i++) {
            int temp = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));

    }
}
