class Remove_Duplicates_Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])==false){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        int i=0;
        for(int n:map.keySet()){
            
            if(map.get(n)>=2){
                    nums[i++]=n;
                    nums[i++]=n;
                    ans +=2;
            }
            if(map.get(n)<2){
                    
                    nums[i++]=n;
                    ans +=map.get(n);
            }
                  
        }
        Arrays.sort(nums,0, ans);
        return ans;
    }
}
