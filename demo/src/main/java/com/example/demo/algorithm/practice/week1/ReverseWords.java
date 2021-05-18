package com.example.demo.algorithm.practice.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bigwillc
 **/
public class ReverseWords {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        List<String> temp = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        // 拆分
        for (int i = 0; i < arr.length;) {
            if (arr[i] == ' ') {
                while (arr[i] == ' ') {
                    i++;
                }
                if (!"".equals(str.toString())) {
                    temp.add(str.toString());
                    str = new StringBuilder();
                }
            } else {
                str.append(arr[i]);
                i++;
            }
        }
        if (!"".equals(str.toString())) {
            temp.add(str.toString());
        }

        // 反转
        int l = 0, r = temp.size() - 1;
        while (l < r) {
            String item = "";
            item = temp.get(l);
            temp.set(l, temp.get(r));
            temp.set(r, item);
            l++;
            r--;
        }

        // 组合结果
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < temp.size() - 1; i++) {
            res.append(temp.get(i));
            res.append(" ");
        }
        res.append(temp.get(temp.size() - 1));
        return res.toString();
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords("  hello world!  "));
    }
}
