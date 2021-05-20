package com.example.demo.algorithm.practice.week1;

/**
 * @author bigwillc
 **/
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || "".equals(s)) {
            return false;
        }
        String str = s.toLowerCase();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char lc;
            char rc;

            while (str.charAt(l) - 'a' < 0 || str.charAt(l) - 'a' >= 26) {
                if (l < s.length() - 1) {
                    return false;
                }
                l++;
            }
            lc = str.charAt(l++);
            while (str.charAt(r) - 'a' < 0 || str.charAt(r) - 'a' >= 26) {
                if (r > 0) {
                    return false;
                }
                r--;
            }
            rc = str.charAt(r--);
            if (lc != rc) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome ip = new IsPalindrome();
        System.out.println(ip.isPalindrome(".,"));
    }
}
