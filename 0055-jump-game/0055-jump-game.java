class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        if(nums[0]==0 && nums.length>1) return false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                if(max>i+nums[i]) continue;
                else return false;
            }
            if(i+nums[i]>max){
                max = i+nums[i];
            }
        }
        if(max>=nums.length-1) return true;
        return false;
    }
}