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
            
             if(nums[ei]==0){
                 zeros++;
             }
            
             while(zeros>k){
                 if(nums[si]==0){
                     zeros--;
                 }
                 si++;
             }
            
            ans=Math.max(ans,(ei-si+1));
            ei++;
        }
        
        return ans;
    }
}