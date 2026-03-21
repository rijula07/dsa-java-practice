// Problem: LeetCode 1752 - Check if Array Is Sorted and Rotated
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int d = 0;
    for (int i=0;i<=n-1;i++) {
        if (nums[i]>nums[(i+1)%n]) {
            d = d+1;
        }
    }
    if (d<=1) {
        return true;
    }
    else {
    return false;
    }
    }
}
