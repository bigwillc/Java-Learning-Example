package com.example.demo.algorithm.tree;

/**
 * @author bigwillc
 **/
public class MaxPathSum {

    /*
     * get maxGain
     * maxPathSum = left_maxGain + right_maxGain + root_Gain
     * travel all node, and save the maxPathSum
     * */
    int maxPathSum = 0;

    public int maxPathSum(TreeNode root) {
        if (root != null) {
            maxPathSum = Math.max(maxPathSum, maxPathSum(root.left));
            maxPathSum = Math.max(maxPathSum, maxPathSum(root.right));
            int sum = root.val;
            int leftSum = getMaxGain(root.left);
            int rightSum = getMaxGain(root.right);
            if (leftSum > 0) {
                sum = sum + leftSum;
            }
            if (rightSum > 0) {
                sum = sum + rightSum;
            }
            return Math.max(maxPathSum, sum);
        }
        return -99999;
    }

    public int getMaxGain(TreeNode root) {
        if (root != null) {
            int maxGain = root.val;
            int leftMaxGain = getMaxGain(root.left);
            int rightMaxGain = getMaxGain(root.right);
            maxGain += Math.max(leftMaxGain, rightMaxGain);
            return Math.max(root.val, maxGain);
        }
        return 0;
    }
}
