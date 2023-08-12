class Solution {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        
        if(obstacleGrid[n-1][m-1] == 1){
            return 0;
        }
        
        int dp[][] = new int[n][m];
        
        for(int i = n-1;i >= 0;i--){
            
            for(int j =m -1;j >= 0;j--){
                
                if(obstacleGrid[i][j] != 1){
                    if(i == n-1 && j == m-1){
                        dp[i][j] = 1;
                    }
                    else if(i == n-1){
                        dp[i][j] = dp[i][j+1];
                    }
                    else if(j == m-1){
                        dp[i][j] = dp[i+1][j];
                    }else{
                        dp[i][j] = dp[i+1][j]+dp[i][j+1];
                    }
                }
            }
        }
        
        return dp[0][0];
        
        
    }

}