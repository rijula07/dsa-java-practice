// Problem: LeetCode 125 - Valid Palindrome
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) { l++; continue; }
            if (!Character.isLetterOrDigit(s.charAt(r))) { r--; continue; }
            if (Character.toLowerCase(s.charAt(l)) != 
                Character.toLowerCase(s.charAt(r))) 
                return false;
            l++;
            r--;
        }
        return true;
    }
}
