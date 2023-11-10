class Solution {
    public int[] restoreArray(int[][] pairs) {
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        for(int i=0;i<pairs.length;i++){
            hm.putIfAbsent(pairs[i][0],new ArrayList<Integer>());
            hm.putIfAbsent(pairs[i][1],new ArrayList<Integer>());
            hm.get(pairs[i][0]).add(pairs[i][1]);
            hm.get(pairs[i][1]).add(pairs[i][0]);
        }
        int ans[] = new int[pairs.length+1];
        int startingEle = Integer.MAX_VALUE;
        for(Integer key : hm.keySet()){
            if(hm.get(key).size() == 1){
                startingEle = key;
                ans[0] = startingEle;
                ans[1] = hm.get(key).get(0);
                break;
            }
        }
        for(int i=1;i<ans.length-1;i++){
            int temp1 = hm.get(ans[i]).get(0);
            int temp2 = hm.get(ans[i]).get(1);
            ans[i+1] = temp1==ans[i-1]?temp2:temp1;
        }
        return ans;
    }
}