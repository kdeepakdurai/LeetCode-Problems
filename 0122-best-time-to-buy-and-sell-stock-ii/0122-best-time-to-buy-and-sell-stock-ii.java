class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int p:prices){
            buy=Math.min(buy,p);
            if(p>buy){
                profit+=p-buy;
                buy=p;
            }
        }  
        return profit;          
    }
}