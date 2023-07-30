
/*
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
*/
// I am confused why : return false when (i>max) 
class Solution {
    public boolean canJump(int[] nums) {
        

int n = nums.length ;
int max =0 ;
for(int i =0; i< n ; i++){
    if(i>max){return false ;}
    max = Math.max(max  ,i+nums[i]) ;
}
return true;



        
    }
}
