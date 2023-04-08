class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                return i-1;
            }
        }
        if(nums[nums.length-2]<nums[nums.length-1]){
            return nums.length-1;
        }
        return 0;
    }
}