class Solution {
    
    
    public int removeStones(int[][] stones) {
        int n = stones.length;
        
        boolean visited[] = new boolean[n];
        int group = 0;
        for(int i = 0;i<n;i++){
            
            if(visited[i]){
                continue;
            }
            
            dfs(stones,i,visited);
            group++;
        }
        
        return n - group;
    }
    
    public void dfs(int [][]stones,int indx,boolean visited[]){
        visited[indx] = true;
        
        for(int i = 0;i<visited.length;i++){
            int r = stones[indx][0];
            int c = stones[indx][1];
            
            if(!visited[i] && (stones[i][0] == r || stones[i][1] == c)){
                dfs(stones,i,visited);
            }
        }
    }
}