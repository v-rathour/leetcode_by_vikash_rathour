class Solution {
    
    int[] parent;
    
    int[] rank;
    public int[] findRedundantDirectedConnection(int[][] edges) {
        
        int n = edges.length;
        int[] inDegree = new int[n + 1];
        
        Arrays.fill(inDegree, -1);
        int bl1 = -1;
        int bl2 = -1;

        for(int i = 0; i < edges.length; i++){
            
            int u = edges[i][0];
            int v = edges[i][1];
            if(inDegree[v] == -1){
                inDegree[v] = i;
            }
            else {
                bl1 = i;
                bl2 = inDegree[v];
                break;
            }
        }

        parent = new int[n + 1];
        
        rank = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            
            parent[i] = i;
            rank[i] = 1;
        }
        
        for(int i = 0; i < edges.length; i++){
            
            if(i == bl1)
                continue;
            
            int u = edges[i][0];
            int v = edges[i][1];
            
            boolean flag = union(u, v);
            
            if(flag == true){
                if(bl1 == -1)
                    return edges[i]; // cycle is present
                else
                    return edges[bl2]; // cycle + 2 parents 
            }
        }
        
        return edges[bl1]; // 2 parents       
    }
    public int find(int node){
        
        if(node == parent[node])
            return node;
        return parent[node] = find(parent[node]);
    }
    
    public boolean union(int a, int b){
        
        int pA = find(a);
        int pB = find(b);
        
        if(pA == pB)
            return true;
        if(rank[pA] > rank[pB])
            parent[pB] = pA;
        else if(rank[pB] > rank[pA])
            parent[pA] = pB;
        else {
            parent[pB] = pA;
            rank[pA]++;
        }
        return false;
    }
}