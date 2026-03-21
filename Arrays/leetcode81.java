// Problem: Search in rotated sorted array
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target) {
                return true;
            }
        }
        return false;
    }
}
