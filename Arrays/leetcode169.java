// Problem: LeetCode 169 - Majority Element
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int e=0;
        for (int i=0;i<nums.length;i++) { 
            if (c==0) {
            e=nums[i]; 
            }
            if (nums[i]==e) {
            c=c+1;
        }
        else {
            c=c-1;
        }   
        }  
        return e;   
    }
}
