
/*
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest 
sum of any subarray is minimized.
Return the minimized largest sum of the split.
A subarray is a contiguous part of the array.
Example 1:>
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18
*/ 

class solution{  
     int low = 0; int high = 0;
       for(int n:nums){
           low = Math.max(low,n);
           high+=n;
       } 
       while(low<high){
           int mid = low+(high-low)/2;
           if(check(nums,k,mid)){
               high= mid;
           } else{
               low = mid+1;
           }
       }
       return low;
    }
    public boolean check(int []nums,int m, int mid){
        int sum =0;
        int noOfSubarrays = 1;
        for(int i =0;i<nums.length;i++ ){
            sum+=nums[i];
            if(sum>mid){
                noOfSubarrays++;
                sum = nums[i];
            }
        }
        return noOfSubarrays==m;
    }
}
