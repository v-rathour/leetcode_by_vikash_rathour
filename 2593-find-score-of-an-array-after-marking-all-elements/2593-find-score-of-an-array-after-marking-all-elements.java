class Solution {
    public class Pair implements Comparable<Pair>{
        int value;
        int index;
        
        public Pair(int val,int idx){
            this.value = val;
            this.index = idx;
        }
        
      public int compareTo(Pair obj){
        return (obj.value == this.value?(this.index-obj.index):(this.value - obj.value));
      }
    }
    public long findScore(int[] nums) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++){
            pq.add(new Pair(nums[i],i));
        }
        
        boolean visited[] = new boolean[nums.length];
        
        long score = 0;
        
        while(!pq.isEmpty()){
            
            Pair rem = pq.remove();
            System.out.println(rem.value+" "+rem.index);
            
            if(!visited[rem.index]){
                
                score += rem.value;
                visited[rem.index] = true;
                
                if(rem.index-1>=0 && visited[rem.index-1] == false){
                    visited[rem.index-1] = true;
                }
                
                if(rem.index+1<nums.length && visited[rem.index+1] == false){
                    visited[rem.index+1] = true;
                }
                
            }
            
        }
        
        return score;
        
    }
}