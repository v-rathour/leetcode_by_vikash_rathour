class Solution {
    
    public class Pair{
        int row;
        int col;
        
        public Pair(int row,int col){
            
            this.row=row;
            this.col=col;
        }
    }
    
    int bfs[][]={{1,0},{0,1},{-1,0},{0,-1}};
    
    public int orangesRotting(int[][] grid) {
        
       Queue<Pair> q=new LinkedList<>();
        
        int ones=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                }
                else if(grid[i][j]==1){
                    ones++;
                }
            }
        }
        
        if(ones==0){
            return 0;
        }
        
        
        int time=-1;
        
        while(!q.isEmpty()){
            
              int size=q.size();
              time++;
              while(size>0){

                    Pair rem=q.poll();
                    
                    for(int i=0;i<4;i++){

                        int newrow = rem.row+bfs[i][0];
                        int newcol = rem.col+bfs[i][1];


                        if(newrow>=0 && newrow<grid.length && newcol>=0
                             && newcol<grid[0].length && grid[newrow][newcol]==1){

                                grid[newrow][newcol]=0;
                                q.add(new Pair(newrow,newcol));
                                ones--;
                        }

                    }
                    size--;
                }
            
        }
        
        if(ones>0){
            return -1;
        }
        
        return time;
        
        
    }
}