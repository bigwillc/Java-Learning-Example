package com.example.demo.algorithm.practice.week1;

/**
 * @author bigwillc
 **/
public class ReplaceSpace {

    /*

    请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

     

    示例 1：

    输入：s = "We are happy."
    输出："We%20are%20happy."
     

    限制：

    0 <= s 的长度 <= 10000

     */

    public String replaceSpace(String s) {
        return replace(s, ' ', "%20");
    }

    public String replace(String s, char c, String replaceStr) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                res.append(replaceStr);
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
