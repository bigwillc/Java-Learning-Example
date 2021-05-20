package com.example.demo.algorithm.search;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        int flag = 1;
        while (!queue.isEmpty()) {
            Deque<Integer> temp = new ArrayDeque<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (flag == 0) {
                    temp.addLast(node.val);
                } else {
                    temp.addFirst(node.val);
                }
                temp.add(node.val);
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
            res.add(new ArrayList<>(temp));
            flag = (flag + 1) % 2;
        }
        return res;
    }



}
