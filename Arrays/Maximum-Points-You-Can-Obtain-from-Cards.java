
//  this is the approach of sliding window  
/*
Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will
maximize your total score. The optimal strategy is to take the 
three cards on the right, giving a final score of 1 + 6 + 5 = 12.
*/

class Solution {
    public int maxScore(int[] cardPoints, int k) {

            int total = 0;
        for (int i = 0; i < k; i++) total += cardPoints[i];
        int best = total;
        for (int i = k - 1, j = cardPoints.length - 1; i >= 0; i--, j--) {
            total += cardPoints[j] - cardPoints[i];
            best = Math.max(best, total);
        }
        return best;
        

    }
}
