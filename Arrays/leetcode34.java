// Problem: LeetCode 34 - Find First and Last Position of Element in Sorted Array
// Time Complexity: O(log n)
// Space Complexity: O(1)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = -1, last = -1;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        left = 0;
        right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{first, last};
    }
}
