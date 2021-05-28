package com.example.demo.algorithm.practice.week1;

import java.util.Arrays;

/**
 * @author bigwillc
 **/
public class RemoveDuplicates {


    /*
    * 判断元素是否相等
    * 记录偏移量，移动
    * */
    public int removeDuplicates(int[] nums) {
        int offset = 0;
        for (int i = 0; i < nums.length - 1; ) {
            int index = i + 1;
             // 判断元素是否相等
            while (index < nums.length && nums[i] == nums[index]) {
                index++;
            }
            if (index < nums.length) {
                nums[offset++] = nums[index];
            }
            i = index;
        }
        return offset + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] temp = new int[]{1, 1};
        int len = rd.removeDuplicates(temp);
        for (int i = 0; i < len; i++) {
            System.out.println(temp[i]);
        }
    }
}
