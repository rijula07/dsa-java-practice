// Problem: LeetCode 203 - Remove Linked List Elements
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy; 
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; 
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}
