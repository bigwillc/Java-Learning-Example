package com.example.demo.algorithm.Link;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        int len = 0;
        ListNode h = head;
        while (h != null) {
            len++;
            h = h.next;
        }

        int preIndex = len - n - 1;
        if(preIndex < 0) return head.next;
        ListNode cur = head;
        for (int i = 1; i <= preIndex; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        ListNode head = ConvertListNode.convertListNode(nums);
        removeNthFromEnd(head, 2);
    }
}
