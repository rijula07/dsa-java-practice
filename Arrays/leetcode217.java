// Problem: LeetCode 217 - Contains Duplicate
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
          HashSet<Integer> dup = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            if (dup.contains(nums[i])) {
                return true;
            }
            dup.add(nums[i]);
        }
        return false;
    }
}
