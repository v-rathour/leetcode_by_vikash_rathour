class Solution {
    
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int ans = Integer.MIN_VALUE;
        
        int i = 0;
        int j = nums.length-1;
        
        while(i<j){
            ans = Math.max(ans,nums[i]+nums[j]);
            i++;
            j--;
        }
        
        return ans;
        
    }
}