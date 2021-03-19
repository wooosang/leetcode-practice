package com.leetcode.problems.p25;

/**
 * @Author: woosang
 * @Date: 2021-03-19 1:38 PM
 * @Version: 1.0
 *
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 *
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 *
 * Follow up:
 *
 * Could you solve the problem in O(1) extra memory space?
 * You may not alter the values in the list's nodes, only nodes itself may be changed.
 *
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [2,1,4,3,5]
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)
            return head;
        ListNode cur = head;
        for(int i=0;i<k;i++){
            if(cur == null)
                return head;
            else
                cur = cur.next;
        }

        ListNode pre,next;
        if(cur==null)
            pre = null;
        else
            pre = reverseKGroup(cur,k);
        cur = head;
        int n=k;
        while(n-->0){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
