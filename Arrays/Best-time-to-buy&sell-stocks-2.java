<code>
    
// you can buy & sell more than 1 time in order to increase your profit . Thats is the difference both (Best-time-to-buy&sell-stocks- 1) & (Best-time-to-buy&sell-stocks-2) question .
/*
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
*/ 
class Solution {
    public int maxProfit(int[] prices) {
        

       ArrayList<Integer> priceGain = new ArrayList<Integer>();
        
        for(int idx = 0 ; idx < prices.length-1; idx++){
            
            if( prices[idx] < prices[idx+1] ){
                priceGain.add( prices[idx+1]- prices[idx]);
            }
                
        }
        return priceGain.stream().mapToInt(n->n).sum();
    }
}
</code>
