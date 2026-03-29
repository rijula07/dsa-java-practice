// Problem: LeetCode 206 - Reverse Linked List
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; // save next node
            curr.next = prev;              // reverse the link
            prev = curr;                   // move prev forward
            curr = nextTemp;               // move curr forward
        }
        return prev; // prev is the new head
    }
}
