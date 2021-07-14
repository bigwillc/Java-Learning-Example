package com.example.demo.algorithm.practice.week2.arrayandlink;

/**
 * @author bigwillc
 **/
public class MiddleNode876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
