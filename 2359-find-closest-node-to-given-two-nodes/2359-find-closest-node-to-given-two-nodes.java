class Solution {
    
   
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        
        int []arr1 = FindPath(edges,node1);
        int []arr2 = FindPath(edges,node2);
        
        int max = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0;i<arr1.length;i++){
            int a = arr1[i];
            int b = arr2[i];
            
            // ans = Math.min(ans,Math.max(a,b));
            if(max>Math.max(a,b)){
                max = Math.max(a,b);
                ans = i;
            }
        }
        
        return ans;
        
    }
    
    public int[] FindPath(int []edges,int src){
        
        int []arr = new int[edges.length];
        Arrays.fill(arr,Integer.MAX_VALUE);
        boolean visited[] = new boolean[edges.length];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        
        arr[src] = 0;
        visited[src] = true;
        while(!q.isEmpty()){
            
            int rem = q.remove();
            
            int a = edges[rem];
            
            if(a != -1 && !visited[a]){
                arr[a] = arr[rem]+1;
                q.add(a);
                visited[a] = true;
            }
            
        }
        
        return arr;
        
        
    }
}