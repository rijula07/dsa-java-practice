// Problem: LeetCode 50 - Pow(x, n)
// Time Complexity: O(log n)
// Space Complexity: O(1)
class Solution {
    public double myPow(double x, int n) {
        long N = n;  
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        while (N > 0) {
            if (N % 2 == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }
        return result;
    }
}
