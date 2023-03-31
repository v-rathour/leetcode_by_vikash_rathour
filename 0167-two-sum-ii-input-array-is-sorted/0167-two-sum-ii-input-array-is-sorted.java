class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])==false){
                List<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
            else{
               List<Integer> list=map.get(nums[i]);
                list.add(i);
                map.put(nums[i],list);
            }
        }
        
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            List<Integer> list=map.get(a);
            list.remove(0);
            map.put(a,list);
            
            int b=target-a;
            
            if(map.containsKey(b)){
                arr[0]=i+1;
                arr[1]=map.get(b).get(0)+1;
                break;
            }
            
            
        }
        
        return arr;
    }
}