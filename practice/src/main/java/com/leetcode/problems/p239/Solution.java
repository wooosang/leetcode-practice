package com.leetcode.problems.p239;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 239. Sliding Window Maximum
 * @Author: woosang
 * @Date: 2021-03-19 9:37 PM
 * @Version: 1.0
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 *
 * Return the max sliding window.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 * Example 3:
 *
 * Input: nums = [1,-1], k = 1
 * Output: [1,-1]
 * Example 4:
 *
 * Input: nums = [9,11], k = 2
 * Output: [11]
 * Example 5:
 *
 * Input: nums = [4,-2], k = 2
 * Output: [4]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * 1 <= k <= nums.length
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length < k || nums.length < 2)
            return nums;
        int max = 0;
        List<Integer> result = new ArrayList<Integer>();
        java.util.Deque<Integer> frame_queue = new LinkedList<Integer>();
        for(int i = 0; i < nums.length; i++){
            while (!frame_queue.isEmpty() && nums[frame_queue.peekLast()] < nums[i]){
                frame_queue.pollLast();
            }
            frame_queue.addLast(i);
            if(frame_queue.peek() <= i-k) {
                frame_queue.poll();
            }
            if(i+1>=k){
                result.add(nums[frame_queue.peek()]);
            }

        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
