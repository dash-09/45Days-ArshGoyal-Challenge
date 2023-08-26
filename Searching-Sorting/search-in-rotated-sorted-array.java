
class Solution {
    public int search(int[] nums, int target) {
        
// remember the question have a catch and that is , the input array don't have duplicates 
        int start = 0 ; int end = nums.length -1 ;
        while(start<=end){
            int mid =(start+end)/2 ;
            if(nums[mid] == target){
                return mid ;
            }else if(nums[mid]>= nums[start]){
                if(nums[start] <= target && target < nums[mid]){
                    end = mid-1 ;
                }else{
                    start = mid+1 ;
                }

            }else{
                if(nums[mid]< target && target <= nums[end]){
                    start = mid+1 ;
                }else{
                    end = mid-1 ;
                }
            }
        }
        return -1 ;
    }

}
