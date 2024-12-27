class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=prices[0];
        int prof=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyprice>prices[i]){
                buyprice=prices[i];
            }
            prof=Math.max(prof,prices[i]-buyprice);
        }
        return prof;
        
    }
}