// Brute force using >> 3 nested loop :: time-complexity O(N^3) . Not worthIt

/* better approach is here >> using three pointer and a loop 
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.*/ 

class solution{
public static List<List<Integer>> threeSum(int nums[]){
  int target = 0;
  List<List<Integer>> list = new ArrayList<>();
  Set<List<Integer>> set = new HashSet<>();
  
  if(nums.length==0){
    return list;
  }
  Arrays.sort(nums);
  int n = nums.length; 
  for(int i = 0 ; i<n;i++){
   int j = i+1;
   int k = n-1; 
    while(j<k){
    int sum = nums[i]+nums[j]+nums[k];
      if(sum== target){
         set.add(Arrays.asList(nums[i],nums[j],nums[k]));
      }else if(sum < target){
        j++;
      }else{
       k--;
      }
      
    }
  }
  list.addAll(set);
  return list;
}
}



