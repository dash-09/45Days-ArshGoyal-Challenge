
// in arsh sheet this ques given in gfg but i have done at 
// [leetcode here is link](https://leetcode.com/problems/product-of-array-except-self/) 
 /*
 */

class solution{
  public int findPeakElement(int[] nums) {
     if(nums.length == 1){ return 0; }
 int high = nums.length-1 ;
  if(nums[0]> nums[1]){return 0 ;}
  if(nums[high]> nums[high-1]){return high ;}
   
   int low  = 1; int high = nums.length-1;
   while(low<high){
    int mid = low+(high-low)/2;
    if(nums[mid-1]<nums[mid]&& nums[mid]>nums[mid]){return mid;}
    else if(nums[mid-1]>nums[mid]){high = mid-1;}
    else if(nums[mid+1]>nums[mid]){low = mid+1;}
   }
   return -1;
  }
}

