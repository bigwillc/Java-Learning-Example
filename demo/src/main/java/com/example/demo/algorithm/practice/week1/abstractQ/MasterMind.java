package com.example.demo.algorithm.practice.week1.abstractQ;

import javax.sound.midi.Soundbank;

/**
 * @author bigwillc
 **/
public class MasterMind {


    // 错误，还没写出来；
    public int[] masterMind(String solution, String guess) {
        int m = 0, n = 0;
        // 猜中
        for (int i = 0; i < 4; i++) {
            if (solution.charAt(i) == guess.charAt(i)) {
                m++;
            }
        }
        // 伪猜中
        // 会有重复出现的现象，需要补偿
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (solution.charAt(i) == guess.charAt(j) && i != j) {
                    n++;
                    break;
                }
            }
        }
        return new int[]{m, n};
    }
}
