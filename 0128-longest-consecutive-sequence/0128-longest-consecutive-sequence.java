class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        for(int num : nums){
            
            map.put(num,true);
        }
        
        for(int val:nums){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
        }
        
        int ans = 0;
        
        for(int i=0;i<nums.length;i++){
            
            if(map.get(nums[i])){
               int n = ConsecutiveSequence(nums[i],map);
               ans = Math.max(ans,n);
            }
        }
        
        return ans;
        
    }
    
    public int ConsecutiveSequence(int start, HashMap<Integer,Boolean> map){
        
        int i = start;
        int count = 0;
        
        while(map.containsKey(i)){
            count++;
            i++;
        }
        
        return count;
    }
}