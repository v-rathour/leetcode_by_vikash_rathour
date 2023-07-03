class Solution {
    int count;
    public long countPairs(int n, int[][] edges) {
       
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            int x = edges[i][0];
            int y = edges[i][1];
            
            adj.get(x).add(y);
            adj.get(y).add(x);
            
        }
        
        boolean visited[] = new boolean[n];
        long ans = Calculate(n);
        
        for(int i=0;i<n;i++){
            count = 0;
            if(visited[i]==false){
                
                dfs(i,adj,visited);
                ans -= Calculate(count);
            }
        }
        
        return ans;
    }
    
    public void dfs(int src,List<List<Integer>> adj,boolean visited[]){
        
        visited[src] = true;
        count++;
        
        for(int node: adj.get(src)){
             if(visited[node] == false){
                 dfs(node,adj,visited);
             }
        }
    }
    
    private long Calculate(int n){
        if(n<=1) return 0;
        return ((long)n*(n-1))/2;
    }
}
