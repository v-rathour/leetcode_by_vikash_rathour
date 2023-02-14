class Solution {
    public int[][] merge(int[][] intervals) {
        // sort the array based on the indexing 
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        ArrayList<int[]> list=new ArrayList<>();
        for(int[] interval:intervals){
            // It is execute only once time when list is empty 
            if(list.size()==0){
                list.add(interval);
            }
            else{
                // find the second index element of the previous store interval in list
                int[] previousNum=list.get(list.size()-1);
                if(previousNum[1]>=interval[0]){
                    // it is execute when previous and current interval is overlapping
                    previousNum[1]=Math.max(previousNum[1],interval[1]);
                }
                else{
                    // it is execute when interval is not overlapping
                  list.add(interval);
                }
            }
        }
       return list.toArray(new int[list.size()][]);
    }
}