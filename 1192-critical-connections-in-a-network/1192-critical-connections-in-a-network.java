class Solution {
    
    int []parent;
    int []disc;
    int []lowest;
    List<List<Integer>> ans;
    boolean []visited;
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0;i<connections.size();i++){
            int u = connections.get(i).get(0);
            int v = connections.get(i).get(1);
            
            graph.get(u).add(v);
            graph.get(v).add(u);
            
        }
        
        disc = new int[n];
        lowest = new int[n];
        visited = new boolean[n];
        parent = new int[n];
        ans = new ArrayList<>();
        int time = 0;
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                dfs(i,-1,graph,time);
            }
        }
        
        return ans;
        
    }
    
    public void dfs(int u,int parent,List<List<Integer>> graph,int time){
        disc[u] = lowest[u] = time;
        time++;
        
        visited[u] = true;
        
        for(int nbrs : graph.get(u)){
            
            if(nbrs == parent){
                continue;
            }
            else if(visited[nbrs]){
                lowest[u] = Math.min(lowest[u],disc[nbrs]);
            }
            else{
                dfs(nbrs,u,graph,time);
                lowest[u]= Math.min(lowest[u],lowest[nbrs]);
                
                if(lowest[nbrs]>disc[u]){
                    List<Integer> list = new ArrayList<>();
                    list.add(u);
                    list.add(nbrs);
                    ans.add(list);
                }
            }
        }
    }
}