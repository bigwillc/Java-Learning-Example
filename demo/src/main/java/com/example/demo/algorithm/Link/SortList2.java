package com.example.demo.algorithm.Link;

public class SortList2 {
    public ListNode sortList(ListNode head) {
        /*
        * Merge sort.
        * Divide the listnode into two list.
        * Merge those two sorted list.
        *
        * */

        // terminator
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(temp);
        ListNode res = merge(left, right);
        return res;
    }

    private ListNode merge(ListNode node1, ListNode node2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        while (node1 != null && node2 != null) {
            if (node1.val <= node2.val) {
                cur.next = node1;
                node1 = node1.next;
            } else {
                cur.next = node2;
                node2 = node2.next;
            }
            cur = cur.next;
        }
        cur.next = node1 != null ? node1 : node2;
        return head.next;
    }
}
