//Find the factorial of a number recursively.

class Solution{
  public static int Factorial(int n){
    if(n == 0) return 1;
    return n*Factorial(n-1);
  }
}

/*
  Time complexity - O(n)
  Space complexity - O(n)
*/
