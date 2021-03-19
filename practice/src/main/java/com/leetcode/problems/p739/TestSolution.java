package com.leetcode.problems.p739;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: woosang
 * @Date: 2021-03-19 1:38 PM
 * @Version: 1.0
 */
public class TestSolution {

    @Test
    public void testDailyTemperaturesProblem(){
        int[] temps = new int[]{73,74,75,71,69,72,76,73};
        int[] expects = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        int[] result = new Solution().dailyTemperatures(temps);
        Assert.assertArrayEquals(expects,result);
    }

}
