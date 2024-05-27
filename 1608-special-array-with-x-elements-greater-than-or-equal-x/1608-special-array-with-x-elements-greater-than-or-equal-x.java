class Solution {
    public int specialArray(int[] nums) {
        int ans = -1;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(((nums.length-i) <= nums[i]) ){
               if((i>0) ){
                   if(((nums.length-i) > nums[i-1])){
                       ans = Math.max(ans,(nums.length-i));
                   }
               }
                else{
                     ans = Math.max(ans,(nums.length-i));
                }
            }
        }
        
        return ans;
    }
}