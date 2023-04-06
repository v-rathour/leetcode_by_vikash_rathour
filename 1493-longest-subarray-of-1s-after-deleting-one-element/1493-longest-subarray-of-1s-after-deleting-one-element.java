class Solution {
    public int longestSubarray(int[] nums) {
        return Sliding_window(nums);
    }
    public int Sliding_window(int nums[]){
        int si=0;
        int ei=0;
        int zeros=0;
        int ans=Integer.MIN_VALUE;
        
        while(ei<nums.length){
            //grow the sliding window
             if(nums[ei]==0){
                 zeros++;
             }
            // srink the sliding window
             while(zeros>1){
                 if(nums[si]==0){
                     zeros--;
                 }
                 si++;
             }
            // calculate answer
            ans=Math.max(ans,(ei-si+1-zeros));
            ei++;
        }
        if(zeros!=1){
            ans--;
        }
        return ans;
    }
}