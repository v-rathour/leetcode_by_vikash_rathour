class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n-k+1];
        
        Deque<Integer> dq=new ArrayDeque<>();
        
        for(int i=0;i<nums.length;i++){
            // delete the all index whene window size greater then k
            while(dq.size()>0 && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            // delete all index form the dequeue which is small to the nums[i]
           while(dq.size()>0 && nums[dq.peekLast()]<nums[i]){
                 
               dq.pollLast();
            }
            //add the index in the dequeue
            dq.offerLast(i);
            
            // calculate answer
            if(i>=k-1){
                
                arr[i-k+1]=nums[dq.peekFirst()];
            }
            
        }
        
        return arr;
    }
    
}