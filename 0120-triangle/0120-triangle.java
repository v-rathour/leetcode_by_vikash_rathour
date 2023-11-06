class Solution {
    
    public int minimumTotal(List<List<Integer>> triangle) {
           int n = triangle.size();
           int m = triangle.get(n-1).size();

           int [][]dp = new int[n][m];
           for(int []a: dp){
               Arrays.fill(a,-1);
           }

           return Maximum_path(triangle,0,0,dp);
    }
    
    public int Maximum_path(List<List<Integer>> list,int i,int j,int [][]dp){
        
        if(i == list.size()){
            return 0;
        }
        
        if(j == list.get(i).size()){
            return 0;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int first = Maximum_path(list,i+1,j,dp);
        int second = Maximum_path(list,i+1,j+1,dp);
        
        int num = list.get(i).get(j);
        
        return dp[i][j] = Math.min(num+first,num+second);
        
    }
}