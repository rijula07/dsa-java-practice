// Problem: LeetCode 1021 - Remove Outermost Parentheses
// Time Complexity: O(n)
// Space Complexity: O(n)
import java.util.Stack;
 class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (!stack.isEmpty()) { 
                    result.append(c);
                }
                stack.push(c);
            } else { 
                stack.pop();
                if (!stack.isEmpty()) { 
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
