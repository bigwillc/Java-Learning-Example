package com.example.demo.algorithm.lru_cache;

import java.util.HashMap;
import java.util.HashSet;

public class LRUCache3 {

    class DLinkNode {
        int key;
        int value;
        DLinkNode pre;
        DLinkNode next;

        DLinkNode() {

        }

        DLinkNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    /*
     * 1. 使用一个双端队列缓存最常访问的下标
     * 2. 使用一个hashmap缓存数据
     * 3. 实现下标的LRU策略
     * 4. 实现LRUCache的查找和插入
     * */
    int size = 0;
    int capacity = 0;
    DLinkNode head = new DLinkNode();
    DLinkNode tail = new DLinkNode();
    HashMap<Integer, DLinkNode> cache = new HashMap<>();

    private void addNode(int key, int value) {
        DLinkNode node = new DLinkNode(key, value);
        head.next.pre = node;
        node.next = head.next;
        head.next = node;
        node.pre = head;
    }

    private void removeNode(DLinkNode node) {
        node.next.pre = node.pre;
        node.pre.next = node.next;
    }

    private void removeTail() {
        DLinkNode node = tail.pre;
        removeNode(node);
    }

    private void moveToHead(DLinkNode node) {
        node.next = head.next;
        head.next.pre = node;
        node.pre = head;
        head.next = node;
    }

    public LRUCache3(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head.next = tail;
        head.pre = null;
        tail.next = null;
        tail.pre = head;
    }

    public int get(int key) {
        DLinkNode node = cache.get(key);
        if (node != null) {
            moveToHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        DLinkNode node = cache.get(key);
        if (node != null) {
            if (node.value == value) {
                moveToHead(node);
            } else {
                node.value = value;
                moveToHead(node);
            }
        } else {
            addNode(key, value);
            cache.put(key, new DLinkNode(key, value));
            size++;
            if (size > capacity) {
                removeTail();
            }
        }
    }


}
