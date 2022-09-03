// LeetCode Link - https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, long n) {
        if(n==0)
            return 1;
        if(n<0){
            n=-n;         
            x=1/x;
        }
        if(n%2==0)
            return myPow(x*x,n/2);   
        return x*myPow(x*x,n/2);    
    }
}

/*
  Time complexity - O(log n)
  Space complexity - O(log n)
*/
