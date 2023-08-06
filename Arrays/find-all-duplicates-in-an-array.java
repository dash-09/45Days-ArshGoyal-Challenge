/*
- Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

- You must write an algorithm that runs in O(n) time and uses only constant extra space.
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

condition: 1 <=nums[i]<=nums.length 
*/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int n = Math.abs(nums[i]);
            if(nums[n-1]<0){
                list.add(n);
            }else{
                nums[n-1] *= -1;
            }
        }
        return list;
    }
}
