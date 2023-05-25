class Solution {
    static int count;
    public int totalNQueens(int n) {
        count=0;
        boolean[][] visited=new boolean[n][n];
        placeQueen(visited,0,n);
        return count;
    }
    
    public void placeQueen(boolean[][] visited,int row,int n){
        if(row==n){
            count++;
            return;
        }
        
        for(int col=0;col<n;col++){
            if(isPossible(visited,row,col)){
                visited[row][col]=true;
                placeQueen(visited,row+1,n);
                visited[row][col]=false;
            }
        }
    }
    
    public boolean isPossible(boolean visited[][],int row,int col){
        for(int i=row;i>=0;i--){
            if(visited[i][col]==true){
                return false;
            }
        }
        
        for(int i=row,j=col;i>=0 && j<visited.length;i--,j++){
            if(visited[i][j]==true){
                return false;
            }
        }
        
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(visited[i][j]==true){
                return false;
            }
        }
        
        return true;
    }
}