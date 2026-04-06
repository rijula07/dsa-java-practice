// Problem: LeetCode 234 - Palindrome Linked List
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            vals.add(curr.val);
            curr = curr.next;
        }
        int left = 0;
        int right = vals.size() - 1;
        while (left < right) {
            if (!vals.get(left).equals(vals.get(right))) {
                return false; // not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }
}
