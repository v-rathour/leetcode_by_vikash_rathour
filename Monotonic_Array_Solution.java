class Monotonic_Array_Solution {
    public boolean isMonotonic(int[] nums) {
        int i=1;
        for(;i<nums.length;i++){
            if(nums[i-1]>nums[i])
                  break;
        }
        if(i==nums.length)
           return true;
        for(i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i])
               break;
        }
        if(i==nums.length)
           return true;
        return false;
    }
}
