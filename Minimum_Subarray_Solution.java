class Subarray_Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        return Minimum_SubArray_sum(nums,target);
    }
    public static int Minimum_SubArray_sum(int nums[],int target){
        int ei=0;
        int si=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int n=nums.length;
        while(ei<n){
            sum +=nums[ei];
            if(sum>=target){
                while(sum>=target && si<=ei){
                sum -=nums[si];
                si++;
               }
               ans=Math.min(ans,ei-si+2);
            }
                ei++;
        }
        return ans==Integer.MAX_VALUE?0:ans;

    }
}
