package com.example.demo.algorithm.str;

import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        int res = lengthOfLongestSubstring(" ");
        System.out.println(res);
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        // 使用hash表存已探测的字段
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            int curSize = 0;
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    curSize++;
                    Math.max(max, curSize);
                } else {
                    max = Math.max(max, curSize);
                    break;
                }
            }
        }
        return max;
    }
}
