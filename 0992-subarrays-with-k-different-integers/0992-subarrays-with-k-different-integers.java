class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return findSubarray(nums,k)-findSubarray(nums,k-1);
    }
    
    public int findSubarray(int []nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int i = 0;
        int j = 0;
        int n = nums.length;
        int count = 0;
        while(j<n){
            int num = nums[j];
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
            
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                i++;
            }
            
            count += (j-i+1);
            j++;
        }
        
        return count;
        
    }
}