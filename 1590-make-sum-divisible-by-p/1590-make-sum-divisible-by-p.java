class Solution {
    public int minSubarray(int[] nums, int p) {
        
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = (sum+nums[i])%p;
        }
        
        if(sum == 0){
            return 0;
        }
        
       HashMap<Integer,Integer> map = new HashMap<>();
       
        int prefix_sum = 0;
        int ans = nums.length;
        map.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            prefix_sum = (prefix_sum+nums[i])%p;
            int check = (prefix_sum - sum + p)%p;
            
            if(map.containsKey(check)){
                ans = Math.min(ans,i-map.get(check));
            }
            
            map.put(prefix_sum,i);
        }
        
        if(ans == nums.length){
            return -1;
        }
        
        return ans;
        
    }
    
    
}