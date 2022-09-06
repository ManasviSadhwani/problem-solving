//LeetCode Link - https://leetcode.com/problems/subsets

/*
Approach -> Inclusion-Exclusion
In this approach, there will be two choices at each recursive call - 
1. Inclusion - Include the ith element in subset
2. Exclusion - Do not include the ith element in subset

Base Case - when i pointer reaches the end of given array nums[], add subset to answer and return.
Since all the elements of the given array are unique, the generated subsets will be unique as well.
*/

class Solution {
    public static List<List<Integer>> ans = new ArrayList();
    public static int [] nums;
    public static List<Integer> subset = new ArrayList();
    
    public static void Helper(int[] nums, int i, List<Integer> subset, List<List<Integer>> ans){
      //Base Case  
      if(i == nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        
        //Inclusion
        //Add ith element to subset
        subset.add(nums[i]);
      
        //Recursive call
        Helper(nums, i+1, subset, ans);
        
        //Exclusion
        //remove ith element from subset
        subset.remove(subset.size()-1);
      
        //Recursive call
        Helper(nums, i+1, subset, ans);
    }
    
    public static List<List<Integer>> subsets(int[] nums){
        ans.clear();
        Helper(nums, 0, subset, ans);
        return ans;
    }
}

/* 
Time Complexity : O(2^N)
Space Complexity : O(N)
*/
