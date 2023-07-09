class Solution {
    public long putMarbles(int[] weight, int k) {
        
        if(weight.length == 1 || weight.length == k){
            return 0;
        }
        
        long min = weight[0]+weight[weight.length-1];
        long max = weight[0]+weight[weight.length-1];
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<weight.length-1;i++){
            list.add(weight[i]+weight[i+1]);
        }
        
        Collections.sort(list);
        
        for(int i=0,j=list.size()-1;i<k-1;i++,j--){
            min  += list.get(i);
             max += list.get(j);
        }
        
        
        return max-min;
    }
}