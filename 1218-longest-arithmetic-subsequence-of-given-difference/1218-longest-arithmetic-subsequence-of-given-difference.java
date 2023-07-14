class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 1;
        
        for (int val : arr) {
            
            int preNum = map.getOrDefault(val - difference, 0);
            map.put(val, preNum + 1);
            ans = Math.max(ans, map.get(val));
        }
        
        return ans;
    }
}