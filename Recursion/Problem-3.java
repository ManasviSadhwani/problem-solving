//LeetCode Link - https://leetcode.com/problems/climbing-stairs/

//This recursive solution is not acceptable on LeetCode. To avoid TLE -> use DP.

class Solution {
    public static int ways;
    public static void Helper(int n, int count){
        if(count>n) return;
        if(count == n){
            ways = ways+1;
            return;
        }
        
        Helper(n, count+1);
        Helper(n, count+2);
    }
    public int climbStairs(int n) {
        ways = 0;
        Helper(n, 0);
        return ways;
    }
}
