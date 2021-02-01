package com.example.demo.algorithm.lru_cache;

import java.util.HashMap;

public class LRUCache2 {

    class DLinkedNode {
        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode next;

        DLinkedNode() {

        }

        DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 0;
    private int capacity;
    DLinkedNode tail;
    DLinkedNode head;
    private HashMap<Integer, DLinkedNode> cache = new HashMap<>();

    private void addNode(int key, int value) {
        DLinkedNode node = new DLinkedNode(key, value);
        head.next.pre = node;
        node.next = head.next;
        head.next = node;
        node.pre = head;
        cache.put(key, node);
    }

    private void removeNode(DLinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void removeTail() {
        DLinkedNode node = tail.pre;
        removeNode(node);
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addNode(node.key, node.value);
    }

    // 1.使用双端队列维护最近访问的列表
    // 2.使用hashmap 来维护缓存


    public LRUCache2(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            DLinkedNode newNode = new DLinkedNode(key, value);
            addNode(key, value);
            cache.put(key, newNode);
            size++;
            if (size > capacity) {
                removeTail();
            }

        } else {
            node.value = value;
            moveToHead(node);
        }
    }
}
