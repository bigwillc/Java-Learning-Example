package com.example.demo.algorithm.str;

import java.util.HashSet;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> hashSet = new HashSet<>();
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                if (hashSet.contains(s.charAt(j))) {
                    break;
                } else {
                    hashSet.add(s.charAt(j));
                    count++;
                }
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}
