class Solution {
    
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        
        int ei = 0;
        int si = 0;
        int count = 0;
        long result = 0;
        
        while(ei<nums.length){
            
            int temp = nums[ei];
            
            if(temp == max){
                count++;
            }
            
            if(count>=k){
                while(count>=k){
                    result += n-ei;
                    if(nums[si] == max){
                         count--;
                    }
                    si++;
                }
            }
                    
            
            
            ei++;
            
        }
        return result;
        
    }
}