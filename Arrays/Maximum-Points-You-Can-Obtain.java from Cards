
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int res = 0;
        int n = cardPoints.length;
        int sum = 0;
        for(int i = 0;i<k;i++) sum+= cardPoints[i];

        int leftindex = k-1;
        if(leftindex == n-1) return sum;

        int rightindex = n-1;
        int rightsum = 0;
        int leftsum = 0;
        while(k-->0 && leftindex < rightindex){
            rightsum+= cardPoints[rightindex--];
            leftsum+= cardPoints[leftindex--];
            if(rightsum>leftsum){
                sum-=leftsum;
                sum+=rightsum;
                leftsum = 0;
                rightsum = 0;
            }
        } 


   return sum;


    }
}
