package com.example.demo.algorithm.other;

/**
 * @author bigwillc
 **/
public class IsPalindrome {

    public static boolean isPalindrome(int x) {
        if (x == 0 || x / 10 == 0) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }

        int temp = 0;
        while (temp < x/10) {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }
        return x == temp || x / 10 == temp;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
