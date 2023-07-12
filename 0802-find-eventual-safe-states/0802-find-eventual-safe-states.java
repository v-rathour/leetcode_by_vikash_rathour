class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        for(int i=0;i<graph.length;i++){
            if(graph[i].length == 0){
                map.put(i,true);
            }
        }
        
        for(int i=0;i<graph.length;i++){
            boolean result = dfs(i,graph, new HashSet<Integer>(),map);
            map.put(i,result);
            
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<graph.length;i++){
            if(map.get(i)){
                list.add(i);
            }
        }
        
        return list;
        
        
    }
    
       public boolean dfs(int curr,int[][] graph,HashSet<Integer> visited,HashMap<Integer,Boolean> map){
        
        if(map.containsKey(curr)){
            return map.get(curr);
        }
        
        if(visited.contains(curr)){
            return false;
        }
        
        visited.add(curr);
        
        for(int node:graph[curr]){
            boolean flag = dfs(node,graph,visited,map);
            
            if(flag){
                map.put(node,true);
            }
            else{
                return false;
            }
        }
        
        visited.remove(curr);
        
        return true;
    }
 
}