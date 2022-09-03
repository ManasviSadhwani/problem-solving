//LeetCode Link - https://leetcode.com/problems/power-of-two/

class Solution {
    public static Boolean Helper(int num, int n){
        if(java.lang.Math.pow(2,n) > num) return false;
        if(java.lang.Math.pow(2,n) == num) return true;
        
        return Helper(num, n+1);
    }
    public boolean isPowerOfTwo(int num) {
        return Helper(num, 0);
    }
}

/*
  Time Complexity - O(n)
  Space Complexity - O(n)
*/
