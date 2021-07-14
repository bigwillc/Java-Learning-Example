package com.example.demo.algorithm.practice.week4;

/**
 * @author bigwillc
 **/
public class FindString {
    public int findString(String[] words, String s) {
        int low = 0;
        int high = words.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            while (mid > low && words[mid].equals("")) {
                mid--;
            }
            if (words[mid].compareTo(s) == 0) {
                return mid;
            }
            if (words[mid].compareTo(s) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        System.out.println(s1.compareTo(s2));
    }
}
