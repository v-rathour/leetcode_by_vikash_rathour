class Solution {
    public int deleteGreatestValue(int[][] grid) {
        
        List<PriorityQueue<Integer>> list=new ArrayList<>();
        
        int m = grid.length;
        int n = grid[0].length;
        
        for(int[] i:grid){
            
          PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            
          for(int j=0;j<n;j++){
              
            pq.add(i[j]);
              
          }
            
          list.add(pq);
            
        }
        
        
        int ans = 0;
        
        for(int i = 0;i < n; i++){
            
          int max = Integer.MIN_VALUE;
            
          for(int j = 0 ; j < m ; j++){
              
            max = Math.max(list.get(j).poll(),max);
              
          }
            
          ans += max;
            
        }
        return ans;
        
    }
}