class Solution {
    
    public int maximumLength(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int max = map.containsKey(1)?(map.get(1)%2 == 0?map.get(1)-1:map.get(1)):1;
        
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            int val = nums[i];
            while(map.containsKey(val )&& map.get(val)>=2 && val != 1){
                count += 2;
                val *= val;
            }
            
            if(map.containsKey(val)){
                count++;
            }
            
            else{
                count--;
            }
            
            max = Math.max(max,count);
        }
        
        return max;
        
    }
}