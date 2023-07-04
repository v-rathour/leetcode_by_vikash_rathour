class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i]) == false){
                map.put(nums[i],1);
                
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
            
        }
        
        for(int n : map.keySet()){
            
            if(map.get(n) == 1){
                return n;
            }
        }
        
        return -1;
        
    }
}