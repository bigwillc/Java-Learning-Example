package com.example.demo.algorithm.Link;

/**
 * @author bigwillc
 **/
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        if (head.next == null){
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }
        ListNode fast = head, slow = head;
        ListNode p = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return fast.next == null ? slow : slow.next;
    }
}
