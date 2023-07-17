class Solution {
    public int maximumSum(int[] nums) {
        
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int copy = nums[i];
            int sum = 0;
            while(copy != 0){
                
                int rem = copy%10;
                sum += rem;
                copy /= 10;
                
            }
            
            if(map.containsKey(sum) == false){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                map.put(sum,list);
            }
            else{
                
                List<Integer> list = map.get(sum);
                list.add(nums[i]);
                map.put(sum,list);
            }
        }
        
        int ans = -1;
        
        for(int val : map.keySet()){
            
            List<Integer> list = map.get(val);
            int sum = -1;
            
            if(list.size()>=2){
                sum = 0;
                Collections.sort(list);
                sum += (list.get(list.size()-2)+list.get(list.size()-1));
            }
            
            ans = Math.max(ans,sum);
        }
        
        return ans;
        
    }
}