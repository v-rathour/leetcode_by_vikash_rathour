class Solution {
    
    HashMap<Integer,HashMap<Integer,Integer>> adj;
    
    class Node implements Comparable<Node>{
        
        int val;
        int cost;
        
        Node(int val,int cost){
            this.val = val;
            this.cost = cost;
        }
        
        // @override
        public int compareTo(Node obj){
            return this.cost-obj.cost;
        }
        
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        
        adj = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            adj.put(i,new HashMap<>());
        }
        
        for(int []edge : times){
            
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];
            
            adj.get(u-1).put(v-1,cost);
            
        }
        
        
        int ans = -1;
        
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add(new Node(k-1,0));
       
        
        boolean visited[] = new boolean[n];
        int node = 0;
        
        while(!q.isEmpty()){
            
            Node rem = q.remove();
            if(visited[rem.val]){
                continue;
            }
            visited[rem.val] = true;
            ans = rem.cost;
            node++;
            
            for(int key : adj.get(rem.val).keySet()){
                if(!visited[key]){
                   q.add(new Node(key,rem.cost+adj.get(rem.val).get(key)));
                }
            }
            
        }
        // System.out.println(node);
        if(node == n){
            return ans;
        }
        
        return -1;
    }
}