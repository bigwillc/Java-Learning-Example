package com.example.demo.algorithm.Link;

import java.util.List;

public class ReorderList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void reorderList(ListNode head) {
        // 找中点
        // 左右链表
        // 合并两个链表
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (slow.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse
        ListNode r = slow.next;
        slow.next = null;
        ListNode l1 = new ListNode();
        while (r != null) {
            ListNode p = r;
            r = r.next;
            p.next = l1.next;
            l1.next = p;
        }

        ListNode newHead = head;
        while (l1.next != null) {
            ListNode node = l1.next;
            l1 = l1.next;
            ListNode temp = head.next;
            head = head.next;
            newHead.next = node;
            node.next = temp;
        }
    }
}
