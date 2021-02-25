package com.example.demo.algorithm.search;

/**
 * @author bigwillc
 **/
public class search {
    public void dfs() {
        /*
        * 1.终止条件
        * 2.访问节点
        * 3.左递归，右递归
        *
        * */

//        if node is visited
//                return;
//        visited.add(node);
//        dfs(node.left);
//        dfs(node.right);

//        if tree.root is true:
//            return []
//        visited, stack = [], [tree, root]
//        while stack:
//            node = stack.pop();
//            visited.add(node);
//
//            Process(node);
//            nodes = generate_related_nodes(node);
//            stack.push(nodes)
    }

    public void bfs() {

        /*
        * 使用一个队列
        * 每次如队的时候将这个节点能访问到的所有子节点如队
        * */
//        queue = []
//        queue.append([start])
//        visited.add(start);
//
//        while(queue):
//            node = queue.pop();
//            visited.add(node);
//
//            process(node);
//            nodes = generated_realted_nodes(node);
//            queue.push(nodes);
    }

}
