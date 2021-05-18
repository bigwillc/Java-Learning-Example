package com.example.demo.algorithm.Link;

/**
 * @author bigwillc
 **/
public class RemoveNthFromEnd2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        int len = 0;
        ListNode h = head;
        while (h != null) {
            len++;
            h = h.next;
        }
        int index = len - n;
        h = head;
        for (int i = 0; i < index - 1; i++) {
            h = h.next;
        }
        h.next = h.next.next;
        return head;
    }
}
