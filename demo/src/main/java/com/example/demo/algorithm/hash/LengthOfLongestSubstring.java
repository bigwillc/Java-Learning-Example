package com.example.demo.algorithm.hash;

import java.util.HashSet;

/**
 * @author bigwillc
 **/
public class LengthOfLongestSubstring {

    /*
    * 1. 遍历
    * 2. 使用hashset来判重
    * 3. 记录最大值
    * */

    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int counter = 1;
            HashSet hashSet = new HashSet();
            hashSet.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (hashSet.contains(s.charAt(j))) {
                    break;
                } else {
                    hashSet.add(s.charAt(j));
                    counter++;
                }
            }
            max = Math.max(max, counter);
        }
        return max;
    }
}
