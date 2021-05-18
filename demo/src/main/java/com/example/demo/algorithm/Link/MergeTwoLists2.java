package com.example.demo.algorithm.Link;

/**
 * @author bigwillc
 **/
public class MergeTwoLists2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode();
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            ListNode p;
            if (l1.val <= l2.val) {
                p = l1;
                l1 = l1.next;
            } else {
                p = l2;
                l2 = l2.next;
            }
            cur.next = p;
            cur = cur.next;
        }
        while (l1 != null) {
            ListNode p = l1;
            l1 = l1.next;
            cur.next = p;
            cur = cur.next;
        }
        while (l2 != null) {
            ListNode p = l2;
            l2 = l2.next;
            cur.next = p;
            cur = cur.next;
        }
        return head.next;
    }
}
