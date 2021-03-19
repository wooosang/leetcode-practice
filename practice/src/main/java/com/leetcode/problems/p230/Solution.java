package com.leetcode.problems.p230;

import java.util.Stack;

/**
 * @Author: woosang
 * @Date: 2021-03-19 11:15 PM
 * @Version: 1.0
 * Given the root of a binary search tree, and an integer k, return the kth (1-indexed) smallest element in the tree.
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 * Output: 3
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is n.
 * 1 <= k <= n <= 104
 * 0 <= Node.val <= 104
 *
 *
 * Follow up: If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the kth smallest frequently, how would you optimize?
 */
public class Solution {

    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return -1;
        TreeNode current_node = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(true){
            while (current_node != null){
                stack.add(current_node);
                current_node = current_node.left;
            }
            current_node = stack.pop();
            if(--k <= 0) return current_node.val;
            current_node = current_node.right;
        }
    }
}
