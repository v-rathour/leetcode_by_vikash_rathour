class Solution {
    
    public int findMaxLength(int[] nums) {
        
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int longestsum = 0;
        
        for(int i = 0;i<nums.length;i++){
            
            sum += nums[i] == 0?-1:1;
            
            if(sum == 0){
                longestsum = Math.max(longestsum,i+1);
            }
            else if(map.containsKey(sum)){
                longestsum = Math.max(longestsum,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
            
        }
        
        
        return longestsum;
        
        
    }
}