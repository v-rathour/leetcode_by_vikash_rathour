

class Solution {
    public void Subsequence(int[] nums,int i,List<Integer> ds,HashSet<List<Integer>> res,int prev)
    {
        if(i==nums.length)
        {
            if(ds.size()>=2)
                res.add(new ArrayList<Integer> (ds));
            return;
        }
        
        if(prev==-1 || nums[i]>=nums[prev])
        {
            ds.add(nums[i]);
            Subsequence(nums,i+1,ds,res,i);
            ds.remove(ds.size()-1);
        }
        Subsequence(nums,i+1,ds,res,prev);
    }
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>> res=new LinkedHashSet<>();
        
        Subsequence(nums,0,new ArrayList<>(),res,-1);
        
        List<List<Integer>> answer = new ArrayList<>();
        
        for(List<Integer> arr : res)
            answer.add(new ArrayList<Integer>(arr));
       
        return answer;
        
    }
}