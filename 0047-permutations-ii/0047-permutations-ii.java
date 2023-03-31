class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
      List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        boolean arr1[]=new boolean[nums.length];
        
        permutation(nums,ans,list,0,arr1);
        return list;
    }
    static void permutation(int []arr,List<Integer> ans,List<List<Integer>> list,int       idx,boolean []arr1){ 
        if(idx==arr.length){
            
            if(!list.contains(ans)){
                
               list.add(new ArrayList<>(ans));
            }
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr1[i]==true){
                continue;
            }
            else{
            arr1 [i]=true;
            int temp=arr[i];
            ans.add(temp);
            permutation(arr,ans,list,idx+1,arr1);
            ans.remove(ans.size()-1);
            arr1 [i]=false;
        }
        }  
    }
}