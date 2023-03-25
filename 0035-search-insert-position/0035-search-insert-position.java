class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int k=0;
        int flag=0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                flag=1;
                break;
            }
        }
        if(flag!=1)
        {
            for(i=0;i<nums.length;i++){
                if(nums[i]<target)
                    continue;
                else
                    return i;
            }
           return i;
        }
        else
            return i;
    }
}
