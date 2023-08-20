// this is the question of bit manipulation 
/*
Input: n = 1
Output: true
Explanation: 20 = 1
=----------------------
Input: n = 16
Output: true
Explanation: 2^4 = 16
*/ 
class Solution {
    public boolean isPowerOfTwo(int n) {
     return n>0 &&  Integer.bitCount(n)==1;
    }
   
}
