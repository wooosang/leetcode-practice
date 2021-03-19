package com.leetcode.problems.p25;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: woosang
 * @Date: 2021-03-19 1:39 PM
 * @Version: 1.0
 */
public class TestSolution {
    @Test
    public void testReverseKGroup(){
        Integer[] testValues = new Integer[]{1,2,3,4,5};
        ListNode testListNode = generateListNode(testValues);
        ListNode actual = new Solution().reverseKGroup(testListNode,2);
        Integer[] expectValues = new Integer[]{2,1,4,3,5};
        ListNode expected = generateListNode(expectValues);
        Assert.assertEquals(getValues(expected),getValues(actual));
    }

    public ListNode generateListNode(Integer[] values){
        ArrayUtils.reverse(values);
        ListNode tail = null;
        ListNode cur = null;
        for(int value : values){
            cur = new ListNode(value,tail);
            tail = cur;
        }
        return cur;
    }

    private Integer[] getValues(ListNode listNode){
        List<Integer> values = new ArrayList<>();
        ListNode cur = listNode;
       while (cur!=null){
          values.add(cur.val);
          cur = cur.next;
       }
       return values.toArray(new Integer[values.size()]);
    }
}
