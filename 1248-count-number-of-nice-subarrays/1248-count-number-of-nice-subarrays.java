class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }
    public int atMost(int[] nums, int k) {
        if(k < 0)return 0;

        int start = 0, n = nums.length;
        int ans = 0;
        int countOdd = 0;
        for(int end = 0; end < n; end++) {
            countOdd += nums[end]%2;
            while(countOdd > k) {
                countOdd -= nums[start++]%2;
            }
            ans += end-start +1;
        }
        
        return ans;
    }
}