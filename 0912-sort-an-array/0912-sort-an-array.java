class Solution {
    public int[] sortArray(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int j = 0;
        for(int key:map.keySet()){
            int count = map.get(key);
            while(count != 0){
                nums[j] = key;
                count--;
                j++;
            }
        }
        
        return nums;
    }
}