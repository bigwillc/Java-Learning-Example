package com.example.demo.algorithm.practice.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bigwillc
 **/
public class LengthOfLastWord {

    /*
    * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。

    单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。

     

    示例 1：

    输入：s = "Hello World"
    输出：5
    示例 2：

    输入：s = " "
    输出：0
    * */

    public int lengthOfLastWord(String s) {
        // 单词分割
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < s.length(); ) {
            StringBuilder temp = new StringBuilder();
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            while (i < s.length() && s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
                i++;
            }
            i++;
            if (temp.length() > 0) {
                strList.add(temp.toString());
            }
        }
        if (strList.size() == 0) {
            return 0;
        } else {
            return strList.get(strList.size() - 1).length();
        }

    }
}
