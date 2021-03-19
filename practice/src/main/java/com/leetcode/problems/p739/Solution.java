package com.leetcode.problems.p739;

/**
 * @Author: woosang
 * @Date: 2021-03-19
 *
 * 739. Daily Temperatures
 * Medium
 *
 * Add to List
 *
 * Share
 * Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.
 *
 * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 *
 * Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].
 */
public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        java.util.Stack<Integer> s = new java.util.Stack<Integer>();
        for(int i=0;i<T.length;i++){
            while(!s.empty() && T[s.peek()]<T[i]){
                int pre = s.pop();
                result[pre]=(i-pre);
            }
            s.push(i);

        }
        if(!s.empty()){
            int cur = s.pop();
            result[cur]=0;
        }
        return result;
    }
}
