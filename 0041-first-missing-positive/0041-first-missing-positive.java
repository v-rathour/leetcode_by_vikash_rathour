class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        int i = 1;
        while(set.contains(i)){
            i++;
        }
        
        return i;
        
    }
}