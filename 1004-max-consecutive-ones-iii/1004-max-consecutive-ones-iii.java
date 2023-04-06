class Solution {
    public int longestOnes(int[] nums, int k) {
        return Sliding_window(nums,k);
    }
    
    public int Sliding_window(int nums[],int k){
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
             while(zeros>k){
                 if(nums[si]==0){
                     zeros--;
                 }
                 si++;
             }
            // calculate answer
            ans=Math.max(ans,(ei-si+1));
            ei++;
        }
        // return the answer of maximum sliding window ones by replace zeros
        return ans;
    }
}