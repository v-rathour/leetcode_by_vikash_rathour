class Solution {
    
    boolean isEdge = false;
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        HashMap<Integer,List<Integer>> adj = new HashMap<>();
        
        for(int i=0;i<n;i++){
            adj.put(i,new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            int x = edges[i][0];
            int y = edges[i][1];
            
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        
        boolean visited[] = new boolean[n];
        
        dfs(source,adj,visited,destination);
        
        return isEdge;
    }
    
    public void dfs(int src,HashMap<Integer,List<Integer>> adj,boolean[] visited,int destination){
        
        if(src == destination){
            isEdge = true;
            return ;
        }
        
        visited[src] = true;
        
        for(int node: adj.get(src)){
            if(visited[node] == false){
                dfs(node,adj,visited,destination);
            }
        }
        
        
    }
}