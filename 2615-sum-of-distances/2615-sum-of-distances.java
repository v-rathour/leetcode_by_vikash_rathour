class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long [] ans = new long[nums.length];
        
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        //store data
        for(int i=0; i<n; i++){
            
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }

            map.get(nums[i]).add(i);
        }
        
        
        for(Map.Entry<Integer, List<Integer>> en :map.entrySet()){
            List<Integer> list = en.getValue();
            
            // no other indexes are avaialble
            if(list.size() == 1){
                ans[list.get(0)] = 0;
            }
            else{

                //get sum of all indexes
                long nextSum = 0;
                for(int num : list){
                    nextSum += num;
                }
                
                //prefix sum
                long prevSum = 0;
                int size = list.size();
                
                for(int i=0; i<size; i++){

                    //we can add these indexes directly becuase they are already greater than current index
                    //since we had loop to 0->n list is already sorted
                   
                    long tmp = nextSum - ((long)(size - i)* list.get(i));
                    
                    //prev indexes that are smaller than current index for them we need to find abs difference
                    tmp += Math.abs(prevSum - (long) i*list.get(i));
                    
                    ans[list.get(i)] = tmp;
                    
                    nextSum -= list.get(i);
                    prevSum += list.get(i);
                   
                }
            }
        }
        
        return ans;
    }
}