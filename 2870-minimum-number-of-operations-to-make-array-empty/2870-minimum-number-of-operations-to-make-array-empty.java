class Solution {
    public int minOperations(int[] nums) {
        
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        int ans = 0;
        for(int key:map.keySet()){
            int freq = map.get(key);
            if(freq == 1){
                 return -1;
            }
            int temp = freq%3;
            if(temp == 0){
                ans += (freq/3);
            }
            else if(temp == 2){
                ans += (freq/3)+1;
            }
            else{
                
                
                ans += ((freq/3)-1)+2;
            }
            
        }
        
        return ans;
        
    }
}