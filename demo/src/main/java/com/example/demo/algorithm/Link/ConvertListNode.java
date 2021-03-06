package com.example.demo.algorithm.Link;

public class ConvertListNode {

    public static ListNode convertListNode(int[] nums) {
        ListNode head = new ListNode();
        ListNode cur = head;
        for (int i = 0; i < nums.length; i++) {
            ListNode node = new ListNode(nums[i]);
            cur.next = node;
            cur = cur.next;
        }
        return head.next;
    }
}
