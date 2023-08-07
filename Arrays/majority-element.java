// moore's voting algorithm >> famous algo .  element will be more than N/2 times more than other elements.  

class Solution {
    public int majorityElement(int[] nums) {

if (nums.length == 1) {return nums[0];}

int count = 0; int results =0 ;

for(int i = 0; i< nums.length ; i++){
    if(count == 0 ){
        results = nums[i] ;
        count = 1 ;
    }else if(results== nums[i]){
        count++ ;
    } else{
        count -- ;
    }
}
return results ;
    }
}
