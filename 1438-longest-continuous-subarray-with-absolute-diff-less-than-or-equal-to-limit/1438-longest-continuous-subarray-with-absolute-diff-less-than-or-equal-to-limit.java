class Solution {
    public int longestSubarray(int[] nums, int limit) {
        
        int ei=0;
        int si=0;
        
        int max=Integer.MIN_VALUE;
        Deque<Integer> maxdeque=new ArrayDeque<>();
        Deque<Integer> mindeque=new ArrayDeque<>();
        while(ei<nums.length){
            
            int val=nums[ei];
                
            while(!mindeque.isEmpty() && nums[mindeque.peekLast()]>=val){
                mindeque.pollLast();
            }
            mindeque.addLast(ei);
            while(!maxdeque.isEmpty() && nums[maxdeque.peekLast()]<=val){
                maxdeque.pollLast();
            }
            maxdeque.addLast(ei);
            
            int maxval=nums[maxdeque.peekFirst()];
            int minval=nums[mindeque.peekFirst()];
            
            if(maxval-minval>limit){
                si++;
                if(si>maxdeque.peekFirst()){
                    maxdeque.pollFirst();
                    
                }
                if(si>mindeque.peekFirst()){
                    mindeque.pollFirst();
                }
            }
            else{
                  max=Math.max(max,ei-si+1);
                  ei++;
            }
        }
        return max;
    }
     
}