class Solution {
    
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int i = 0;i<groupSizes.length;i++){
            
            if(map.containsKey(groupSizes[i]) == false){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(groupSizes[i],list);
            }
            else{
                List<Integer> list = map.get(groupSizes[i]);
                list.add(i);
                map.put(groupSizes[i],list);
            }
            
            
            
            if(groupSizes[i] == map.get(groupSizes[i]).size()){
                answer.add(map.remove(groupSizes[i]));
                
            }
        }
        
        
        return answer;
        
    }
}