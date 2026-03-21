// Problem: LeetCode 35 - Search Insert Position
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for (int i=0;i<n;i++) {
        if (nums[i]>=target) {
            return i;
        }
    }
    return n;
}
}
