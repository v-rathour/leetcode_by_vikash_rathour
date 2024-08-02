class Solution {
    public int minSwaps(int[] nums) {
        
        int totalOnes = 0, curr1=0;
        int ans = Integer.MAX_VALUE;
        
        for(int num : nums) 
            if(num == 1) 
                totalOnes++;
        
        for(int i =0; i < totalOnes; ++i) 
            if(nums[i] == 1) 
                curr1++;
        
        ans = Math.min(ans, totalOnes - curr1);
        for(int i =totalOnes; i < 2*nums.length ; ++i){
            
            int nextIdx = (i)%nums.length;
            int prevIdx = (i-totalOnes)%nums.length;
            
            
            if(nums[nextIdx]==1)curr1++;
            if(nums[prevIdx]==1) curr1--;
            
            ans = Math.min(ans, totalOnes - curr1);
        
        }
        return ans;
    }
}