package com.example.demo.algorithm.search;

import java.util.*;

public class ZigzagLevelOrder2 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        boolean flag = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (flag) {
                    deque.addLast(node.val);
                } else {
                    deque.addFirst(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            flag = !flag;
            res.add(new ArrayList<>(deque));
        }
        return res;
    }
}
