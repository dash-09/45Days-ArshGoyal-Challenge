/*
Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment n - 1 elements of the array by 1.
Example 1:

Input: nums = [1,2,3]
Output: 3
Explanation: Only three moves are needed (remember each move increments two elements):
[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
*/ 

class Solution {
    public int minMoves(int[] nums) {
        
     int min = nums[0];
     for(int i = 1; i<nums.length;i++){
         if(nums[i]<min){min=nums[i];}
     }
     int moves = 0;
     for(int i = 0;i<nums.length;i++){moves+=nums[i]-min;}
     return moves;
         
        
    }
}
