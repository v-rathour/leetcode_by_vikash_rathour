class Solution {
    
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        
        List<List<Integer>> Adjecent = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        if (edges.length == 0 && n == 1) 
            return Collections.singletonList(0);
        
        for(int i=0;i<n;i++){
            
            Adjecent.add(new ArrayList<>());
        }
        
        for(int edge[]: edges){
            
            int src = edge[0];
            int des = edge[1];
            
            Adjecent.get(src).add(des);
            Adjecent.get(des).add(src);
        }
        
        for(int i = 0;i<Adjecent.size();i++){
            if(Adjecent.get(i).size()==1){
                queue.add(i);
            }
        }
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            ans.clear();
            while(size-->0){
                
                int rem = queue.poll();
                ans.add(rem);
                for(int node: Adjecent.get(rem)){
                    Adjecent.get(node).remove(Integer.valueOf(rem));
                    if(Adjecent.get(node).size()==1){
                        queue.add(node);
                    }
                }
            }
        }
        
        
        return ans;
        
    }
}