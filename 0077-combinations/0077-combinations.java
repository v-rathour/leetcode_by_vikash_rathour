class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        PrintCombination(list,1,n,k,0,result);
       return result;
    }
    public static void PrintCombination(List<Integer> list,int row,int n,int target,int count,List<List<Integer>> result){
        if(count>target){
            return;
        }
        if(count==target){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i =row; i <=n ; i++) {
            list.add(i);
            PrintCombination(list,i+1,n,target,count+1,result);
            list.remove(list.size()-1);
        }

    }
}