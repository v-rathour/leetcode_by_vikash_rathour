class Solution {
    int MOD = 1_000_000_007;
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        // step-1 => dp[][][] creation....
        long[][][] dp = new long[m][n][maxMove + 1];
        for (long[][] i : dp) {
            for (long[] j : i) {
                Arrays.fill(j, -1);
            }
        }

        return (int) solveMemo(m, n, maxMove, startRow, startColumn, dp);
    }

    private long solveMemo(int m, int n, int maxMove, int r, int c, long[][][] dp) {
        
        if (r < 0 || r >= m || c < 0 || c >= n)
            return 1;
        
        if (maxMove == 0)
            return 0;

        if (dp[r][c][maxMove] >= 0)
            return dp[r][c][maxMove];


        long res = 0;
        res += solveMemo(m, n, maxMove - 1, r - 1, c, dp);
        res %= MOD;
        res += solveMemo(m, n, maxMove - 1, r + 1, c, dp);
        res %= MOD;
        res += solveMemo(m, n, maxMove - 1, r, c - 1, dp);
        res %= MOD;
        res += solveMemo(m, n, maxMove - 1, r, c + 1, dp);
        res %= MOD;
        return dp[r][c][maxMove] = res;
    }


}