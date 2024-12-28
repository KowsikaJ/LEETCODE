class Solution {
    public int maxProfit(int[] prices) {
        int prof=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                prof+=prices[i+1]-prices[i];
            }
        }
        return prof;
        
    }
}