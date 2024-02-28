class Solution {
    
    public int edgeScore(int[] edges) {
        long []MaximumSum = new long[edges.length];
        
        int ans = 0;
        long max = 0;
        
        for(int i = 0;i<edges.length;i++){
            
            MaximumSum[edges[i]] += i;
            
            if(MaximumSum[edges[i]]>max){
                ans = edges[i];
                max = MaximumSum[edges[i]];
            }
            
            if(MaximumSum[edges[i]] == max){
                ans = Math.min(edges[i],ans);
            }
        }
        
        
        return ans;
        
        
        
    }
}