/*Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
*/ 


class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      // question of dynamic sliding window technique problem 

    Map<Integer,Integer> map = new HashMap<>();
    for(int i = 0, remainder = 0;i< nums.length;i++ ){
        remainder = ((remainder+nums[i]) % k + k) % k;
        map.put(remainder,map.getOrDefault(remainder,0)+1);

    }
    int result = map.getOrDefault(0,0);
    for(int freq : map.values() ){
      result = result+freq*(freq-1)/2;
    }

    return result;
      
    }
}
//  both the approaches are good but the below code is more readable understandable and fast and better.

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>(); 
         int ans = 0, sum = 0, rem = 0; map.put(0,1);
      for(int i =0 ;i<nums.length;i++){
        sum += nums[i];
        rem = sum%k;
        if(rem<0){rem = rem+k;}
        if(map.containsKey(rem)){
          ans += map.get(rem);
          map.put(rem,map.get(rem)+1);
        }else{
          map.put(rem,1);
        }
      }
      return ans;
    }
}
