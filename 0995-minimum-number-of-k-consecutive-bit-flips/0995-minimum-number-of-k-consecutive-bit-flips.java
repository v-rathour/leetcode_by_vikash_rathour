class Solution {
    public int minKBitFlips(int[] nums, int k) {
        
        int flipcount = 0;
        int flip = 0;
        
        for(int i = 0;i<nums.length;i++){
            
            if(i>=k && nums[i-k] == 5){
                flipcount--;
            }
            
            if(flipcount%2 == nums[i]){
                if((i+k)>nums.length){
                    return -1;
                }
                
                flipcount++;
                flip++;
                nums[i] = 5;
            }
        }
        
        return flip;
    }
}