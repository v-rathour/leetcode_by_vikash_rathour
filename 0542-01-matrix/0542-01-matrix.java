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
    public int[][] updateMatrix(int[][] mat) {
        
         LinkedList<Pair> queue=new LinkedList<>();
         
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    queue.add(new Pair(i,j));
                }
                else{
                    mat[i][j]=-1;
                }
            }
        }
        
        while(!queue.isEmpty()){
            
            Pair rem=queue.removeFirst();
            
            for(int i=0;i<bfs.length;i++){
                int newrow  = rem.row+bfs[i][0];
                int newcol = rem.col+bfs[i][1];
                
                if(newrow>=0  && newrow<mat.length && newcol>=0 && newcol<mat[0].length 
                   && mat[newrow][newcol]<0){
                    mat[newrow][newcol]=mat[rem.row][rem.col]+1;
                    queue.add(new Pair(newrow,newcol));
                }
            }
            
        }
        
        return mat;
        
    }
    
    
}