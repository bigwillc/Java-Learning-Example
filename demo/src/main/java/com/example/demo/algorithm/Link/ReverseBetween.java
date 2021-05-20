package com.example.demo.algorithm.Link;

import java.util.List;

public class ReverseBetween {
    /**
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }
        if (left == right) {
            return head;
        }
        ListNode headNode = new ListNode();
        headNode.next = head;
        ListNode preNode = headNode;
        ListNode rightNode = headNode;
        for (int i = 0; i < left - 1; i++) {
            preNode = preNode.next;
        }
        for (int i = 0; i < right ; i++) {
            rightNode = rightNode.next;
        }
        ListNode leftNode = preNode.next;
        ListNode nextNode = rightNode.next;
        rightNode.next = null;
        ListNode between = reverse(preNode.next);
        preNode.next = between;
        leftNode.next = nextNode;
        return headNode.next;
    }

    public ListNode reverse(ListNode list) {
        ListNode head = new ListNode();
        ListNode pre = head;
        ListNode cur = pre.next;
        while (list != null) {
            ListNode p = list;
            list = list.next;
            pre.next = p;
            p.next = cur;
            cur = p;
        }
        return head.next;
    }
}
