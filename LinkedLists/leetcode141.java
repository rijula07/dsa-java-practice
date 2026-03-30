// Problem: LeetCode 141 - Linked List Cycle
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // move 1 step
            fast = fast.next.next;    // move 2 steps

            if (slow == fast) {
                return true; // cycle detected
            }
        }

        return false; // reached end → no cycle
    }
}
