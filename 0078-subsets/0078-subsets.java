class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        Sub_set(nums,0,list,result);
        return result;
    }
     public static void Sub_set(int nums[],int indx,List<Integer> list,List<List<Integer>> result){
         if(indx==nums.length){
    
             result.add(new ArrayList<>(list));
             return;
         }
        
         Sub_set(nums,indx+1,list,result);
         list.add(nums[indx]);
         Sub_set(nums,indx+1,list,result);
         list.remove(list.size()-1);
          
     }
}