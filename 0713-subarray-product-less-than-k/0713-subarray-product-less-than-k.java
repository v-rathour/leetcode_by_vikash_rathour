class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return SubArray(nums,k);
        
    }
    public static int SubArray(int[] nums,int k){
        int ans=0;
        int si=0;
        int ei=0;
        int p=1;
        while(ei<nums.length){
            //grow
            p*=nums[ei];
            //shrik
            while(p>=k && si<=ei){
                p/=nums[si];
                si++;
            }
            //anscalculate
            ans=ans+(ei-si+1);
            ei++;
        }
        return ans;
    
}
}