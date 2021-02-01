package com.example.demo.algorithm.other;

import java.util.HashMap;

public class TwoSum {

    public static int[] TwoSum(int[] sum, int target) {
        int[] res = new int[2];
//        // 暴力解法
//        for (int i = 0; i < sum.length; i++) {
//            for (int j = i + 1; j < sum.length; j++) {
//                if (sum[i] + sum[j] == target) {
//                    res[0] = i;
//                    res[1] = j;
//                    return res;
//                }
//            }
//        }
//        return res;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < sum.length; i++) {
            hashMap.put(sum[i], i);
        }

        for (int i = 0; i < sum.length; i++) {
            int temp = target - sum[i];
            if (hashMap.containsKey(temp) && i != hashMap.get(temp)) {
                res[0] = i;
                res[1] = hashMap.get(temp);
                return res;
            }
        }
        return res;
    }
}
