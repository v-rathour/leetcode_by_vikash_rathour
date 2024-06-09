class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0, sum = 0;
        Map<Integer, Integer> carry = new HashMap<>();
        carry.put(0,1);
        for (int num : nums){
            if (num < 0) num += k * 10000;  
            sum = (sum + num) % k;
            ans += carry.getOrDefault(sum, 0);
            carry.put(sum, carry.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}