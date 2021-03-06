package com.example.demo.algorithm.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

    public static List<String> res = new ArrayList<>();

    public static String[] permutation(String s) {
        char[] arr = s.toCharArray();
        perm(arr, 0);
        String[] result = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        for (String r : result) {
            System.out.println(r);
        }
        return result;
    }

    public static void perm(char[] arr, int p) {
        if (p == arr.length - 1) {
            //res.add(arr.toString());
            res.add(new String(arr));
        }
        for (int i = p; i < arr.length; i++) {
            if (i != p && arr[i] == arr[p]) {
                continue;
            }
            swap(arr, p, i);
            perm(arr, p + 1);
            swap(arr, p, i);
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        //char[] chars = new char[]{'a', 'b', 'c'};
        permutation("aaa");
    }
}
