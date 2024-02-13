class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        for(int i = 31;i>=0;i--){
            int ones = 0;
            int zeros = 0;
            
            for(int val : nums){
                if((val & (1<<i)) != 0){
                    ones++;
                }
                else{
                    zeros++;
                }
            }
            
            ans += (ones*zeros);
        }
        
        return ans;
        
    }
}