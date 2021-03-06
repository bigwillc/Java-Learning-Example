package com.example.demo.algorithm.Link;

import com.example.demo.algorithm.sort.HeapSort;

import java.util.List;

public class ReorderList2 {
    public void reorderList(ListNode head) {
        // 找中点
        // 左右链表
        // 反转右链表
        // 合并链表
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        ListNode l1 = head;
        ListNode l2 = slowNode.next;
        slowNode.next = null;
        l2 = revert(l2);

        while (l1 != null && l2 != null) {

        }





    }

    public ListNode revert(ListNode l) {
        ListNode h = new ListNode();
        while (l != null) {
            ListNode p = l;
            p.next = h.next;
            h.next = p;
            l = l.next;
        }
        return h.next;
    }
}
