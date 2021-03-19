package com.leetcode.problems.p20;

import java.util.HashMap;
import java.util.Map;

/**
 * 20. Valid Parentheses
 * @Author: woosang
 * @Date: 2021-03-19 9:02 PM
 * @Version: 1.0
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 */
public class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> pairs = new HashMap<Character, Character>();
        pairs.put(')','(');
        pairs.put('}','{');
        pairs.put(']','[');
        char[] chars = s.toCharArray();
        java.util.Stack<Character> symbols = new java.util.Stack<Character>();
        for(Character symbol : chars){
            Character pair_symbol = pairs.get(symbol);
            if(pair_symbol == null){//不是右括号，直接压栈
                symbols.push(symbol);
            }else {//是右括号，查看栈顶是否不为空，且匹配
                if(symbols.isEmpty()){
                    return false;
                }
                Character last_symbol = symbols.peek();
                if(last_symbol.charValue() == pair_symbol.charValue()){
                    symbols.pop();
                }else{
                    return false;
                }
            }
        }
        if(!symbols.isEmpty()){
            return false;
        }else {
            return true;
        }
    }
}
