class Solution {
    public List<List<Integer>> generate(int numRows) {
        int row=0;
        List<List<Integer>> list=new ArrayList();
        while(row<numRows){
            int i=0;
            int val=1;
            List<Integer> list1=new ArrayList();
            while(i<=row){
                list1.add(val);
                val=((row-i)*val)/(i+1);
                i++;
            }
            list.add(list1);
            row++;
        }
        return list;
    }
}