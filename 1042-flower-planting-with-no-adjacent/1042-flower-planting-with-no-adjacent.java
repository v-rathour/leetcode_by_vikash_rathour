class Solution {
    
    HashMap<Integer,List<Integer>> adj;
    public int[] gardenNoAdj(int n, int[][] paths) {
        adj = new HashMap<>();
        
        for(int i = 0;i<n;i++){
           adj.put(i,new ArrayList<>());
        }
        
        for(int []a : paths){
            int st = a[0];
            int en = a[1];
            
            adj.get(st-1).add(en-1);
            adj.get(en-1).add(st-1);
        }
        
       int answer[] = new int[n];
        for(int i = 0;i<answer.length;i++){
            if(answer[i] == 0){
                findBestGardenCombination(i,answer);
            }
        }
        
        return answer;
    }
    
    public void findBestGardenCombination(int src,int[] answer){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        
        answer[src] = 1;
        while(!q.isEmpty()){
            
            int rem = q.remove();
            int color = answer[rem];
            
            List<Integer> list = adj.get(rem);
            
            for(int i = 0;i<list.size();i++){
                
               if(answer[list.get(i)] == 0|| answer[list.get(i)] == color){
                    answer[list.get(i)] = color == 4?1:color+1;
                    q.add(list.get(i));
               }
            } 
        }
    }
}