package com.example.demo.algorithm.Link;

import java.util.ArrayList;
import java.util.List;

public class ReverseKGroup {
    List<ListNode> tailArr = new ArrayList<>();

    public ListNode reverseKGroup(ListNode head, int k) {
        /*
        * 1.链表反转
        * 2.链表拆分
        * */
        if (head == null) {
            return head;
        }
        ListNode res = new ListNode();
        List<ListNode> arr = new ArrayList<>();
        ListNode h = head;
        int i = 0;
        int len = 0;
        while (h != null) {
            // 添加头结点
            if (i % k == 0) {
                arr.add(h);
            }
            // 断开结点
            if (i % k == k - 1) {
                ListNode node = h.next;
                h.next = null;
                h = node;
            } else {
                h = h.next;
            }
            i++;
            len++;
        }
        res.next = arr.get(0);
        // 反转
        for (int j = 0; j < arr.size() -1; j++) {
            reverse(arr.get(j));
        }
        // 连接
        for (int j = 0; j < tailArr.size() - 2; j++) {
            ListNode pre = tailArr.get(j);
            pre.next = arr.get(j + 1);
        }
        if (len % k == 0) {
            ListNode node = reverse(arr.get(arr.size() - 1));
            ListNode pre = tailArr.get(tailArr.size() - 2);
            pre.next = node;
        } else {
            ListNode node = arr.get(arr.size() - 1);
            ListNode pre = tailArr.get(tailArr.size() - 2);
            pre.next = node;
        }
        return res;
    }

    public ListNode reverse(ListNode listNode) {
        if (listNode != null) {
            tailArr.add(listNode);
        }
        ListNode head = new ListNode();
        while (listNode != null) {
            ListNode node = listNode;
            listNode = listNode.next;
            node.next = head.next;
            head.next = node;
        }
        return head.next;
    }
}
