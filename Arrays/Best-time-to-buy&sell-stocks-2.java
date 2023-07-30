// you can buy & sell more than 1 time in order to increase your profit . Thats is the difference both (Best-time-to-buy&sell-stocks- 1) & (Best-time-to-buy&sell-stocks-2) question .
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
