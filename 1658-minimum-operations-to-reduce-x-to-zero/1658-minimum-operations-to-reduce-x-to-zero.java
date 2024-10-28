class Solution {
    public int minOperations(int[] nums, int x) {
        
        int total_sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
         map.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            total_sum += nums[i];
            map.put(total_sum,i);
        }
        
        if(total_sum<x){
            return -1;
        }
        
        int target = total_sum-x;
        
        
        
        int sum = 0;
        int ans = Integer.MIN_VALUE;
       
        for(int i = 0;i<nums.length;i++){
            
            sum += nums[i];
            
            if(map.containsKey(sum-target)){
                int indx = map.get(sum-target);
                ans = Math.max(ans,i-indx);
            }
            
           
            
        }
        
        if(ans == Integer.MIN_VALUE){
            return -1;
        }
        
        return nums.length-ans;
        
    }
}