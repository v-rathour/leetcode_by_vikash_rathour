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
        
        for(int i = 0;i<matrix.length;i++){
            min = Math.min(dp[0][i],min);
        }
        
        return min;
        
    }                                                     
    
    public static int Mininumpath(int [][]matrix,int i,int j,int [][]dp){

        if(i>=matrix.length ){
            return Integer.MAX_VALUE;
        }

        if(dp[i][j]>Integer.MIN_VALUE){
            return dp[i][j];
        }
        
        int min = Integer.MAX_VALUE;

       for(int k = 0;k<matrix.length;k++){
           if(k != j){
               min = Math.min(min,Mininumpath(matrix,i+1,k,dp));
           }
       }
        

        if(min == Integer.MAX_VALUE){
            return dp[i][j] = matrix[i][j];
        }
        return dp[i][j] = matrix[i][j]+min;
    }
}