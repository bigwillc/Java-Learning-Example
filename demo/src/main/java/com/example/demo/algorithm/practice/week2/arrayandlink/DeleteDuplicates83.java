package com.example.demo.algorithm.practice.week2.arrayandlink;

/**
 * @author bigwillc
 **/
public class DeleteDuplicates83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode h = head;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            ListNode node = cur.next;
            while (node != null && cur.val == node.val) {
                node = node.next;
            }
            cur.next = node;
            cur = cur.next;
        }
        return h;
    }
}
