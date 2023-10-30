class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int [][]dp = new int[matrix.length][matrix[0].length];
        for(int a[]:dp){
            Arrays.fill(a,Integer.MIN_VALUE);
        }
        
        for (int i = 0; i < matrix[0].length; i++) {
           Mininumpath(matrix,0,i,dp);
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<dp[0].length;i++){
            min = Math.min(min,dp[0][i]);
        }
        return min;
        
    }
    
    public static int Mininumpath(int [][]matrix,int i,int j,int [][]dp){

        if(i>=matrix.length || j>= matrix[0].length || j<0){
            return Integer.MAX_VALUE;
        }

        if(dp[i][j] != Integer.MIN_VALUE){
            return dp[i][j];
        }

        int left = Mininumpath(matrix,i+1,j-1,dp);
        int down = Mininumpath(matrix,i+1,j,dp);
        int right = Mininumpath(matrix,i+1,j+1,dp);
        int max = Math.min(left,Math.min(right,down));

        if(max == Integer.MAX_VALUE){
            return dp[i][j] = matrix[i][j];
        }
        return dp[i][j] = matrix[i][j]+max;
    }
}