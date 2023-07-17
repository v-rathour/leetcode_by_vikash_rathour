class Solution {
    
    public class Pair implements Comparable<Pair> {

        int val;
        int freq;
        
        public Pair(int val,int freq){
            this.val = val;
            this.freq = freq;
        }
        
        public int compareTo(Pair obj){
            return obj.freq - this.freq;
        }
        
    }
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])==false){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int val : map.keySet()){

            pq.add(new Pair(val,map.get(val)));
        }
        
        int[] ans = new int[k];
        int i=0;
        while(!pq.isEmpty() && i<k){
            
            Pair rem = pq.remove();
            
            ans[i] = rem.val;
            
            i++;
            
        }
        
        
        return ans;
        
    }
}