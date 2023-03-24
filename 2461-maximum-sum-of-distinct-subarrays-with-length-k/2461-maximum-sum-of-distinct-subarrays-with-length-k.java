class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<k;i++){
            sum+=nums[i];
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        if(hm.size()==k) 
            ans = Math.max(sum,ans);
        
        for(int i=k;i<nums.length;i++){
            
            int val = hm.get(nums[i-k]);
            
            if(val==1) {
                hm.remove(nums[i-k]);
            }
            else{ 
                hm.put(nums[i-k],val-1);
            }
            sum-=nums[i-k];
            
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            
            sum+=nums[i];
            
            if(hm.size()==k){ 
                ans = Math.max(ans,sum);
            }
        }
        return ans;
    }
}