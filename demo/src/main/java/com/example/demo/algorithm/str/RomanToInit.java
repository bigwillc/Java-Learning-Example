package com.example.demo.algorithm.str;

/**
 * @author bigwillc
 **/
public class RomanToInit {

    /*
    * How I know the operation is add or minus;
    *
    * */
    public int romanToInt(String s) {
        int res = 0;
        char[] arr = s.toCharArray();
        int i = 0;
        for (; i < arr.length - 1; ) {
            int tempPre = getValue(arr[i]);
            int tempCur = getValue(arr[i + 1]);
            if (tempPre < tempCur) {
                res = res + tempCur - tempPre;
                i = i + 2;
            } else {
                res = res + tempPre;
                i++;
            }
        }
        if (i == arr.length - 1) {
            res = res + getValue(arr[i]);
        }
        return res;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        RomanToInit r = new RomanToInit();
        int res = r.romanToInt("III");
        System.out.println(res);
    }
}
