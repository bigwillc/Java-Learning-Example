package com.example.demo.algorithm.lru_cache;

import java.util.HashMap;

public class LRUCache5 {

    /*
    * realise LRU cache
    * 1. 使用hashmap 快速访问缓存元素
    * 2. 实现缓存的剔除策略
    * 3. 新增元素，放到对顶
    * 4. 刚访问的元素移动至队顶
    * 5. 队满时，删除尾部元素
    *
    * 数据结构选择
    * 双端队列 - 用来存储访问的序列
    * hash表 - 用来存储缓存元素
    *
    * */

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
    HashMap<Integer, DLinkNode> cache = new HashMap<>();
    DLinkNode head;
    DLinkNode tail;

    public LRUCache5(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        this.head = new DLinkNode();
        this.tail = new DLinkNode();
        head.next = tail;
        tail.pre = head;
    }

    public void moveToHead(int key) {
        DLinkNode node = cache.get(key);
        if (node != null) {
            removeNode(key);
            addNode(node.key, node.val);
        }
    }

    public void removeNode(int key) {
        DLinkNode node = cache.get(key);
        if (node != null) {
            DLinkNode p = node.pre;
            DLinkNode n = node.next;
            p.next = n;
            n.pre = p;
        }
    }

    public void addNode(int key, int val) {
        DLinkNode node = new DLinkNode(key, val);
        DLinkNode p = head.next;
        head.next = node;
        node.pre = head;
        p.pre = node;
        node.next = p;
    }

    public void removeTail() {
        if (count > 0) {
            DLinkNode pre = tail.pre.pre;
            pre.next = tail;
            tail.pre = pre;
        }
    }

    public int get(int key) {
        DLinkNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(key);
        return node.val;
    }

    public void put(int key, int val) {
        DLinkNode node = cache.get(key);
        if (node != null) {
            node.val = val;
            removeNode(key);
            addNode(key, val);
        } else {
            cache.put(key, new DLinkNode(key, val));
            addNode(key, val);
            if (count < capacity) {
                count++;
            } else {
                removeTail();
            }
        }
    }

}
