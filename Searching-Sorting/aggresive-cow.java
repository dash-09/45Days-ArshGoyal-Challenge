

class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low = 1; int high = stalls[n-1]-stalls[0];
        int res = 0;
        while(low<=high){
            int mid = (low+high)>>1;
            if(check(stalls,n,k,mid)){
               res= mid;
               low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }
    public static boolean check(int nums[],int n, int cows, int mid){
        int cordinate = nums[0];
         int count =1;
         for(int i = 1;i<n;i++){
             if(nums[i]-cordinate>=mid){
                 count++;
                 cordinate = nums[i];
             }
             if(count>=cows){
                 return true;
             }
         }
         return false;
    }
}
