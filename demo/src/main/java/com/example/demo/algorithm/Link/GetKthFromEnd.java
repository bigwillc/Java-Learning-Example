package com.example.demo.algorithm.Link;

public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode h = head;
        int len = 0;
        while (h != null) {
            len++;
            h = h.next;
        }

        h = head;
        int index = len - k;
        for (int i = 0; i <= index; i++) {
            h = h.next;
        }
        return h;
    }
}
