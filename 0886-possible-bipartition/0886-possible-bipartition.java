class Solution {
    
    HashMap<Integer,List<Integer>> Adj;
    

    
    public boolean possibleBipartition(int n, int[][] dislikes) {
         Adj = new HashMap<>();
        
        for(int i = 1;i<=n;i++){
            Adj.put(i,new ArrayList<>());
        }
        
        for(int []a:dislikes){
            int str = a[0];
            int end = a[1];
            
            Adj.get(str).add(end);
            Adj.get(end).add(str);
        }
        
        int visited[] = new int[n+1];
        Arrays.fill(visited,-1);

        for (int i = 1; i <visited.length; i++) {

            if(visited[i]==-1){
                if(!CheckBipartite(i,visited,dislikes)){
                    return false;
                }
            }
        }

        return true;
        
    }
    
    public  class Pair{
        int value;
        int level;
        public Pair(int value,int level){
            this.value=value;
            this.level=level;
        }
    }

    public  boolean CheckBipartite(int src,int[] visited,int[][] dislikes){

        Queue<Pair> q=new ArrayDeque<>();

        q.add(new Pair(src,0));

        while(!q.isEmpty()){
            Pair rem=q.poll();

            if(visited[rem.value] != -1){
                if(rem.level != visited[rem.value]){
                    return false;
                }
            }
            else{
                visited[rem.value]=rem.level;
            }

            List<Integer> list = Adj.get(rem.value);
            for(int i = 0;i<list.size();i++){
                if(visited[list.get(i)] == -1){
                    q.add(new Pair(list.get(i), rem.level+1));
                }
            }
        }

        return true;
    }
}