package online.judge.leetcode.string.validparenttheses;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

    }

}

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                char top = s.charAt(i);
                if (!stack.isEmpty()) {
                    if (top == ']') {
                        if (stack.pop() != '[') {
                            return false;
                        }
                    } else if (top == '}') {
                        if (stack.pop() != '{') {
                            return false;
                        }
                    } else if (top == ')') {
                        if (stack.pop() != '(') {
                            return false;
                        }
                    }
                } else return false;
            }

        }

        return stack.isEmpty();
    }
}