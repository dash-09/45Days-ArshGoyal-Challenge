 /*class Solution {
    public int findDuplicate(int[] nums) {
          Arrays.sort(nums);
        int ans = 0;
        for(int i =1;i<nums.length;i++){
            if(nums[i-1] != nums[i]){
                continue;
            }else{
                ans = nums[i];
            }
        }
        return ans;
          
    }
}
         */ 
         // the above code can solve the question and give the result but time complexity is O(nLogn + n)   
      // see the below code in O(N) .

class Solution {
    public int findDuplicate(int[] nums) {
int slow = 0, fast = 0;
      int check = 0;
      while(true){
          slow = nums[slow];
          fast = nums[nums[fast]];
          if(slow == fast){
              break;
          }
      }

      while(true){
          slow = nums[slow];
          check = nums[check];
          if(slow == check){
              break;
          }
      }
      return check;
       
    }
}
    

