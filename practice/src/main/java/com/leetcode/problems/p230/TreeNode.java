package com.leetcode.problems.p230;

/**
 * @Author: woosang
 * @Date: 2021-03-19 11:14 PM
 * @Version: 1.0
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
