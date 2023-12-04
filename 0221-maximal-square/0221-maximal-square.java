class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [][]dp = new int[n][m];
        
        for(int i = 0;i<m;i++){
            if(matrix[n-1][i] != '0'){
                // System.out.println(matrix[n-1][i]);
                dp[n-1][i] = 1;
            }
        }
        
        
        
        for(int i = 0;i<n;i++){
            if(matrix[i][m-1] != '0'){
                dp[i][m-1] = 1;
            }
        }
        
        for(int i = n-2;i>=0;i--){
            for(int j = m-2;j>=0;j--){
              if(matrix[i][j] != '0'){
                dp[i][j] = Math.min(dp[i+1][j+1],Math.min(dp[i][j+1],dp[i+1][j]))+1;
              }
            }
        }
        
        
        
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                ans = Math.max(dp[i][j],ans);
            }
        }
        
        return ans*ans;
    }
}