class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int si = 0;
        int ei = 0;
        int n = nums.length;
        int sum = 1;
        
        int ans = 0;
        
        while(ei<n){
            
            sum *= nums[ei];
            
            while(sum>=k && si<=ei){
                sum /= nums[si];
                si++;
            }
            
            ans += (ei-si+1);
            
            ei++;
            
        }
        
        return ans;
        
    }
}