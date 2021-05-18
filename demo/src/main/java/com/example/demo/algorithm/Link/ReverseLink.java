package com.example.demo.algorithm.Link;

/**
 * @author bigwillc
 **/
public class ReverseLink {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        ListNode h = new ListNode();
        while (p != null) {
            ListNode q = p;
            p = p.next;
            q.next = h.next;
            h.next = q;
        }
        return h.next;
    }
}
