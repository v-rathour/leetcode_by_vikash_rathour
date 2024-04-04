class Solution {
    
    HashMap<Integer,HashMap<Integer,Integer>> adj;
    
    public int minScore(int n, int[][] roads) {
        adj = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            adj.put(i,new HashMap<>());
        }
        
        for(int []a : roads){
            int f = a[0]-1;
            int l = a[1]-1;
            int c = a[2];
            
            adj.get(f).put(l,c);
            adj.get(l).put(f,c);
            
        }
        
        boolean visited[] = new boolean[n];
        int ans = -1;
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                ans = dfs(i,visited,n);
            }
            
            if(visited[n-1]){
                break;
            }
        }
        
        return ans;
    }
    
    public int dfs(int i,boolean[] visited,int n){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        
        int min = Integer.MAX_VALUE;
        
        while(!q.isEmpty()){
             int rem = q.remove();
             
             if(visited[rem]){
                 continue;
             }
            
             visited[rem] = true;
             for(int key : adj.get(rem).keySet()){
                 min = Math.min(min,adj.get(rem).get(key));
                 q.add(key);
             }
        }
        
        return min;
        
    }
    
    
}