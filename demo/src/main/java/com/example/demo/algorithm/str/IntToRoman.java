package com.example.demo.algorithm.str;

/**
 * @author bigwillc
 **/
public class IntToRoman {
    /*
     * You have to make the convert rule.
     * The difficult is make this rule.
     * */

    int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = new String[]{"M", "CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        while (num > 0) {
            for (int i = 0; i < values.length; i++) {
                if (values[i] <= num) {
                    num = num - values[i];
                    res = res.append(symbols[i]);
                    break;
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        IntToRoman intToRoman = new IntToRoman();
        String res = intToRoman.intToRoman(4);
        System.out.println(res);
    }
}
