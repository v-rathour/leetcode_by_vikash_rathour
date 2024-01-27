class Solution {
    
     public int kInversePairs(int n, int k) {
    
        int [][]dp = new int[1001][1001];
        
        for(int i =1 ; i<=n ;i++)
        {
            for(int j =0 ; j<=k ;j++)
            {
                if(j == 0)
                     dp[i][j]=1;
                else
                for(int m=0 ; m<= Math.min(j,i-1) ; m++)
                    dp[i][j] = ( dp[i][j] + dp[i-1][j-m] ) % 1000000007;
            }
        }
        return dp[n][k];
    }
}