package com.example.demo.algorithm.practice.week4;

/**
 * @author bigwillc
 **/
public class NextGreatestLetter_744 {

    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        int low = 0;
        int high = len - 1;
        int mid = low + (high - low) / 2;
        // 判断target是否在数组里面
        if (target - letters[len - 1] >= 0 || target - letters[0] < 0) {
            return letters[0];
        }
        while (low <= high) {
            if (target - letters[mid] > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = low + (high - low) / 2;
        }
        if (letters[mid] - target > 0) {
            while (mid > 0 && letters[mid] == letters[mid - 1]) {
                mid--;
            }
            return letters[mid];
        } else {
            while (mid + 1 < len && letters[mid + 1] == letters[mid]) {
                mid++;
            }
            return letters[mid + 1];
        }
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'e','e','e','k','q','q','q','v','v','y'};
        NextGreatestLetter_744 ngl = new NextGreatestLetter_744();
        System.out.println(ngl.nextGreatestLetter(arr, 'q'));

    }
}
