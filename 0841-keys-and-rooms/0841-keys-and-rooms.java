class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
         Queue<Integer> queue = new LinkedList<>();
         HashSet<Integer> set = new HashSet<>();
        
         queue.add(0);
         set.add(0);
        
         while(!queue.isEmpty()){
             
             int rem = queue.poll();
             for(int node : rooms.get(rem)){
                 if(set.contains(node)==false){
                     queue.add(node);
                     set.add(node);
                 }
             }
         }
        
        return set.size()==rooms.size();
    }
}