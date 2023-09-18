class Solution {
    
    class Pair implements Comparable<Pair> {
        int val;
        int idx;
        
        public Pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }
        
        public int compareTo(Pair obj){
            return this.val == obj.val?this.idx-obj.idx:
                                       this.val-obj.val;
        }
    }
    
    public int[] kWeakestRows(int[][] mat, int k) {
        
         PriorityQueue<Pair> pq = new PriorityQueue<>();
        
         for(int i = 0;i<mat.length;i++){
             
             int count = 0;
             for(int j = 0;j<mat[0].length;j++){
                 if(mat[i][j] == 1){
                     count++;
                 } 
             }
             
              pq.add(new Pair(count,i));
         }
        
        int arr[] = new int[k];
        
        for(int i = 0;i<k;i++){
            Pair rem = pq.remove();
            arr[i] = rem.idx;
        }
        
        return arr;
        
        
    }
}