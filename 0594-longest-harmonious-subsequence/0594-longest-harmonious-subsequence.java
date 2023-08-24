class Solution {
    
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                list.add(nums[i]);
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        Collections.sort(list);
        
        int count = 0;
        int i = 0;
        int j = 1;
        
        while(j<list.size()){
            int num1 = list.get(j);
            int num2 = list.get(i);
            
            if((num1-num2) == 1){
                count = Math.max(count,(map.get(num1)+map.get(num2)));
            }
            i++;
            j++;
        }
        
        return count;
    }
}