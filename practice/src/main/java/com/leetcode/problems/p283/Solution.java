package com.leetcode.problems.p283;

/**
 * @Author: woosang
 * @Date: 2021-03-20 11:19 PM
 * @Version: 1.0
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 */
public class Solution {
    public void moveZeroes(int[] nums){
        int i = 0, j = 0;
        int count = nums.length;
        while (count > 0) {
            if(nums[i] != 0){
                i++;
            }else if (nums[j] != 0 ) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            j++;
            count--;
        }
    }
}
