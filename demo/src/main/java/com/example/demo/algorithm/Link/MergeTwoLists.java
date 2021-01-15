package com.example.demo.algorithm.Link;

/*
* Merge two sorted linked lists and return it as a sorted list.
* The list should be made by splicing together the nodes of the first two lists.
 * */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2 == null) {
            return l1;
        }
        if (l1 == null) {
            return l2;
        }

        ListNode head = new ListNode();
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null && p2 != null) {
            ListNode node = new ListNode();
            if (p1.val <= p2.val) {
                node = p1;
                p1 = p1.next;
            } else {
                node = p2;
                p2 = p2.next;
            }
        }

        while (p1 != null) {
            head.next = p2;
        }

        while (p2 != null) {
            head.next = p1;
        }
        return head;
    }
}
