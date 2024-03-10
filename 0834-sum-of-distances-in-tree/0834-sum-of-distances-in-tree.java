class Solution {
    
    HashMap<Integer,List<Integer>> adj;
    int []child_count;
    int root_result;
    
    public int dfsBase(int curr,int pre_node,int curr_depth){
        
        int total_count=1;
        
        root_result += curr_depth;
        
        for(int nbr : adj.get(curr)){
            if(nbr == pre_node){
                continue;
            }
            
            total_count += dfsBase(nbr,curr,curr_depth+1);
        }
        
        child_count[curr] = total_count;
        
        return total_count;
        
    }
    
    public void dfs(int n,int curr,int pre_node,int[] result){
        
        for(int nbr : adj.get(curr)){
            
            if(nbr == pre_node)
                continue;
            
            result[nbr] = result[curr]-child_count[nbr]+(n-child_count[nbr]);
            dfs(n,nbr,curr,result);
        }
        
    }
    
     public int[] sumOfDistancesInTree(int n, int[][] edges) {
     
         adj = new HashMap<>();
         
         for(int i = 0;i<n;i++){
             adj.put(i,new ArrayList<>());
         }
         
         for(int edge[] : edges){
              adj.get(edge[0]).add(edge[1]);
              adj.get(edge[1]).add(edge[0]);
         }
         
         child_count = new int[n];
         root_result = 0;
         
         dfsBase(0,-1,0);
         
         int result[] = new int[n];
         result[0] = root_result;
         
         dfs(n,0,-1,result);
         
         return result;
    }
}