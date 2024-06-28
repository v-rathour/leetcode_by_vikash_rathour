class Solution {
    
    class Pair implements Comparable<Pair>{
        int val;
        int size;
        
        Pair(int val,int size){
            this.val = val;
            this.size = size;
        }
        
        public int compareTo(Pair obj){
            return (this.size == obj.size)?(this.val-obj.val):(obj.size-this.size);
        }
    }
    
    public long maximumImportance(int n, int[][] roads) {
        
        HashMap<Integer,List<Integer>> adj = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            adj.put(i,new ArrayList<>());
        }
        
        for(int a[] : roads){
            
            int u = a[0];
            int v = a[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
            
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int key :adj.keySet()){
            pq.add(new Pair(key,adj.get(key).size()));
        }
        
        int []assign = new int[n];
        int count=n;
        while(!pq.isEmpty()){
            Pair rem = pq.remove();
            
            assign[rem.val] = count;
            count--;
            
        }
        
       long ans = 0;
        
        for(int a[] : roads){
            ans += assign[a[0]];
            ans += assign[a[1]];
        }
        
        return ans;
        
    }
}