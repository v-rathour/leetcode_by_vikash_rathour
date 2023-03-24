class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }
    public int atMost(int[] nums, int k) {
        if(k < 0)return 0;

        int si = 0, n = nums.length;
        int ans = 0;
        int countOdd = 0;
        int ei=0;
        while(ei<n){
            countOdd +=nums[ei]%2;
            
            while(countOdd>k){
                countOdd -=nums[si++]%2;
                
            }
            
            ans +=(ei-si+1);
            ei++;
        }
        
        return ans;
    }
}