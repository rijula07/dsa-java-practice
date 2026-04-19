// Problem: LeetCode 145 - Binary Tree Postorder Traversal
// Time Complexity: O(n)
// Space Complexity: O(n)
import java.util.*;
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.addFirst(node.val); 
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return result;
    }
}
