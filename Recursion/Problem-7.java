// LeetCode Link - https://leetcode.com/problems/reverse-string/

class Solution {
    public static void Helper(char[] s, int l, int r){
        if(l>=r) return;
        
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        
        Helper(s, l+1, r-1);
    }
    
    public void reverseString(char[] s) {
        Helper(s, 0, s.length -1);
        return;
    }
}

/*
    Time Complexity - O(n)
    Space Complexity - O(n)
*/
