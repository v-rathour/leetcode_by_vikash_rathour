class Solution {
    HashMap<Integer,List<Integer>> adj;
    public int countCompleteComponents(int n, int[][] edges) {
        
        adj = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            adj.put(i,new ArrayList<>());
        }
        
        for(int i = 0;i<edges.length;i++){
            int ai = edges[i][0];
            int bi = edges[i][1];
            
            adj.get(ai).add(bi);
            adj.get(bi).add(ai);
        }
        
        boolean []visited = new boolean[n];
        int count = 0;
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                if(BFS(i,visited)){
                    count++;
                }
            }
        }
        
        return count;
    }
    
    
    public boolean BFS(int src,boolean []visited){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        
        int edge = 0;
        q.add(src);
        visited[src] = true;
        
        while(!q.isEmpty()){
            
            int rem = q.remove();
            set.add(rem);
            
            
            edge += adj.get(rem).size();
            
            for(int n : adj.get(rem)){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                }
                
                
            }
            
        }
        
        // System.out.println(set.size()+" "+edge/2);
        int node = set.size();
        return edge/2 == (node*(node-1))/2;
        
    }
}