
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        CombinationPermutation(candidates,target,0,list,result);
        return result;
    }
    public static void CombinationPermutation(int []arr,int target,int row,List<Integer> list,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=row;i<arr.length;i++){
            if(target>=arr[i]){
                list.add(arr[i]);  
                CombinationPermutation(arr,target-arr[i],i,list,result);
                list.remove(list.size()-1);
            }
        }
    }
}