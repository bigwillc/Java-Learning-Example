package com.example.demo.algorithm.str;

public class AddStr2 {

    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder("");
        int i = num1.length() - 1, j = num2.length() - 1;
        int flag = 0;
        while (i >= 0 || j >= 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int temp = n1 + n2 + flag;
            res.append(temp % 10);
            flag = temp / 10;
            i--;
            j--;
        }

        if(flag == 1) res.append(1);
        return res.reverse().toString();
    }
}
