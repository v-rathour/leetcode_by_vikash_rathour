class Solution {
    
    HashMap<Integer,HashMap<Integer,Integer>> Adj;
    
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
          Adj = new HashMap<>();
         
        for(int i = 0;i<n;i++){
            Adj.put(i,new HashMap<>());
        }
        
        for(int []arr : flights){
            
            int si = arr[0];
            int ei = arr[1];
            int cost = arr[2];
            
            Adj.get(si).put(ei,cost);
            
        }
        
        
        return findPath(n,src,dst,k);
        
    }
    
    public int findPath(int n,int src,int dst,int k){
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{src, 0});
        distance[src] = 0;

        int level = 0;

        while (!queue.isEmpty() && level <= k) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int u = current[0];
                int d = current[1];

                HashMap<Integer,Integer> edges = Adj.get(u);
                
                for (int key : edges.keySet()) {
                    int v = key;
                    int cost = edges.get(key);

                    if (distance[v] > d + cost) {
                        distance[v] = d + cost;
                        queue.offer(new int[]{v, d + cost});
                    }
                }
                
            }
            
            level++;
        }

        return distance[dst] == Integer.MAX_VALUE ? -1 : distance[dst];
        
    }
}