class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> list=new ArrayList<>();
        int ans[]=new int[queries.length];
        for(int i=1;i<=m;i++){
            list.add(i);
        }
        
        for(int i=0;i<queries.length;i++){
            int n=queries[i];
            int pos=list.indexOf(n);
            list.remove(Integer.valueOf(n));
            list.add(0,n);
            
            ans[i]=pos;
        }
        
        return ans;
    }
}