class Solution {
    public int maxProfit(int[] prices) {
        
        int sub = 0;
        int ans = 0;
        for(int i = 0; i< prices.length-1; i++ ){
            sub = sub + prices[i+1] - prices[i];
            if(sub < 0){
                sub = 0;
            }

            if(sub > ans){
                ans = sub;
            }
        }
        return ans;
        
    }
}