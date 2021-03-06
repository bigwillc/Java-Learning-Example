package com.example.demo.algorithm.lru_cache;

import javax.xml.soap.Node;
import java.util.HashMap;

public class LRUCache4 {

    // 淘汰掉最近最少使用的数据
    // 将最近访问的移至队列头部
    public class DLinkNode {
        int val;
        int key;
        DLinkNode pre;
        DLinkNode next;

        public DLinkNode() {

        }

        public DLinkNode(int key, int val) {
            this.key = key;
            this.val = val;
        }

    }

    int capacity;
    int count;
    DLinkNode head;
    DLinkNode tail;
    HashMap<Integer, DLinkNode> cache = new HashMap();

    public void moveToHead(DLinkNode node) {
        remove(node);
        addNode(node.key, node.val);
    }

    public void removeTail() {
        DLinkNode node = tail.pre;
        remove(node);
    }

    public void remove(DLinkNode node) {
        DLinkNode pre = node.pre;
        DLinkNode next = node.next;
        pre.next = node.next;
        next.pre = node.pre;
        cache.remove(node.key);
    }

    public void addNode(int key, int val) {
        DLinkNode node = new DLinkNode(key, val);
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
        cache.put(key, node);
    }

    public LRUCache4(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        head = new DLinkNode();
        tail = new DLinkNode();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        DLinkNode node = cache.get(key);
        if (node != null) {
            moveToHead(node);
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        DLinkNode node = new DLinkNode(key, value);
        if (cache.get(key) != null) {
            DLinkNode n = cache.get(key);
            n.val = value;
            moveToHead(n);
            cache.replace(key, n);
        } else {
            cache.put(key, node);
            addNode(key, value);
            count++;
            if (count > capacity) {
                removeTail();
                count--;
            }
        }
    }
}
