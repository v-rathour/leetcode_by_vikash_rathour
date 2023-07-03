class Solution {
    public long maximumImportance(int n, int[][] roads) {
        
        int edges[] = new int[n];
        
        for(int i=0;i<roads.length;i++){
            
            int x = roads[i][0];
            int y = roads[i][1];
            
            edges[x]++;
            edges[y]++;
        }
        
        Arrays.sort(edges);
        
        long ans = 0;
        for(int i=n-1;i >= 0;i--){
            
            ans = ans + (long)edges[i]*(long)(i+1);
        }
        
        return ans;
    }
}