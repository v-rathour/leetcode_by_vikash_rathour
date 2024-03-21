class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        List<Integer> answer = new ArrayList<>();
        boolean []visited = new boolean[n];
        for(List<Integer> edge : edges){
            int u = edge.get(0);
            int v = edge.get(1);
            
            visited[v] = true;
            
        }
        
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                answer.add(i);
            }
        }
        
        return answer;
    }
}