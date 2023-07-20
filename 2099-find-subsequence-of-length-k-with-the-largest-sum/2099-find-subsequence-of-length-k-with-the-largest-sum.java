class Solution {
    
     public class Pair implements Comparable<Pair>{
        int val;
        int indx;
        
        public Pair(int val,int indx){
            this.val = val;
            this.indx = indx;
        }
        
        public int compareTo(Pair obj){
            return obj.val - this.val;
        }
    }
    
    public int[] maxSubsequence(int[] nums, int k) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int answer[] = new int[k];
        for(int i=0;i<nums.length;i++){
            pq.add(new Pair(nums[i],i));
        }
        
        int i = 0;
        while(!pq.isEmpty() && i<k){
            
             Pair rem = pq.remove();
             answer[i] = rem.indx;
            
            i++;
        }
        
        Arrays.sort(answer);
        
        for(int j =0;j<answer.length;j++){
            answer[j] = nums[answer[j]];
        }
        
        return answer;
    }
}