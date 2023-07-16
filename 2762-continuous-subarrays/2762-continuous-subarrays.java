class Solution {
    public long continuousSubarrays(int[] nums) {
        
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
        
        int n = nums.length;
        int si = 0;
        int ei = 0;
        
        long ans = 0;
        
        while(ei<n){
            
            while(!max.isEmpty() && max.peekLast()<nums[ei]){
                    max.removeLast();
            }
            
            while(!min.isEmpty() && min.peekLast()>nums[ei]){
                    min.removeLast();
            }
            
             max.addLast(nums[ei]);
             min.addLast(nums[ei]);
            
            
            
            while((max.peekFirst()-min.peekFirst())>2){
                
                    if(nums[si] == max.peekFirst()){
                        max.removeFirst();
                    }

                    if(nums[si] == min.peekFirst()){
                        min.removeFirst();
                    }

                    si++;
                
            }
            
            ans += (ei-si+1);
            ei++;
        }
        
        return ans;
    }
}