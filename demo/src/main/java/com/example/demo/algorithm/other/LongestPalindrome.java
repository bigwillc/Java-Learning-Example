package com.example.demo.algorithm.other;

public class LongestPalindrome {
    int lo = 0, maxLen = 0;

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            // 奇数
            extend(s, i, i);
            // 偶数
            extend(s, i, i+1);
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extend(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        int len = right - left + 1;
        if (len > maxLen) {
            maxLen = len;
            lo = left;
        }
    }
}
