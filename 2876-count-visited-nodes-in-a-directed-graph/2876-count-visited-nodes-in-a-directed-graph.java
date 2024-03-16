class Solution {
    
    HashMap<Integer,Integer> adj;
    
    public int[] countVisitedNodes(List<Integer> edges) {
        
        adj = new HashMap<>();
        
       
        
        for(int i = 0;i<edges.size();i++){
            
            adj.put(i,edges.get(i));
        }
        
        int[] ans = new int[edges.size()];
        Arrays.fill(ans,-1);
        boolean []visited = new boolean[edges.size()];
        
        for(int i = 0;i<visited.length;i++){
            if(!visited[i]){
                dfs(i,visited,ans);
            }
        }
        
        return ans;
        
    }
    
    public void dfs(int src,boolean []visited,int []ans){
        
         if(ans[src] != -1)
             return;
         if(visited[src]){
             int len = 1;
             int curr = src;
             while(adj.get(curr) != src){
                 len++;
                 curr = adj.get(curr);
             }
             
             curr = src;
             while(adj.get(curr) != src){
                 ans[curr] = len;
                 curr = adj.get(curr);
             }
             ans[curr] = len;
             return;
         }
        
        visited[src] = true;
        
        dfs(adj.get(src),visited,ans);
        if(ans[src] == -1)
            ans[src] = ans[adj.get(src)]+1;
        
    }
}