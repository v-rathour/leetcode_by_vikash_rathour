class Solution {
    
    int parent[];
    int ans[] = new int[2];
    public int find(int x){
        
        if(parent[x] == x){
            return x;
        }
        
        return find(parent[x]);
    }
    
    public void Union(int x,int y){
        
        int xroot = find(x);
        int yroot = find(y);
        
        if(xroot == yroot){
            ans[0] = x;
            ans[1] = y;
        }
        
        parent[yroot] = xroot;
        
    }
    
    public int[] findRedundantConnection(int[][] edges) {
        
        parent = new int[edges.length+1];
        
        for(int i=0;i<parent.length;i++){
            parent[i] = i;
        }
        
        for(int i=0;i<edges.length;i++){
            int x = edges[i][0];
            int y = edges[i][1];
            
            Union(x,y);
        }
    
        return ans;
        
    }
}