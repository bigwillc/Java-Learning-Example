package com.example.demo.algorithm.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bigwillc
 **/
public class GenerateParenthesis2 {

    List<String> res;

    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        generate(0, 0, "", n);
        return res;
    }


    public void generate(int left, int right, String s, int n) {
        if (left == n && right == n) {
            res.add(s);
        }

        if (left < n) {
            generate(left + 1, right, s + '(', n);
        }
        if (left > right) {
            generate(left, right + 1, s + ')', n);
        }
    }
}
