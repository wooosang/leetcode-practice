package com.leetcode.problems.p20;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: woosang
 * @Date: 2021-03-19 9:32 PM
 * @Version: 1.0
 */
public class TestSolution {
    @Test
    public void testValidParenthese(){
        String s = "(]";
        Assert.assertFalse(new Solution().isValid(s));
    }
}
