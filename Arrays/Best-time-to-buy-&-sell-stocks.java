class Solution {
    public int maxProfit(int[] prices) {
        
 int minprice = Integer.MAX_VALUE ;
 int n = prices.length ;
 int maxprofit = 0;

 for(int i = 0; i< n ; i++){
   minprice = Math.min(minprice , prices[i]) ;
   maxprofit = Math.max(maxprofit , prices[i] - minprice) ;

 }

return maxprofit ;
    }
}
