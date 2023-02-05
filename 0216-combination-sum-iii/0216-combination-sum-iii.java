class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        combination(k,n,0,0,list,result,1);
        return result;
    }
    public static void combination(int k,int n,int count,int sum,List<Integer> list,List<List<Integer>> result,int start){
        if(count==k){
            if(sum==n)
                result.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<=9;i++){
            sum +=i;
            list.add(i);
            combination(k,n,count+1,sum,list,result,i+1);
            list.remove(list.size()-1);
            sum -=i;
        }
    }
}