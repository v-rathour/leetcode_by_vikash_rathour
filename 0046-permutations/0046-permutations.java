class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> array = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        permutation(array,list,result);
        return result;
    }
    public static void permutation(List<Integer> array,List<Integer> list,List<List<Integer>> result){
        if(array.size()==0){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<array.size();i++){
            int num=array.get(i);
            array.remove(i);
            list.add(num);
            permutation(array,list,result);
            list.remove(list.size()-1);
            array.add(i,num);
        }
    }
     
}