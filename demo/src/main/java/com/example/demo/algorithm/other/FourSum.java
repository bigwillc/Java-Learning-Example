package com.example.demo.algorithm.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bigwillc
 **/
public class FourSum {

    /*
    * using four point move to get the result
    * travels
    * */
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        //int a = 0, b = a + 1, c = b + 1, d = nums.length - 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 4; i++) {
            int a = i, b = a + 1, c = b + 1, d = nums.length - 1;
            int tempSum = nums[i] + nums[b] + nums[c] + nums[d];

//            if (tempSum == target) {
//                addTemp(temp, nums, i, b, c, d);
//            }
            while (c < d) {
                if (tempSum < target) {
                    tempSum = nums[i] + nums[b] + nums[++c] + nums[d];
                } else if (tempSum > target) {
                    tempSum = nums[i] + nums[b] + nums[c] + nums[--d];
                } else {
                    List<Integer> temp = new ArrayList<>();
                    addTemp(temp, nums, i, b, c, d);
                    res.add(temp);
                    while (nums[c] == nums[c + 1]) {
                        List<Integer> newTemp = new ArrayList<>();
                        addTemp(newTemp, nums, i, b, ++c, d);
                    }
                    break;
                }
            }
            if (c == d) {
                while (b < c) {
                    if (tempSum < target) {
                        tempSum = nums[i] + nums[++b] + nums[c] + nums[d];
                    } else if (tempSum > target) {
                        tempSum = nums[i] = nums[b] + nums[--c] + nums[d];
                    } else {
                        List<Integer> temp = new ArrayList<>();
                        addTemp(temp, nums, i, b, c, d);
                        res.add(temp);
                        while (nums[b] == nums[b + 1]) {
                            List<Integer> newTemp = new ArrayList<>();
                            addTemp(newTemp, nums, i, ++b, c, d);
                        }
                        break;
                    }
                }
            }

        }
        return res;
    }

    public void addTemp(List<Integer> temp, int[] nums, int a, int b, int c, int d) {
        temp.add(nums[a]);
        temp.add(nums[b]);
        temp.add(nums[c]);
        temp.add(nums[d]);
    }

    public static void main(String[] args) {
        FourSum f = new FourSum();
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        f.fourSum(nums, 0);

    }
}
