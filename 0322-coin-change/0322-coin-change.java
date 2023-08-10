class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int dp[] = new int[amount+1];
        Arrays.fill(dp,-1);
        
        dp[0] = 0;
        int ans = coin_Change(coins,amount,dp);
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
        
    }
    
    public  int coin_Change(int coin[],int amount,int dp[]){
        
        if(amount == 0)
            return 0;
        
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0;i<coin.length;i++){
            
            if(amount - coin[i] >= 0){
                
                int subans = 0;
                if(dp[amount-coin[i]] != -1){
                    subans = dp[amount - coin[i]];
                }
                else{
                    subans = coin_Change(coin,amount-coin[i],dp);
                }
                
                if(subans != Integer.MAX_VALUE && subans+1 < ans){
                    ans = subans+1;
                }
            }
        }
       return dp[amount] = ans;
    }
}