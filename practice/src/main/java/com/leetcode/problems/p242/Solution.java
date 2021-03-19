package com.leetcode.problems.p242;

/**
 * @Author: woosang
 * @Date: 2021-03-19 8:54 PM
 * @Version: 1.0
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        byte[] sb = s.getBytes();
        for(byte b : sb){
            int index = b-'a';
            alphabet[index]++;
        }
        byte[] tb = t.getBytes();
        for(byte b : tb){
            int index = b-'a';
            alphabet[index]--;
        }
        for(int v : alphabet){
            if(v != 0){
                return false;
            }
        }
        return true;
    }
}
