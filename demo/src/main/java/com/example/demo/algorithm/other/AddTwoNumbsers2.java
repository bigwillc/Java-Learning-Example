package com.example.demo.algorithm.other;

import java.util.List;

/**
 * @author bigwillc
 **/
public class AddTwoNumbsers2 {

    public static class ListNode{
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next  = next;
        }
    }

    // 1. convert reverted link to number
    // 2. add two number
    // 3. convert the number to a reverted link

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long n1 = convertRevertedLinkToNum(l1);
        long n2 = convertRevertedLinkToNum(l2);
        long sum = n1 + n2;
        ListNode res = convertNumToRevertedLink(sum);
        return res;
    }

    public static long convertRevertedLinkToNum(ListNode listNode) {
        ListNode p = listNode;
        long multiple = 1;
        long res = 0;
        while (p != null) {
            res = p.val * multiple + res;
            multiple *= 10;
            p = p.next;
        }
        return res;
    }

    public static ListNode convertNumToRevertedLink(long num) {
        if(num == 0) return new ListNode(0);
        ListNode p = new ListNode();
        ListNode head = p;
        while (num > 0) {
            int temp = (int) (num % 10);
            num = num / 10;
            ListNode node = new ListNode(temp);
            p.next = node;
            p = p.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{9};
        int[] nums2 = new int[]{1,9,9,9,9,9,9,9,9,9};
        ListNode l1 = convertArrayToLink(nums1);
        ListNode l2 = convertArrayToLink(nums2);
        ListNode res = addTwoNumbers(l1, l2);
        //System.out.println(res);
        printLink(res);
    }

    public static ListNode convertArrayToLink(int[] num) {
        ListNode p = new ListNode();
        ListNode head = p;
        for (int i = 0; i < num.length; i++) {
            ListNode node = new ListNode(num[i]);
            p.next = node;
            p = p.next;
        }
        return head.next;
    }

    public static void printLink(ListNode l) {
        while (l.next != null) {
            System.out.print(l.val);
            System.out.print("->");
        }
    }
}
