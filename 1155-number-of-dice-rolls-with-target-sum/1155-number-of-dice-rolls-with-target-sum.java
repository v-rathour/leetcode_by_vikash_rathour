class Solution {
    int mod = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][] = new int[n][target+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        
        return solution(n,k,target,dp);
    }
    public int solution(int n,int k,int target,int[][] dp){
        
        if(n == 0 && target == 0){
            return 1;
        }
        
        if(n<=0 || target<0){
            return 0;
        }
        
        if(dp[n-1][target] != -1){
            return dp[n-1][target];
        }
        
        int ans = 0;
        for(int i = 1;i<=k;i++){
            ans = (ans+solution(n-1,k,target-i,dp))%mod;
        }
        
        return dp[n-1][target] = ans;
        
        
    }
}