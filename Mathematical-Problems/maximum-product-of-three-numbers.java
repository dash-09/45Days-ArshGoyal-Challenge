/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
Example 1:

Input: nums = [1,2,3]
Output: 6
*/ 

class Solution {
    public int maximumProduct(int[] nums) {
        int min1, min2, max1, max2, max3;
        min1 = min2 = Integer.MAX_VALUE;
        max1 = max2 = max3 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(max1 < nums[i]){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }else if(max2 < nums[i]){
                max3 = max2;
                max2 = nums[i];
            }else if(max3 < nums[i]){
                max3 = nums[i];
            }
            

            if(min1 > nums[i]){
                min2 = min1;
                min1 = nums[i];
            }else if(min2 > nums[i]){
                min2 = nums[i];
            }
            
        }
        
        return Math.max(max1 * max2 * max3 , min1 * min2 * max1);
    }
}
