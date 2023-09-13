class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        boolean visited[][] = new boolean[m][n];
        int ans = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                
                if(grid[i][j] == 1 && visited[i][j] == false){
                    int max = Island(grid,i,j,visited);
                    ans = Math.max(max,ans);
                }
                
            }
        }
        
        return ans;
        
    }
    
    public int Island(int[][] grid,int row,int col,
                       boolean visited[][]){
        
        if(row<0 || col<0 || row >=grid.length 
           || col >= grid[0].length || visited[row][col] == true
          || grid[row][col] == 0){
            return 0;    
        }
        
        visited[row][col] = true;
        
        int a = Island(grid,row,col+1,visited);
        int b = Island(grid,row+1,col,visited);
        int c = Island(grid,row-1,col,visited);
        int d = Island(grid,row,col-1,visited);
        
        return a+b+c+d+1;
        
    }
}