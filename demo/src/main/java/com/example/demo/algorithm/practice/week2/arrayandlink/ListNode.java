package com.example.demo.algorithm.practice.week2.arrayandlink;

import java.util.List;

/**
 * @author bigwillc
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }
}
