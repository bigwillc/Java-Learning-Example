package com.example.demo.algorithm.practice.week2.arrayandlink;

import java.util.List;

/**
 * @author bigwillc
 **/
public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = reverse(l1);
        ListNode p2 = reverse(l2);
        long n1 = convertToNum(p1);
        long n2 = convertToNum(p2);
        return null;
    }

    // reverse node
    public ListNode reverse(ListNode l1) {
        ListNode h = new ListNode();
        h.next = null;
        while (l1 != null) {
            ListNode cur = l1;
            l1 = l1.next;
            cur.next = h.next;
            h.next = cur;
        }
        return h.next;
    }

    // convert listNode to num
    public long convertToNum(ListNode node) {
        ListNode p = node;
        long n = 0;
        while (p != null) {
            n = n * 10 + p.val;
            p = p.next;
        }
        return n;
    }

    // convert num to ListNode
    public ListNode convertToListNode(long n) {
        ListNode head = new ListNode();
        head.next = null;
        ListNode cur = head;
        while (n != 0) {
            int temp = (int) (n % 10);
            ListNode node = new ListNode(temp);
            node.next = cur.next;
            cur.next = node;
            n = n / 10;
        }
        return head.next;
    }
}
