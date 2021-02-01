package com.example.demo.algorithm.str;

public class LongestPalindrome {

    public static void main(String[] args) {
        String res = longestPalindrome("bb");
        System.out.println(res);
    }

    public static String longestPalindrome(String s) {
        /*
        * 暴力解法
        * 遍历
        * 判断回文
        * 返回最长回文子串
        * */

        if (s.length() <= 1) {
            return s;
        }
        int max = 0;
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s.substring(i, j+1))) {
                    if (max < (j - i + 1)) {
                        max = (j - i + 1);
                        res = s.substring(i, j + 1);
                    }
                }
            }
        }
        return res;
    }

    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
}
