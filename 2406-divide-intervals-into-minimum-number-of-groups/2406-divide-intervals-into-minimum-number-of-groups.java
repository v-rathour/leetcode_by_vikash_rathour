class Solution {
    
    
    
    public int minGroups(int[][] intervals) {
       
        int n = intervals.length;
        
        int[] start = new int[n];
        int[] end = new int[n];
        
        for(int i = 0;i<n;i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
            
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int i = 1;
        int j = 0;
        
        int ans = 1;
        int inter = 1;
        
        while(i<n && j<n){
            
            if(start[i]<=end[j]){
                inter++;
                i++;
            }
            else{
                inter--;
                j++;
            }
            
            ans = Math.max(ans,inter);
        }
        
        
        return ans;
        
    }
}