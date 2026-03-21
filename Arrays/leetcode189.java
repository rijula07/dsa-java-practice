// Problem: LeetCode 189 - Rotate Array
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
      int[] num = new int[n];
      for (int i=0;i<n;i++) {
        num[(i+k)%n] = nums[i];
      } 
      for (int i=0;i<n;i++) {
        nums[i] = num[i];
      }
    }
}
