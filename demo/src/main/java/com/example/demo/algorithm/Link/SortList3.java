package com.example.demo.algorithm.Link;

public class SortList3 {
    public ListNode sortList(ListNode head) {
        /*
        * Using merge sort to achieve this function
        * Divide the list into tow part
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
        ListNode term = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        ListNode res = merge(left, right);
        return res;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode head = new ListNode();
        ListNode cur = head;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                cur.next = left;
                left = left.next;
            } else {
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }
        cur.next = left != null ? left : right;
        return head.next;
    }
}
