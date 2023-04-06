class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        return Kidanas_Algorithm(nums);
    }
    
    public int Kidanas_Algorithm(int []nums){
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num!=0){
                count++;
            }
            else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}