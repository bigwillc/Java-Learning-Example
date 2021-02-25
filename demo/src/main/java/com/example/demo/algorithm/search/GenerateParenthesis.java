package com.example.demo.algorithm.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bigwillc
 **/
public class GenerateParenthesis {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate(0,0,"", n);
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
