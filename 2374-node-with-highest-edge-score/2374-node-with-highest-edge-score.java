class Solution {
    HashMap<Integer,Long> adj;
    public int edgeScore(int[] edges) {
        adj = new HashMap<>();
        
        int n = edges.length;
        for(int i = 0;i<n;i++){
            adj.put(i,(long)0);
        }
        
        for(int i = 0;i<edges.length;i++){
            adj.put(edges[i],adj.get(edges[i])+(long)i);
        }
        
        long max = 0;
        int ans = 0;
        // System.out.println(adj);
        for(int key : adj.keySet()){
            long sum = adj.get(key);
            if(sum>max){
                ans = key;
                max = sum;
            }
        }
        
        return ans;
        
    }
}