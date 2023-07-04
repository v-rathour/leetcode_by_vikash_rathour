class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        PossiblePath(graph,0,graph.length-1,ans,list);
        
        return ans;
    }
    
    public void PossiblePath(int[][] graph,int src,int target,List<List<Integer>> ans,List<Integer> list){
        
        if(src == target){
            list.add(src);
            ans.add(new ArrayList(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(src);
        for(int node : graph[src]){
            
            PossiblePath(graph,node,target,ans,list);
            
        }
        
        list.remove(list.size()-1);
    }
    
    
}