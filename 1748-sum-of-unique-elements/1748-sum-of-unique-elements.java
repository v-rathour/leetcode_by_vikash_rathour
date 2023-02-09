class Solution {
    public int sumOfUnique(int[] nums) {
        // create the hashmap to store unique element and thier frequency 
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            // add the element in the hashmap 
            if(map.containsKey(nums[i])==false){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int sum=0;
        for (Map.Entry<Integer, Integer> set :map.entrySet()) {
              // sum of the unique element 
              if(set.getValue()==1){
                  sum +=set.getKey();
              }
            
        }
        return sum;
    }
}