package com.example.demo.algorithm.Link;

import javax.xml.soap.Node;

public class AddTwoNumbers3 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode p = head;
        ListNode p1 = l1;
        ListNode p2 = l2;

        int flag = 0;
        while (p1 != null && p2 != null) {
            int sum = p1.val + p2.val + flag;
            int temp = sum % 10;
            flag = addTwoNode(p, temp, sum);
            // 相加后向后移动一位
            p1 = p1.next;
            p2 = p2.next;
        }
        while (p1 != null) {
            int sum = p1.val + flag;
            int temp = sum % 10;
            flag = addTwoNode(p, temp, sum);
            p1 = p1.next;
        }
        while (p2 != null) {
            int sum = p2.val + flag;
            int temp = sum % 10;
            flag = addTwoNode(p, temp, sum);
            p2 = p2.next;
        }
        if (flag == 1) {
            ListNode node = new ListNode(flag);
            p.next = node;
            p = p.next;
        }
        return head.next;
    }

    public int addTwoNode(ListNode p, int temp, int sum) {
        ListNode node = new ListNode(temp);
        int flag = sum >= 10 ? 1 : 0;
        p.next = node;
        p = p.next;
        return flag;
    }


}
