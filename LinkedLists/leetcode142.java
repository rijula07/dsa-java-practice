// Problem: LeetCode 142 - Linked List Cycle II
// Time Complexity: O(n)
// Space Complexity: O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // cycle detected
                // Step 2: Find cycle start
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr; // starting node of cycle
            }
        }
        return null; // no cycle
    }
}
