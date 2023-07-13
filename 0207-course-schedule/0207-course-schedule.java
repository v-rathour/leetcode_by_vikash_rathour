class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
         List<List<Integer>> adj = new ArrayList<>();
        
         for(int i=0;i<numCourses;i++){
             adj.add(new ArrayList<>());
         }
        
         for(int i=0;i<prerequisites.length;i++){
             int x = prerequisites[i][0];
             int y = prerequisites[i][1];
             
             adj.get(x).add(y);
         }
        
         boolean visited[] = new boolean[numCourses];
        boolean recS[] = new boolean[numCourses];
         for(int i=0;i<numCourses;i++){
             
             if(visited[i] == false){
                 boolean result = dfs(i,adj,recS,visited);
                 if(result){
                     return false;
                 }
             
             }
         }
        
        return true;
    }
    
    public boolean dfs(int curr, List<List<Integer>> adj,boolean recs[],boolean visited[]){
        
        visited[curr] = true;
        recs[curr] = true;
        for(int node : adj.get(curr)){
           
            if(visited[node] == false){
                 boolean flag = dfs(node,adj,recs,visited);
                 if(flag == true){
                     return true;
                 }
            }
            else if(recs[node]){
                return true;
            }
        }
        
        recs[curr] = false;
            
        return false;
    }
}