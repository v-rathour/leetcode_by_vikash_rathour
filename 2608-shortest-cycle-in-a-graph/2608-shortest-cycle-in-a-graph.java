class Solution {
    
    HashMap<Integer,List<Integer>> adj;
    
    public int findShortestCycle(int n, int[][] edges) {
        
        adj = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            adj.put(i,new ArrayList<>());
        }
        
        for(int i = 0;i<edges.length;i++){
            
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
            
        }
        
       
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
             boolean visited[] = new boolean[n];
        int count[] = new int[n];
            // if(!visited[i]){
               ans = Math.min(ans,BFS(i,visited,count));
            // }
        }
        
        return ans == Integer.MAX_VALUE?-1:ans;
        
    }
    
    class Pair{
        int val;
        int parent;
        
        Pair(int val,int parent){
            this.val = val;
            this.parent = parent;
        }
    }
    
    public int BFS(int node,boolean visited[],int count[]){
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(node,-1));
        
        visited[node] = true;
        
        int ans = Integer.MAX_VALUE;
        
        while(!q.isEmpty()){
            
            Pair rem = q.remove();
            
            for(int n : adj.get(rem.val)){
                
                if(!visited[n]){
                    count[n] = count[rem.val]+1;
                    visited[n] = true;
                    q.add(new Pair(n,rem.val));
                }
                else if(rem.parent != n){
                    ans = Math.min(ans,count[rem.val]+count[n]+1);
                }
                
            }
            
        }
        
        return ans;
        
    }
    
    
}