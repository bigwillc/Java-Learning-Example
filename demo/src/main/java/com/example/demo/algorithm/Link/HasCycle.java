package com.example.demo.algorithm.Link;

import java.util.HashSet;

/**
 * @author bigwillc
 **/
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode h = head;
        hashSet.add(h);
        h = h.next;
        while (h != null) {
            if (hashSet.contains(h)) {
                return false;
            }
            hashSet.add(h);
            h = h.next;
        }
        return true;
    }
}
