class Solution {
    
    public class Pair{
        int x;
        int y;
        int diff;
        
        public Pair(int x,int y, int diff){
            this.x = x;
            this.y = y;
            this.diff = diff;
        }
        
    }
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid.length;
        
        if(grid[0][0] == 1 || grid[row-1][col-1] == 1){
            return -1;
        }
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0,1));
        
        int [][] direction = {{0,1},{1,0},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            for(int i=0;i<size;i++){
                
                Pair temp = q.poll();
                
                int x = temp.x;
                int y = temp.y;
                int cost = temp.diff;
                
                if(x == row-1 && y == col-1){
                    return cost;
                }
                
                for(int[] way: direction){
                    int newx = x+way[0];
                    int newy = y+way[1];
                    
                    if(newx>=0 && newx<row && newy>=0 && newy
                       <col && grid[newx][newy] == 0){
                        
                        q.add(new Pair(newx,newy,cost+1));
                        grid[newx][newy] = 1;
                    }
                }
            }
        }
        
        return -1;
    }
    
   
}