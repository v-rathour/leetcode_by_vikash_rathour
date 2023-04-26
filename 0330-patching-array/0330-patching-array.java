class Solution {
    public int minPatches(int[] nums, int n) {
        long missing=1;
        int i=0;
        int count=0;
        while(missing<=n){
            
            if(i<nums.length && missing>=nums[i]){
                missing +=nums[i];
                i++;
            }
            else{
                missing +=missing;
                count++;
            }
        }
        
        return count;
    }
}