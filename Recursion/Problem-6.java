//LeetCode Link - https://leetcode.com/problems/palindrome-number/

class Solution {
    public static Boolean flag = false;
    public static void Helper(String num, int l, int r){
        if(l >= r){
            flag = true;
            return;
        }
        if(num.charAt(l) == num.charAt(r)) 
            Helper(num, l+1, r-1);
    } 
    
    public static Boolean isPalindrome(int x){
        flag = false;
        if(x<0) return false;
        String num = Integer.toString(x);
        Helper(num, 0, num.length()-1);
        return flag;
    } 
}

/*
  Time Complexity - O(n/2)
  Space Complexity - O(n/2)
*/
