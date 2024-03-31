class Solution {
    public long countSubarrays(int[] nums, int mink, int maxk) {
        
        int ei = 0;
        int n = nums.length;
        int minposition = -1;
        int maxposition = -1;
        int culpritindx = -1;
        long ans = 0;
        while(ei<n){
            
           if(nums[ei]<mink || nums[ei]>maxk){
               culpritindx = ei;
           }
            
            if(nums[ei] == mink){
                minposition = ei;
            }
            
            if(nums[ei] == maxk){
                maxposition = ei;
            }
            
            int smaller = Math.min(minposition,maxposition);
            
            int temp = smaller - culpritindx;
            
            ans += temp<=0?0:temp;
            ei++;
        }
        
        return ans;
        
    }
}