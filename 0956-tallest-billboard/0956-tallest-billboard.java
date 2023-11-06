class Solution {
   
    public int tallestBillboard(int[] rods) {
        
        int n = rods.length;
        int amount = 0;
        
        for(int i = 0;i<n;i++){
            amount += rods[i];
        }
        
        int[][] dp = new int[21][2*5001];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        
       return Maximumlength(rods,0,0,dp);
       
    }
    
    public int Maximumlength(int[] rods,int i,int amount,int[][] dp){
        
        if(i == rods.length){
            return amount == 0?0:Integer.MIN_VALUE;
        }
        
        if(dp[i][amount+5001] != -1){
            return dp[i][amount+5001];
        }
        
        int inc = rods[i]+Maximumlength(rods,i+1,amount+rods[i],dp);
        int exc = Maximumlength(rods,i+1,amount-rods[i],dp);
        int com = Maximumlength(rods,i+1,amount,dp);
        
        
        
        
        return dp[i][amount+5001] = Math.max(inc,Math.max(exc,com));
    }
}