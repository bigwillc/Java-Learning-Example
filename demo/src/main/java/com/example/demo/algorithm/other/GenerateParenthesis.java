package com.example.demo.algorithm.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bigwillc
 **/
public class GenerateParenthesis {

    static List<String> res;

    public static List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        generate(0, 0, "", n);
        return res;
    }


    public static void generate(int left, int right, String s, int n) {
        if (left == n && right == n) {
            res.add(s);
        }

        if (left < n) {
            generate(left + 1, right, s + '(', n);
        }

        if (right < left) {
            generate(left, right + 1, s + ')', n);
        }
    }
}
