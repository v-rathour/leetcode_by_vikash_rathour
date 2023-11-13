class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int last=1;
        while(last<nums.length)
        {
            if(nums[i]!=nums[last])
                nums[++i]=nums[last];
            last++;
        }
        return i+1;
    }
}