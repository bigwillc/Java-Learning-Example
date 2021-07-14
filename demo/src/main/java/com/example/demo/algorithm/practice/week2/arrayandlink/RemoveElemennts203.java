package com.example.demo.algorithm.practice.week2.arrayandlink;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import javax.swing.*;
import java.util.List;

/**
 * @author bigwillc
 **/
public class RemoveElemennts203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode h = new ListNode();
        ListNode t = h;
        ListNode p = head;
        while (p != null) {
            if (p.val != val) {
                ListNode node = new ListNode(p.val);
                t.next = node;
                t = t.next;
            }
            p = p.next;
        }
        return h.next;
    }

    // remove node to solve
    public ListNode removeElements2(ListNode head, int val) {
        ListNode h = new ListNode();
        h.next = head;
        ListNode pre = h, cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return h.next;
    }

    public static void testListNode() {
        ListNode head = new ListNode();
        ListNode tail = head;
        for (int i = 0; i < 10; i++) {
            ListNode node = new ListNode(i);
            tail.next = node;
            tail = tail.next;
        }
        /*while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }*/
        System.out.println("-------验证对象和引用------");
        ListNode p = head.next; //0
        p = p.next.next; //2
        System.out.println(p.val);
        System.out.println(head.next.val);
        // 测试结果是，声明对象只是相当于申请的新游标，并不会影响原数据的指向;
    }

    public static void main(String[] args) {
        testListNode();
    }

}
