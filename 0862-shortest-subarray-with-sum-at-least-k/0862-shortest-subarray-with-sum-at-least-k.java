class Solution {
    public int shortestSubarray(int[] nums, int k) {
        
        int n = nums.length;
        
        int ans  = n+ 1;
        
        long [] arr = new long [n+1];
        
        for(int i = 0; i< n ; i++){
            
            arr[i+1] = nums[i]+ arr[i];
        }
          
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i =0; i<arr.length ; i++){
            
            while(!dq.isEmpty() && arr[i] - arr[dq.peek()] >= k ){
                
                ans = Math.min(ans, i - dq.poll());
            }
            
            while(!dq.isEmpty() && arr[i] <= arr[dq.peekLast()]  ){
                 dq.pollLast();
            }
            
            dq.add(i);
        }
            
        
        return ans <= n ? ans : -1;
    }
}