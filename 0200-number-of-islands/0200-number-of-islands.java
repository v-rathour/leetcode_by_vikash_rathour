class Solution {
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        boolean visited[][] = new boolean[m][n];
        int count = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                
                if(grid[i][j] == '1' && visited[i][j] == false){
                    Island(grid,i,j,visited);
                    count++;
                }
                
            }
        }
        
        return count;
        
    }
    
    public void Island(char[][] grid,int row,int col,
                       boolean visited[][]){
        
        if(row<0 || col<0 || row >=grid.length 
           || col >= grid[0].length || visited[row][col] == true
          || grid[row][col] == '0'){
            return;    
        }
        
        visited[row][col] = true;
        
        Island(grid,row,col+1,visited);
        Island(grid,row+1,col,visited);
        Island(grid,row-1,col,visited);
        Island(grid,row,col-1,visited);
        
        
    }
}