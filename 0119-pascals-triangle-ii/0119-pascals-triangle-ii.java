class Solution {
    public List<Integer> getRow(int rowIndex) {
        int row=0;
        List<Integer> list=new ArrayList<Integer>();
        int ans[] = new int[rowIndex+1];
        ans[0] = 1;
        for(int i = 0 ; i< rowIndex ; i++){
            for(int j = 1 ; j<= rowIndex-i ; j++){
                ans[j] =  ans[j]+ans[j-1];
            }
            
        }
        for(int i:ans)
            list.add(i);
        return list;
    }
}
